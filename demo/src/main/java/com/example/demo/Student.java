package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class Student {
    @Value("1314")
    private int id;
    @Value("Christian")
    private String name;
    @Autowired
    private List<Phone> phone;
    private Address address;

    public Student() {}

    public Student(int id, String name, List<Phone> phone, Address address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setname(String name) {
        this.name = name;
    }

    public List<Phone> getPhone() {
        return phone;
    }
    public void setPhone(List<Phone> phone) {
        this.phone = phone;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "\n\tID: " + id +
                "\n\tName: " + name +
                "\n\tPhone: " + phone +
                "\n\tAddress: " + address;
    }
}
