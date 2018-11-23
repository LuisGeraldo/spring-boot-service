package com.prj.vivienda.model;

import com.prj.vivienda.entities.Hogar;

public class HogarModel {
	
	private Integer id;
	private String direccion;
	private String telefono;
	
	public HogarModel() {
	
	}

	public HogarModel(Integer id) {
		this.id = id;
	}

	public HogarModel(Hogar hogar) {
		this.id = hogar.getId();
		this.direccion = hogar.getDireccion();
		this.telefono = hogar.getTelefono();
	}
	
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	

}
