package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
@ComponentScan("com.example.demo")
public class AppConfig {
    @Bean
    public Phone phone(){
        Phone phone = new Phone();
        phone.setPhone("8174557791");
        return phone;
    }
}
