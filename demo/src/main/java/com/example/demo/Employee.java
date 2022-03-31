package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

@Component // Converts class Employee to a java bean without having to configure it in the Spring.xml file
public class Employee {
    @Autowired // Resolves and injects collaborating beans; in this case, Student, Employer, and Address
    private Student student;
    private Employer employer;
    private Address empAdd;

    public Employee() {}

    public Employee(Student student, Employer employer, Address empAdd) {
        this.student = student;
        this.employer = employer;
        this.empAdd = empAdd;
    }

    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }

    public Employer employer() {
        return employer;
    }
    public void setPhone(Employer employer) {
        this.employer = employer;
    }

    public Address getAddress() {
        return empAdd;
    }
    public void setAddress(Address empAdd) {
        this.empAdd = empAdd;
    }

    public void work() {
        System.out.println("Employee " + this.student.getId() + " working...");
    }

    @Override
    public String toString() {
        return "Employee {" +
                "\nStudent Info: " + student +
                "\nEmployer: " + employer +
                "\nEmployer Address: " + empAdd + "}";
    }
}
