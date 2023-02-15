package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.Book.BookDto;
import com.example.LibraryManagement.model.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<BookDto> getAll();

    BookDto getOne (Integer id);

    Book createBook(BookDto bookDto);

    Book editBook (Integer id, BookDto bookDto);

    String deleteBook (Integer id);
}
