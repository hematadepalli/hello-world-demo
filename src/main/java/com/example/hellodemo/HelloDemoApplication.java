package com.example.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello>>>>");
        SpringApplication.run(HelloDemoApplication.class, args);
    }

}
