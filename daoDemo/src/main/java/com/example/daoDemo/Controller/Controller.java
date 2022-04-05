package com.example.daoDemo.Controller;

import com.example.daoDemo.Entity.Employee;
import com.example.daoDemo.Entity.Toy;
import com.example.daoDemo.Service.EmployeeService;
import com.example.daoDemo.Service.ToyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private ToyService toyService;

    @GetMapping("/")
    public String home() {
        return "<HTML><H1>Home page</H1></HTML>";
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable String id){
        return this.employeeService.getEmployeeById(Integer.parseInt(id));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee){
        return this.employeeService.addEmployee(employee);
    }
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee){
        return this.employeeService.updateEmployee(employee);
    }
    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable String id){
        return this.employeeService.deleteEmployeeById(Integer.parseInt(id));
    }

    @GetMapping("/toys")
    public List<Toy> getToys() {
        return this.toyService.getAllToys();
    }

    @GetMapping("/toys/{id}")
    public Toy getToyById(@PathVariable String id){
        return this.toyService.getToyById(Integer.parseInt(id));
    }

    @PostMapping("/toys")
    public Toy addToy(@RequestBody Toy toy){
        return this.toyService.addToy(toy);
    }
    @PutMapping("/toys")
    public Toy updateToy(@RequestBody Toy toy){
        return this.toyService.updateToy(toy);
    }
    @DeleteMapping("/toys/{id}")
    public String deleteToy(@PathVariable String id){
        return this.toyService.deleteToyById(Integer.parseInt(id));
    }
}
