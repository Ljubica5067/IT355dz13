package org.example.it355dz13.service;




import org.example.it355dz13.model.Gender;

import java.util.List;
import java.util.Optional;

public interface GenderService {

    List<Gender> findAll();

    Optional<Gender> findById(Integer id);

    Gender save(Gender gender);

    Gender update(Gender gender);

    void deleteById(Integer id);

}
