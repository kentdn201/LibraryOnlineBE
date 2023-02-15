package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.Category.CategoryDto;
import com.example.LibraryManagement.model.Category;
import com.example.LibraryManagement.repository.CategoryRepository;
import com.example.LibraryManagement.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CategoryDto> getAll() {
        return ObjectMapperUtils.mapAll(categoryRepository.findAll(), CategoryDto.class);
    }

    @Override
    public CategoryDto getOne(Integer id) {
        return ObjectMapperUtils.map(categoryRepository.findById(id), CategoryDto.class);
    }

    @Override
    public CategoryDto getBySlug(String slug) {
        return ObjectMapperUtils.map(categoryRepository.findBySlug(slug), CategoryDto.class);
    }

    @Override
    public String createCategory(CategoryDto categoryDto) {
        Category category = ObjectMapperUtils.map(categoryDto, Category.class);
        return "Create Success";
    }

    @Override
    public String editCategory(Integer id, CategoryDto categoryDto) {
        return null;
    }

    @Override
    public String deleteCategory(Integer id) {
        return null;
    }
}
