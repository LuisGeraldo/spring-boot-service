package com.prj.vivienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.prj.vivienda.converter.Converter;
import com.prj.vivienda.entities.Hogar;
import com.prj.vivienda.model.HogarModel;
import com.prj.vivienda.repository.IHogarRepository;
import com.prj.vivienda.url.Mapping;

@Service(Mapping.hogarService)
public class HogarService {
	@Autowired
	@Qualifier(Mapping.hogarRepository)
	private IHogarRepository repository;
	
	
	@Autowired
	@Qualifier(Mapping.converter)
	private Converter converter;
	
	
	public Hogar crear(Hogar hogar) {
		try {
			return repository.save(hogar);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	

	public Hogar actualizar(Hogar hogar) {
		try {
			return repository.save(hogar);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public Hogar eliminar(Integer id) {
		try {
			Hogar hogar = repository.findById(id);
			repository.delete(hogar);
			
			return hogar;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public Hogar buscarPorId(Integer id) {
		try {
			Hogar hogar = repository.findById(id);	
			return hogar;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
	}
	
	public List<HogarModel> findAll(){
		return converter.converterHogar(repository.findAll());
	}
}
