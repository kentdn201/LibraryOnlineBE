package com.example.LibraryManagement.dto.Author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private Integer id;
    private String name;
    private String slug;
}
