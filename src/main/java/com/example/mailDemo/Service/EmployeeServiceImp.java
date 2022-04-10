package com.example.mailDemo.Service;

import com.example.mailDemo.Dao.EmployeeDao;
import com.example.mailDemo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImp implements EmployeeService{
    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    private SendEmailService sendEmailService;

    public List<Employee> getAllEmployees(){
        return this.employeeDao.findAll();
    }

    public Employee getByEmployeeId(int objectId){
        Optional<Employee> op = this.employeeDao.findById(objectId);
        Employee employee = null;
        if(op.isPresent()) employee = op.get();
        else throw new RuntimeException("Employee not found for id: " + objectId);
        return employee;
    }

    public Employee addEmployee(Employee employee){
        sendEmailService.sendEmail("sender@send.com", "Test EmpAdd", "Employee Added");
        return this.employeeDao.save(employee);
    }

    public Employee updateEmployee(Employee employee){
        return this.employeeDao.save(employee);
    }

    public String deleteEmployee(int objectId){
        this.employeeDao.deleteById(objectId);
        sendEmailService.sendEmail("sender@send.com", "Test EmpDel", "Employee Deleted");
        return "Delted Successfully";
    }
}