package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.Category.CategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<CategoryDto> getAll();

    CategoryDto getOne(Integer id);

    CategoryDto getBySlug(String slug);

    String createCategory(CategoryDto categoryDto);

    String editCategory(Integer id, CategoryDto categoryDto);

    String deleteCategory(Integer id);
}
