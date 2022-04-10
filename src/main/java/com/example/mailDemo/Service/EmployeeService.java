package com.example.mailDemo.Service;

import com.example.mailDemo.Entity.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Employee getByEmployeeId(int objectId);
    Employee addEmployee(Employee employee);
    Employee updateEmployee(Employee employee);
    String deleteEmployee(int objectId);
}
