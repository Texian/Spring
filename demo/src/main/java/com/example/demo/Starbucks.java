package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Starbucks implements Employer {
    @Autowired
    public Starbucks() {}

    @Override
    public void info() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + ": Starbucks";
    }
}
