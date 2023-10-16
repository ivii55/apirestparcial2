package com.utn.ApiRest.services;

import com.utn.ApiRest.entities.Persona;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface PersonaService  extends BaseService <Persona,Long> {

    List<Persona > serach (String filtro ) throws Exception;

    Page<Persona> serach (String filtro, Pageable pageable) throws Exception;




}
