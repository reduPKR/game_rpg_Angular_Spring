package com.game.gameapi.controller;

import com.game.gameapi.dto.RaceDTO;
import com.game.gameapi.models.Race;
import com.game.gameapi.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/race")
public class RaceController {
    @Autowired
    RaceService service;

    @GetMapping
    public ResponseEntity<Page<Race>> findAll(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        Page<Race> racePage = service.findAll(pageable);

        if(racePage.isEmpty()){
            return new ResponseEntity<Page<Race>>(racePage, HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Page<Race>>(racePage, HttpStatus.OK);
        }
    }

    @PostMapping
    public ResponseEntity<Page<Race>> save(@RequestBody @Valid RaceDTO raceDTO){
        Page<Race> racePage = service.save(raceDTO);
        return new ResponseEntity<Page<Race>>(racePage, HttpStatus.CREATED);
    }
}
