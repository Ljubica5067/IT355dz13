package org.example.it355dz13.service;



import org.example.it355dz13.model.HeroAttribute;

import java.util.List;
import java.util.Optional;

public interface HeroAttributeService {

    List<HeroAttribute> findAll();

    Optional<HeroAttribute> findById(Integer id);

    HeroAttribute save(HeroAttribute heroAttribute);

    HeroAttribute update(HeroAttribute heroAttribute);

    void deleteById(Integer id);

}
