package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.Category.CreateCategoryDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {
    List<CreateCategoryDto> getAll();

    CreateCategoryDto getOne(Integer id);

    CreateCategoryDto getBySlug(String slug);

    String createCategory(CreateCategoryDto createCategoryDto);

    String editCategory(Integer id, CreateCategoryDto createCategoryDto);

    String deleteCategory(Integer id);
}
