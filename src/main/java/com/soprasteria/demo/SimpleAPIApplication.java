package com.soprasteria.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping(value = "/v1/hello")
@Slf4j
public class SimpleAPIApplication {

    public static void main(String[] args) {
        SpringApplication.run(SimpleAPIApplication.class, args);
        System.out.println("Why can't dinosaurs clap their hands? Because they're extinct");
    }

    @GetMapping(value = "/world", produces = "text/plain")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Who won the neck decorating contest? It was a tie.");
    }
}
