package com.example.LibraryManagement.dto.Book;

import com.example.LibraryManagement.dto.Author.AuthorDto;
import com.example.LibraryManagement.dto.Category.CategoryDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private String name;
    private String slug;
    private String imageURL;
    private double price;
    private String description;
    private AuthorDto author;
    private CategoryDto category;
}
