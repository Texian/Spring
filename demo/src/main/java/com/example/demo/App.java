package com.example.demo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String args[]){
        ApplicationContext appContext = new ClassPathXmlApplicationContext();
        Student phone = (Student) appContext.getBean("com.example.demo.Phone");
        Student address = (Student) appContext.getBean("com.example.demo.Address");
    }
}
