package com.utn.ApiRest.controllers;

import com.utn.ApiRest.entities.Autor;
import com.utn.ApiRest.services.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin (origins = "*")
@RequestMapping (path = "api/v1/autores")
public class AutorController extends BaseControllerImpl <Autor, AutorServiceImpl>{


}
