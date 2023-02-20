package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.Book.BookDto;
import com.example.LibraryManagement.model.Book;
import com.example.LibraryManagement.repository.BookRepository;
import com.example.LibraryManagement.service.impl.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookDto> getAll() {

        List<Book> books = bookRepository.findAll();
        List<BookDto> bookDtos = ObjectMapperUtils.mapAll(books, BookDto.class);
        return bookDtos;
    }

    @Override
    public BookDto getOne(Integer id) {
        BookDto bookDto = ObjectMapperUtils.map(bookRepository.findBookById(id), BookDto.class);
        return bookDto;
    }

    public BookDto getBookBySlug(String slug) {
        BookDto bookDto = ObjectMapperUtils.map(bookRepository.findBookBySlug(slug), BookDto.class);
        return bookDto;
    }

    @Override
    public String createBook(BookDto bookDto) {
        try {
            Book book = ObjectMapperUtils.map(bookDto, Book.class);
            bookRepository.save(book);
            return "Create Success";
        } catch (Exception e) {
            return "This slug is available or category is not available";
        }
    }

    @Override
    public Book editBook(Integer id, BookDto bookDto) {
        return null;
    }

    @Override
    public String deleteBook(Integer id) {
        bookRepository.deleteById(id);
        return "Delete Success";
    }
}
