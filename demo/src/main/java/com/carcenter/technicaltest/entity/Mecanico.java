package com.carcenter.technicaltest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.carcenter.technicaltest.exception.ColumnasObligatoriasException;


@Entity
@Table(name="mecanicos")
public class Mecanico {
	
	@Id
	private String documento;
	
	@Column(name="tipo_documento")
	private String tipoDocumento;
	
	@Column(name="primer_nombre")
	private String primerNombre;
	
	@Column(name="segundo_nombre")
	private String segundoNombre;
	
	@Column(name="primer_apellido")
	private String primerApellido;
	
	@Column(name="segundo_apellido")
	private String segundoApellido;
	
	
	private String telefono;
	
	private String direccion;
	
	@Column(name="email")
	private String email;
	
	private Character estado;
	
	 
	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getEstado() {
		return estado;
	}

	public void setEstado(Character estado) {
		this.estado = estado;
	}
	
	/**
	 * Valida los campos obligatorios 
	 * @throws ColumnasObligatoriasException en caso de que alguno de los campos obligatorios sea null
	 */
	public void validar() throws ColumnasObligatoriasException {
		if(this.tipoDocumento == null || this.email == null) {
			throw new ColumnasObligatoriasException("Recuerde llenar todas las columas obligatorias");
		}
	}

}
