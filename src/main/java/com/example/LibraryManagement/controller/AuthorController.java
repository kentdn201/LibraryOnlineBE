package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.common.ApiResponse;
import com.example.LibraryManagement.dto.Author.CreateAuthorDto;
import com.example.LibraryManagement.service.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse> createAuthor(@RequestBody CreateAuthorDto authorDto)
    {
        String author = authorService.createAuthor(authorDto);
        if(author == "This slug is available or category is not available")
        {
            return new ResponseEntity<>(new ApiResponse(false, "Fail, please try again"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new ApiResponse(true, "Success"), HttpStatus.OK);
    }
}
