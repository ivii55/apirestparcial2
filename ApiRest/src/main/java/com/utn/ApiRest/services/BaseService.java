package com.utn.ApiRest.services;

import com.utn.ApiRest.entities.Base;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.io.Serializable;
import java.util.List;

public interface BaseService <E extends Base, ID extends Serializable> {

    // trae una lista de la BBDD
    public List<E> findAll() throws Exception;
    public Page<E> findAll (Pageable pageable) throws Exception;

    // obtiene una persona por el id que le pasamos
    public E findById(ID id) throws Exception;

    public E save ( E entity) throws Exception;

    public E update (ID id, E entity ) throws Exception;

    public boolean delete (ID id) throws Exception;





}
