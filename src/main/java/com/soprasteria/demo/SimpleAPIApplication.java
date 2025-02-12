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
    }

    @GetMapping(value = "/world", produces = "text/plain")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello .net noobs!!");
    }
}
