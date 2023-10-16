package com.utn.ApiRest.services;

import com.utn.ApiRest.entities.Localidad;
import com.utn.ApiRest.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl  extends BaseServiceImpl <Localidad, Long> implements LocalidadService {

    public LocalidadServiceImpl (BaseRepository <Localidad, Long > baseRepository){
        super (baseRepository);
    }
}
