package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.Author.CreateAuthorDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AuthorService {
    List<CreateAuthorDto> getAll();

    CreateAuthorDto getOne (Integer id);

    String createAuthor(CreateAuthorDto authorDto);
}
