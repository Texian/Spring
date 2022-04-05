package com.example.bootDemo.Controller;

import com.example.bootDemo.Entity.Employee;
import com.example.bootDemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService person;

    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "Hello") String name){
        return "<html><h1>SpringBoot Demo</h1></html>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.person.getEmployees();
    }

    @GetMapping("/employees/{empId}")
    public Employee getEmployees(String empId){
        return this.person.getEmployee(Integer.parseInt(empId));
    }
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee person) {
        return this.person.addEmployee(person);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee person) {
        return this.person.updateEmployee(person);
    }

    @DeleteMapping("/employees/{empId}")
    public String deleteEmployee(@PathVariable String empId) {
        return this.person.deleteEmployee(Integer.parseInt(empId));
    }

}
