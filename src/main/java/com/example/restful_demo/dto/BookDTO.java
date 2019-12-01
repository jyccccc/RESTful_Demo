package com.example.restful_demo.dto;

import com.example.restful_demo.model.Book;
import lombok.Data;

@Data
public class BookDTO {
    private Integer page;
    private Integer rows;
    private Book book;
}
