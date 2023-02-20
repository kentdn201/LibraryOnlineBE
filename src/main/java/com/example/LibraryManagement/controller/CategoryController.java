package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.common.ApiResponse;
import com.example.LibraryManagement.dto.Category.CreateCategoryDto;
import com.example.LibraryManagement.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<ApiResponse> createCategory (@RequestBody CreateCategoryDto createCategoryDto)
    {
        String categoryCreateStatus = categoryService.createCategory(createCategoryDto);
        if(categoryCreateStatus == "Create fail")
        {
            return new ResponseEntity<>(new ApiResponse(true, "Fail"), HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(new ApiResponse(true, "Success"), HttpStatus.OK);
    }

    @PutMapping("/edit/{id}")
    public String editCategory (@PathVariable(name = "id") Integer id, @RequestBody CreateCategoryDto createCategoryDto)
    {
        categoryService.editCategory(id, createCategoryDto);
        return "Edit success";
    }

}
