package com.example.mainservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @PostMapping("/book/{id}")
    public String getBook(@PathVariable(name = "id") String id) {
        return String.format("Book with id %s", id);
    }

    @GetMapping("/")
    public String getHello() {
        return "Hello World - Test Controller";
    }

}
