package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.Author.CreateAuthorDto;
import com.example.LibraryManagement.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorServiceImpl authorService;

    @GetMapping("/all")
    public List<CreateAuthorDto> getAll() {
        return authorService.getAll();
    }

    @GetMapping("/get/{id}")
    public CreateAuthorDto getOne(@PathVariable(name = "id") Integer id)
    {
        return authorService.getOne(id);
    }

    @PostMapping("/create")
    public String createAuthor(@RequestBody CreateAuthorDto authorDto)
    {
        authorService.createAuthor(authorDto);
        return "Create success";
    }


}
