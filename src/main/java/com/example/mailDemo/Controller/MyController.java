package com.example.mailDemo.Controller;

import com.example.mailDemo.Entity.Course;
import com.example.mailDemo.Entity.Employee;
import com.example.mailDemo.Service.CourseService;
import com.example.mailDemo.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController{
    @Autowired
    private CourseService courseService;
    @Autowired
    private EmployeeService employeeService;

    @GetMapping("home")
    public String home(){
        return "<html><h1>Application Home Page</h1></html>";
    }

    @GetMapping("courses")
    public List<Course> getCourse(){
        return this.courseService.getAllCourses();
    }

    @GetMapping("/courses/{objectId}")
    public Course getCourse(@PathVariable String objectId) {
        return this.courseService.getByCourseId(Integer.parseInt(objectId));
    }

    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return this.courseService.addCourse(course);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course) {
        return this.courseService.updateCourse(course);
    }

    @DeleteMapping("/courses/{objectId}")
    public String deleteCourse(@PathVariable String objectId) {
        return "Object Deleted";
    }

    @GetMapping("employees")
    public List<Employee> getEmployees(){
        return this.employeeService.getAllEmployees();
    }

    @GetMapping("/employees/{objectId}")
    public Employee getEmployee(@PathVariable String objectId) {
        return this.employeeService.getByEmployeeId(Integer.parseInt(objectId));
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return this.employeeService.addEmployee(employee);
    }

    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return this.employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/employees/{objectId}")
    public String deleteEmployee(@PathVariable String objectId) {
        return "Object Deleted";
    }
}
