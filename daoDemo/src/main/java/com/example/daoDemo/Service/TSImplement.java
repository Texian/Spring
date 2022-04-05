package com.example.daoDemo.Service;

import com.example.daoDemo.Dao.ToyDao;
import com.example.daoDemo.Entity.Toy;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TSImplement implements ToyService{

    @Autowired
    ToyDao toyDao;

    @Override
    public List<Toy> getAllToys() {
        return this.toyDao.findAll();
    }

    @Override
    public Toy getToyById(int toyId) {
        Optional<Toy> emp = this.toyDao.findById(toyId);
        Toy toy = null;
        if(emp.isPresent()) {
            toy = emp.get();
        } else {
            throw new RuntimeException("Toy not found for id: " +toyId);
        }
        return toy;
    }

    @Override
    public Toy addToy(Toy toy) {
        return this.toyDao.save(toy);
    }

    @Override
    public Toy updateToy(Toy toy) {
        return this.toyDao.save(toy);
    }

    @Override
    public String deleteToyById(int toyId) {
        this.toyDao.deleteById(toyId);
        return "Delete successful";
    }
}
