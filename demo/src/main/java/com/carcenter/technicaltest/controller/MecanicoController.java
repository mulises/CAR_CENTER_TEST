package com.carcenter.technicaltest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carcenter.technicaltest.entity.Mecanico;
import com.carcenter.technicaltest.exception.ColumnasObligatoriasException;
import com.carcenter.technicaltest.service.IMecanicoService;

@CrossOrigin(origins = "*")
@RequestMapping("api-car-center/")
@RestController
public class MecanicoController {
	
	@Autowired
	private IMecanicoService mecanicoSvc;
	
	@PostMapping("/mecanico")
	public ResponseEntity<?> saveMecanico(@RequestBody Mecanico mecanico) {
		try {
			Mecanico mecanicoCreado = mecanicoSvc.save(mecanico);
			return new ResponseEntity<>(mecanicoCreado, HttpStatus.CREATED);
		} catch (ColumnasObligatoriasException e) {
			// TODO Auto-generated catch block
			return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@GetMapping("/mecanico/disponible")
	public ResponseEntity<?> encontrarMecanicosDisponiblesAsignacion() {
		return new ResponseEntity<>(mecanicoSvc.encontrarMecanicosDisponiblesParaAsignacion(), HttpStatus.OK);
	}

}
