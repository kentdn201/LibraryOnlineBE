package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer > {
    Category findByName(String name);
    Category findBySlug(String slug);

    Category findUserById(Integer id);
}
