package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.Category.CategoryDto;
import com.example.LibraryManagement.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @GetMapping("/all")
        private List<CategoryDto> getAll()
    {
        return categoryService.getAll();
    }

    @PostMapping("/create")
    private String createCategory (@RequestBody CategoryDto categoryDto)
    {
        categoryService.createCategory(categoryDto);
        return "Create success";
    }

}
