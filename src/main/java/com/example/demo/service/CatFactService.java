package com.example.demo.service;

import com.example.demo.entity.CatFact;
import com.example.demo.repository.CatFactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CatFactService {

    private final CatFactRepository repository;

    public CatFactService(CatFactRepository repository) {
        this.repository = repository;
    }

    public CatFact getRandomFact() {

        List<CatFact> facts = repository.findAll();

        if (facts.isEmpty()) {
            return null;
        }

        Random random = new Random();

        return facts.get(random.nextInt(facts.size()));
    }

}