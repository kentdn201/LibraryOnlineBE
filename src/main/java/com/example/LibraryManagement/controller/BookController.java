package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.Book.BookDto;
import com.example.LibraryManagement.model.Book;
import com.example.LibraryManagement.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/all")
    public List<BookDto> getAllBook()
    {
        return bookService.getAll();
    }

    @PostMapping("/create")
    public Book createBook(@RequestBody BookDto bookDto) {
        return bookService.createBook(bookDto);
    }

    @GetMapping("/get")
    public BookDto findBookBySlug(String slug) {
        return bookService.getBookBySlug(slug);
    }


    @PutMapping("/edit")
    public String editBook(Integer id, BookDto bookDto)
    {
        bookService.editBook(id, bookDto);
        return "Edit Success";
    }

}
