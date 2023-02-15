package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.Author.AuthorDto;
import com.example.LibraryManagement.model.Author;
import com.example.LibraryManagement.repository.AuthorRepository;
import com.example.LibraryManagement.service.impl.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<AuthorDto> getAll() {
        return ObjectMapperUtils.mapAll(authorRepository.findAll(), AuthorDto.class);
    }

    @Override
    public AuthorDto getOne(Integer id) {
        return ObjectMapperUtils.map(authorRepository.findById(id), AuthorDto.class);
    }


    @Override
    public String createAuthor(AuthorDto authorDto) {
        Author author = ObjectMapperUtils.map(authorDto, Author.class);
        authorRepository.save(author);
        return "Create Success";
    }
}
