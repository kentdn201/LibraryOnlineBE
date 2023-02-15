package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
    Book findBookById(Integer id);
    Book findBookByName(String name);
    Book findBookBySlug(String slug);
}
