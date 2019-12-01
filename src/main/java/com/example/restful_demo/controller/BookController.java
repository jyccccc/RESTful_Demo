package com.example.restful_demo.controller;

import com.example.restful_demo.mapper.BookMapper;
import com.example.restful_demo.model.Book;
import com.example.restful_demo.Service.BookService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @Autowired
    BookMapper bookMapper;


    @GetMapping("/books/{id}")
    public Book getBooks(@PathVariable Long id) {
        Book book = bookMapper.selectByPrimaryKey(id);
        return book;
    }

    @GetMapping("/books")
    public List<Book> getPageBooks(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        List<Book> pageBooks = bookService.getPageBooks(pageNum, pageSize);
        return pageBooks;
    }

    @GetMapping("/books/all")
    public List<Book> getAllBooks() {
        List<Book> bookList = bookService.selectAllBooks();
        return bookList;
    }

    @PostMapping("/books")
    public Object insertBook(Book book, HttpServletResponse response) {
        Book record = new Book();
        BeanUtils.copyProperties(book,record);
        if (bookMapper.insert(record) != -1) {
            // 新建数据成功
            response.setStatus(201);
        };
        return null;
    }
}
