package com.example.daoDemo.Dao;

import com.example.daoDemo.Entity.Toy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToyDao extends JpaRepository<Toy, Integer> { }
