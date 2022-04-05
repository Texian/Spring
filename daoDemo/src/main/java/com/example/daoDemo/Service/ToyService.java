package com.example.daoDemo.Service;

import com.example.daoDemo.Entity.Toy;

import java.util.List;

public interface ToyService {

    List<Toy> getAllToys();
    Toy getToyById(int toyId);
    Toy addToy(Toy toy);
    Toy updateToy(Toy toy);
    String deleteToyById(int toyId);
}
