package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
    Author findByName(String name);

    Author findAuthorById(Integer id);
}
