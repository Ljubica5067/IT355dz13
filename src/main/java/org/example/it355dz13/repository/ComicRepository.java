package org.example.it355dz13.repository;



import org.example.it355dz13.model.Comic;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComicRepository extends JpaRepository<Comic, Integer> {
}
