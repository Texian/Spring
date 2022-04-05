package com.example.daoDemo.Service;

import com.example.daoDemo.Dao.EmployeeDao;
import com.example.daoDemo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ESImplement implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getAllEmployees() {
        return this.employeeDao.findAll();
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
        Optional<Employee> emp = this.employeeDao.findById(employeeId);
        Employee employee = null;
        if(emp.isPresent()) {
            employee = emp.get();
        } else {
            throw new RuntimeException("Employee not found for id: " +employeeId);
        }
        return employee;
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return this.employeeDao.save(employee);
    }

    @Override
    public String deleteEmployeeById(int employeeId) {
        this.employeeDao.deleteById(employeeId);
        return "Delete successful";
    }
}
