package com.paf_practical.paf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class PafApplication {

    public static void main(String[] args) {
        SpringApplication.run(PafApplication.class, args);
    }

    // Part 2: Hello World Application
    @GetMapping("/") // Answers requests sent to http://localhost:8080/
    public String rootEndpoint() {
        return "Hello world!"; 
    }

    // Part 3: Self Guided Activity (Query Parameter)
    @GetMapping("/hello")
    public String helloEndpoint(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello " + name;
    }

    // Extension Activity: (Path Variable + Optional Query Parameter)
    @GetMapping("/greet/{username}") // Answers requests sent to /greet/John
    public String greetUser(
            @PathVariable("username") String username, 
            @RequestParam(value = "message", required = false) String message) {
        
        // If the user didn't provide a custom message, use the default one
        if (message == null) {
            return "Hello " + username + "! Welcome to Spring Boot!";
        } else {
            // If they did provide a message, use it
            return "Hello " + username + "! " + message;
        }
    }
}