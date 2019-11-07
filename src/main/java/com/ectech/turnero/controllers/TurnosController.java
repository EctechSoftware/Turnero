package com.ectech.turnero.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ectech.turnero.services.TurnosService;

@RestController
public class TurnosController {

    @Autowired
    TurnosService turnosService;
    
    @GetMapping("/turnosos")
    public ResponseEntity<?> getTurnosOS(){
        return this.turnosService.getTurnosOS();
    }
}
