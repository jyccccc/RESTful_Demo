package com.example.restful_demo.controller;

import com.example.restful_demo.mapper.BookMapper;
import com.example.restful_demo.model.Book;
import com.example.restful_demo.Service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookMapper bookMapper;

    @GetMapping("/book")
    public List<Book> showBooks() {
        List<Book> bookList = bookService.selectAllBooks();
        return bookList;
    }

    @PostMapping("/book")
    public Object insertBook(Book book) {
        Book record = new Book();
        BeanUtils.copyProperties(book,record);
        bookMapper.insert(record);
        return null;
    }
}
