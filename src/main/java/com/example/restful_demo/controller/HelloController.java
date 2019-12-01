package com.example.restful_demo.controller;

import com.example.restful_demo.model.Book;
import com.example.restful_demo.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @Autowired
    BookService bookService;

    @GetMapping("/book/all")
    public List<Book> showBooks() {
        List<Book> bookList = bookService.selectAllBooks();
        return bookList;
    }
}
