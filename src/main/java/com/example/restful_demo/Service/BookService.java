package com.example.restful_demo.Service;

import com.example.restful_demo.mapper.BookMapper;
import com.example.restful_demo.model.Book;
import com.example.restful_demo.model.BookExample;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    public List<Book> getPageBooks(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        BookExample example = new BookExample();
        List<Book> books = bookMapper.selectByExample(example);
        return books;
    }
}
