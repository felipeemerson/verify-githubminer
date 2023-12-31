package com.example.mainservice.controller;

import com.example.mainservice.entity.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    private final List<Book> books;

    public MainController() {
        this.books = List.of(
                new Book(1L, "Felipe", "Investigating bug reports"),
                new Book(2L, "Marcio", "Hiring at Dell")
        );
    }

    @GetMapping("/")
    public String getHome() {
        return "Hello World from main service!!!";
    }

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getBooks() {
        return new ResponseEntity<>(this.books, HttpStatus.OK);
    }

    @GetMapping("/test")
    public String getTest() {
        return "test";
    }
}
