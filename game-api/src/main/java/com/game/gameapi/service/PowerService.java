package com.game.gameapi.service;

import com.game.gameapi.models.Power;
import com.game.gameapi.repository.PowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PowerService {
    @Autowired
    PowerRepository repository;

    public Page<Power> findAll(Pageable pageable){
        return repository.findAll(pageable);
    }

    public Power findByID(long id){
        Optional<Power> optional = repository.findById(id);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
