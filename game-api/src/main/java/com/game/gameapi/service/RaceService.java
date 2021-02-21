package com.game.gameapi.service;

import com.game.gameapi.models.Race;
import com.game.gameapi.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RaceService {
    @Autowired
    RaceRepository repository;

    public Page<Race> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }
}
