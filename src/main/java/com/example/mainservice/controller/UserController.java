package com.example.mainservice.controller;

import com.example.mainservice.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser() {
        return new User("Felipe", "123.456.789-00", new Date(), "00 0000-0000");
    }

}