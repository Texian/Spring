package com.example.daoDemo.Entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@EntityScan
@Table(name = "Toy_Database")
public class Toy {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int toyId;
    private String name;
    private String toyLine;

    public Toy(){}

    public Toy(int toyId, String name, String toyLine){
        this.toyId = toyId;
        this.name = name;
        this.toyLine = toyLine;
    }

    public int getToyId() { return toyId; }
    public void setToyId() { this.toyId = toyId; }

    public String getName() { return name; }
    public void setName() { this.name = name; }

    public String getToyLine() { return toyLine; }
    public void setToyLine() { this.toyLine = toyLine; }
}
