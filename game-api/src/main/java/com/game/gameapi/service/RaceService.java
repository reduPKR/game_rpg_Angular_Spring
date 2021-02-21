package com.game.gameapi.service;

import com.game.gameapi.repository.RaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RaceService {
    @Autowired
    RaceRepository repository;

}
