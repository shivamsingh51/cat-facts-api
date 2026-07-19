package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cat_facts")
public class CatFact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String fact;

    public CatFact() {
    }

    public CatFact(Integer id, String fact) {
        this.id = id;
        this.fact = fact;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFact() {
        return fact;
    }

    public void setFact(String fact) {
        this.fact = fact;
    }
}