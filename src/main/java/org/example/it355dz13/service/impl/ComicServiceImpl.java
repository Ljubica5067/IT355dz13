package org.example.it355dz13.service.impl;

import lombok.RequiredArgsConstructor;

import org.example.it355dz13.model.Comic;
import org.example.it355dz13.repository.ComicRepository;
import org.example.it355dz13.service.ComicService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ComicServiceImpl implements ComicService {

    private final ComicRepository comicRepository;

    @Override
    public List<Comic> findAll() {
        return comicRepository.findAll();
    }

    @Override
    public Optional<Comic> findById(Integer id) {
        return comicRepository.findById(id);
    }

    @Override
    public Comic save(Comic comic) {
        return comicRepository.save(comic);
    }

    @Override
    public Comic update(Comic comic) {
        return comicRepository.save(comic);
    }

    @Override
    public void deleteById(Integer id) {
        comicRepository.deleteById(id);
    }
}
