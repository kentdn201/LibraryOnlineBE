package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.Category.CreateCategoryDto;
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
        public List<CreateCategoryDto> getAll()
    {
        return categoryService.getAll();
    }

    @GetMapping("/get/{id}")
    public CreateCategoryDto getCategory(@PathVariable(name = "id") Integer id)
    {
        return categoryService.getOne(id);
    }

    @PostMapping("/create")
    public String createCategory (@RequestBody CreateCategoryDto createCategoryDto)
    {
        categoryService.createCategory(createCategoryDto);
        return "Create success";
    }

    @PutMapping("/edit/{id}")
    public String editCategory (@PathVariable(name = "id") Integer id, @RequestBody CreateCategoryDto createCategoryDto)
    {
        categoryService.editCategory(id, createCategoryDto);
        return "Edit success";
    }

}
