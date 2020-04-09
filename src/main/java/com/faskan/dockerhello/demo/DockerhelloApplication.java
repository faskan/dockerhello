package com.faskan.dockerhello.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerhelloApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerhelloApplication.class, args);
    }

}

@RestController
class SampleRestController {

    @GetMapping("/sayhello")
    public String hello() {
        return "Hello";
    }
}
