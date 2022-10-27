package com.carcenter.technicaltest.service;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carcenter.technicaltest.entity.Mecanico;
import com.carcenter.technicaltest.exception.ColumnasObligatoriasException;
import com.carcenter.technicaltest.repository.IMecanicoRepository;


@Service
public class MecanicoService implements IMecanicoService {

	private static final Logger logger = Logger.getLogger(MecanicoService.class); 
	
	@Autowired
	private IMecanicoRepository mecanicoRepository;
	
	@Override
	public Mecanico save(Mecanico mecanico) throws ColumnasObligatoriasException {
		logger.debug("validación de campos obligatorios para mecanico");
		
		mecanico.validar();
		validarFormatoEmail(mecanico.getEmail());		
		
		logger.debug("inicia guardado...");
		return mecanicoRepository.save(mecanico);
	}
	
	private boolean validarFormatoEmail(String email) throws ColumnasObligatoriasException {
		Pattern patternEmail = Pattern
                .compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
		Matcher mather = patternEmail.matcher(email);
		
		if (!mather.find()) {
			logger.error("formato de email no valido");
            throw new ColumnasObligatoriasException("el email no cumple con el formato. Ej xxx@xxx.xxx");
        }
		
		return mather.find();
	}

	@Override
	public List<Mecanico> encontrarMecanicosDisponiblesParaAsignacion() {
		return mecanicoRepository.encontrarMecanicoDisponibleParaAsignacion();
	}

}
