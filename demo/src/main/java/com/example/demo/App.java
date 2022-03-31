package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args){
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        Employee employee = appContext.getBean(Employee.class);
        employee.work();

        System.out.println(employee);
    }
}
