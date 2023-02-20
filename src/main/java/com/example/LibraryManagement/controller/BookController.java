package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.common.ApiResponse;
import com.example.LibraryManagement.dto.Book.BookDto;
import com.example.LibraryManagement.model.Book;
import com.example.LibraryManagement.service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse> createBook(@RequestBody BookDto bookDto) {
        String book = bookService.createBook(bookDto);
        if(book == "This slug is available or category is not available")
        {
            return new ResponseEntity<>(new ApiResponse(false, "Fail, please try again"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new ApiResponse(true, "Success"), HttpStatus.OK);
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
