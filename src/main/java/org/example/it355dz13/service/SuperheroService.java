package org.example.it355dz13.service;



import org.example.it355dz13.model.Superhero;

import java.util.List;
import java.util.Optional;

public interface SuperheroService {

    List<Superhero> findAll();

    Optional<Superhero> findById(Integer id);

    Superhero save(Superhero superhero);

    Superhero update(Superhero superhero);

    void deleteById(Integer id);

    List<Superhero> findByHeightCmGreaterThan(int height);

}
