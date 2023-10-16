package com.utn.ApiRest.controllers;

import com.utn.ApiRest.entities.Persona;
import com.utn.ApiRest.services.PersonaServiceImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl <Persona, PersonaServiceImpl> {

    @GetMapping("/serach")
    public ResponseEntity <?> serach (@RequestParam String filtro ) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.serach(filtro));
        }catch (Exception e ) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }

    @GetMapping("/serachPaged")
    public ResponseEntity <?> serach (@RequestParam String filtro, Pageable pageable) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(servicio.serach(filtro, pageable));
        }catch (Exception e ) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }






}

