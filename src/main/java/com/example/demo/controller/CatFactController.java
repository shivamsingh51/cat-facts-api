package com.example.demo.controller;

import com.example.demo.entity.CatFact;
import com.example.demo.service.CatFactService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CatFactController {

    private final CatFactService service;

    public CatFactController(CatFactService service) {
        this.service = service;
    }

    @GetMapping("/api/facts/random")
    public CatFact getRandomFact() {
        return service.getRandomFact();
    }
}