package com.game.gameapi.service;

import com.game.gameapi.models.Power;
import com.game.gameapi.repository.PowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PowerService {
    @Autowired
    PowerRepository repository;

    public Page<Power> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }
}
