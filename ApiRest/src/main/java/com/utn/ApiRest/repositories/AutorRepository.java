package com.utn.ApiRest.repositories;

import com.utn.ApiRest.entities.Autor;
import org.springframework.stereotype.Repository;

@Repository
public interface AutorRepository extends BaseRepository <Autor, Long> {
}
