package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.Author.CreateAuthorDto;
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
    public List<CreateAuthorDto> getAll() {
        return ObjectMapperUtils.mapAll(authorRepository.findAll(), CreateAuthorDto.class);
    }

    @Override
    public CreateAuthorDto getOne(Integer id) {
        Author author = authorRepository.findAuthorById(id);
        CreateAuthorDto authorDto = ObjectMapperUtils.map(author, CreateAuthorDto.class);
        return authorDto;
    }


    @Override
    public String createAuthor(CreateAuthorDto authorDto) {
        try {
            Author author = ObjectMapperUtils.map(authorDto, Author.class);
            authorRepository.save(author);
            return "Create Success";
        } catch (Exception e)
        {
            return "Create fail";
        }

    }
}
