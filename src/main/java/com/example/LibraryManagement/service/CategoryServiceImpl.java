package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.Category.CreateCategoryDto;
import com.example.LibraryManagement.model.Category;
import com.example.LibraryManagement.repository.CategoryRepository;
import com.example.LibraryManagement.service.impl.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<CreateCategoryDto> getAll() {
        return ObjectMapperUtils.mapAll(categoryRepository.findAll(), CreateCategoryDto.class);
    }

    @Override
    public CreateCategoryDto getOne(Integer id) {
        return ObjectMapperUtils.map(categoryRepository.findUserById(id), CreateCategoryDto.class);
    }

    @Override
    public CreateCategoryDto getBySlug(String slug) {
        return ObjectMapperUtils.map(categoryRepository.findBySlug(slug), CreateCategoryDto.class);
    }

    @Override
    public String createCategory(CreateCategoryDto createCategoryDto) {
        try {
            Category category = ObjectMapperUtils.map(createCategoryDto, Category.class);
            categoryRepository.save(category);
            return "Create Success";
        } catch (Exception e) {
            return "Create fail";
        }
    }

    @Override
    public String editCategory(Integer id, CreateCategoryDto createCategoryDto) {
        return null;
    }

    @Override
    public String deleteCategory(Integer id) {
        return null;
    }
}
