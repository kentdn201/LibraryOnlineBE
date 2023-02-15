package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.Author.AuthorDto;
import com.example.LibraryManagement.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/all")
    public List<AuthorDto> getAll() {
        return authorService.getAll();
    }
}
