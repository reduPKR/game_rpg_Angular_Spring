package com.game.gameapi.controller;

import com.game.gameapi.service.RaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/race")
public class RaceController {
    @Autowired
    RaceService service;
}
