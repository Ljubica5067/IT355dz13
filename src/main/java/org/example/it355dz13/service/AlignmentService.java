package org.example.it355dz13.service;





import org.example.it355dz13.model.Alignment;

import java.util.List;
import java.util.Optional;

public interface AlignmentService {

    List<Alignment> findAll();

    Optional<Alignment> findById(Integer id);

    Alignment save(Alignment alignment);

    Alignment update(Alignment alignment);

    void deleteById(Integer id);

}
