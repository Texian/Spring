package com.example.daoDemo.Entity;

import javax.persistence.*;

@Entity
@Table(name = "Employee_Database")
public class Employee {

    @Id
    @Column(name = "EmployeeId")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;

    public Employee() {}

    public Employee(String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public void setId() { this.id = id; }

    public String getName() { return name; }
    public void setName() { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail() { this.email = email; }
}