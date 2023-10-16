package com.utn.ApiRest.services;


import com.utn.ApiRest.entities.Autor;
import com.utn.ApiRest.repositories.AutorRepository;
import com.utn.ApiRest.repositories.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl <Autor, Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;

    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }


}
