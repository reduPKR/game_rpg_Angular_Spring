package com.game.gameapi.service;

import com.game.gameapi.dto.RaceDTO;
import com.game.gameapi.mapper.RaceMapper;
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

    public Page<Race> save(RaceDTO raceDTO) {
        Race race = RaceMapper.INSTANCE.toModel(raceDTO);

        try {
            return trySave(race);
        }catch (Exception ex){
            System.out.printf(ex.getMessage());
            return null;
        }
    }

    private Page<Race> trySave(Race race) {
        return (Page<Race>) repository.save(race);
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
