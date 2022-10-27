package com.carcenter.technicaltest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.carcenter.technicaltest.entity.Mecanico;

@Repository
public interface IMecanicoRepository extends JpaRepository<Mecanico, String>{
	
	@Query(value="{call sp_mecanicos_disponibles_asignacion()}", nativeQuery=true)
	public List<Mecanico> encontrarMecanicoDisponibleParaAsignacion(); 
}
