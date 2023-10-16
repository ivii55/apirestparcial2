package com.utn.ApiRest.services;

import com.utn.ApiRest.entities.Persona;
import com.utn.ApiRest.repositories.BaseRepository;
import com.utn.ApiRest.repositories.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona, Long> implements PersonaService {

    @Autowired
    private PersonaRepository personaRepository;

    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository) {
        super(baseRepository);
        //this.personaRepository = personaRepository;
    }

    @Override
    public List<Persona> serach(String filtro) throws Exception {

        try{
            // List <Persona> personas = personaRepository.findByNombraContainingOrApellidoContaining(filtro, filtro);
            // List <Persona> personas = personaRepository.serach(filtro);
            List <Persona> personas = personaRepository.serachNativo(filtro);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    public Page<Persona> serach(String filtro, Pageable pageable) throws Exception {

        try{
            // Page <Persona> personas = personaRepository.findByNombraContainingOrApellidoContaining(filtro, filtro, pageable);
            // Page <Persona> personas = personaRepository.serach(filtro, pageable);
            Page<Persona> personas = personaRepository.serachNativo(filtro, pageable);
            return personas;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
