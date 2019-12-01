package com.example.restful_demo.Service;

import com.example.restful_demo.model.Book;
import com.example.restful_demo.mapper.BookMapper;
import com.example.restful_demo.model.BookExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    BookMapper bookMapper;

    public List<Book> selectAllBooks() {
        BookExample example = new BookExample();
        List<Book> books = bookMapper.selectByExample(example);
        return books;
    }
}
