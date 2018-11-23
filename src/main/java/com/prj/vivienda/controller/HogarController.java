package com.prj.vivienda.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prj.vivienda.entities.Hogar;
import com.prj.vivienda.model.HogarModel;
import com.prj.vivienda.service.HogarService;
import com.prj.vivienda.url.Mapping;

@RestController
@RequestMapping(Mapping.hogarController)

public class HogarController {
	@Autowired
	@Qualifier(Mapping.hogarService)
	private HogarService service;
	
	
	@PostMapping(Mapping.crearHogar)
	public Hogar crear(@RequestBody @Valid Hogar hogar) {
		return service.crear(hogar);
	}
	
	@GetMapping(Mapping.mostrarHogares)
	public List<HogarModel> findAll(){
		return service.findAll();
	}	
	
	@PutMapping(Mapping.actualizarHogar)
	public Hogar actualizar(@RequestBody @Valid Hogar hogar) {
		return service.actualizar(hogar);
	}
	
	@DeleteMapping(Mapping.eliminarHogar)
	public Hogar actualizar(@PathVariable("id") Integer id) {
		return service.eliminar(id);
	}
	
	@GetMapping(Mapping.mostrarHogarId)
	public Hogar mostrarHogarId(@PathVariable("id") Integer id){
		return service.buscarPorId(id);
	}	
}
