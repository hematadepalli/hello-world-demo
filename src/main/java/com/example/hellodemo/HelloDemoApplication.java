package com.example.hellodemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class HelloDemoApplication {

    public static void main(String[] args) {
        System.out.println("Hello>>>>");
        SpringApplication.run(HelloDemoApplication.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public Message displayMessage() {
        return "Greetings!";
    }

}
