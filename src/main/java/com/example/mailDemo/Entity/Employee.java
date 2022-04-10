package com.example.mailDemo.Entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name="tbl_employees")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "e_id")
    private int employeeId;
    private String name;
    private String email;

    public Employee(){}

    public Employee(int employeeId, String name, String email){
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
    }

    public int getEmployeeId(){
        return employeeId;
    }

    public void setCourseId(int courseId){
        this.employeeId = courseId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\nId: " + employeeId +
                "\nName: " + name +
                "\nEmail: " + email +
                "}";
    }
}
