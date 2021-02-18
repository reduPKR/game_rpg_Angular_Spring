package com.game.gameapi.controller;

import com.game.gameapi.models.Power;
import com.game.gameapi.service.PowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/power")
public class PowerController {
    @Autowired
    PowerService service;

    @GetMapping
    public ResponseEntity<Page<Power>> findAll(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable){
        Page<Power> powerPage = service.findAll(pageable);

        if(powerPage.isEmpty()){
            return new ResponseEntity<Page<Power>>(powerPage,HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Page<Power>>(powerPage, HttpStatus.OK);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Power> findByID(@PathVariable("id") long id){
        Power power = service.findByID(id);

        if(power == null){
            return new ResponseEntity<Power>(power, HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<Power>(power, HttpStatus.OK);
        }
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") long id){
        service.delete(id);
    }

    @PostMapping
    public void post(){
        
    }
}
