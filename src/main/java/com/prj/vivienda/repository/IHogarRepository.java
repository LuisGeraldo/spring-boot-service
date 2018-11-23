package com.prj.vivienda.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prj.vivienda.entities.Hogar;
import com.prj.vivienda.url.Mapping;

@Repository(Mapping.hogarRepository)
public interface IHogarRepository extends JpaRepository<Hogar, Serializable>{
	public abstract Hogar findById(Integer id);
	public abstract List<Hogar> findByDireccion(String dirreccion);
	public abstract Hogar findByTelefono(String telefono);
}
