package com.game.gameapi.controller;

import com.game.gameapi.models.Race;
import com.game.gameapi.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
