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
        public List<CategoryDto> getAll()
    {
        return categoryService.getAll();
    }

    @GetMapping("/get/{id}")
    public CategoryDto getCategory(@PathVariable(name = "id") Integer id)
    {
        return categoryService.getOne(id);
    }

    @PostMapping("/create")
    public String createCategory (@RequestBody CategoryDto categoryDto)
    {
        categoryService.createCategory(categoryDto);
        return "Create success";
    }

    @PutMapping("/edit/{id}")
    public String editCategory (@PathVariable(name = "id") Integer id, @RequestBody CategoryDto categoryDto)
    {
        categoryService.editCategory(id, categoryDto);
        return "Edit success";
    }

}
