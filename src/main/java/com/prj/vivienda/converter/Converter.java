package com.prj.vivienda.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.prj.vivienda.entities.Hogar;
import com.prj.vivienda.model.HogarModel;
import com.prj.vivienda.url.Mapping;

@Component(Mapping.converter)
public class Converter {
	
	public List<HogarModel> converterHogar(List<Hogar> listHogar){
		List<HogarModel> hogarModel = new ArrayList<>();
		
		for(Hogar hr: listHogar) {
			hogarModel.add(new HogarModel(hr));
		}
		
		return hogarModel;
	}
}
