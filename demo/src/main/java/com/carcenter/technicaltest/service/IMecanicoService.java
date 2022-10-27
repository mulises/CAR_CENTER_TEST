package com.carcenter.technicaltest.service;

import java.util.List;

import com.carcenter.technicaltest.entity.Mecanico;
import com.carcenter.technicaltest.exception.ColumnasObligatoriasException;

public interface IMecanicoService {
	
	public Mecanico save(Mecanico mecanico) throws ColumnasObligatoriasException;
	
	public List<Mecanico> encontrarMecanicosDisponiblesParaAsignacion(); 
}
