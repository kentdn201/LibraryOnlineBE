package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.Author.AuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<AuthorDto> getAll();

    AuthorDto getOne (Integer id);

    String createAuthor(AuthorDto authorDto);
}
