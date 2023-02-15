package com.example.LibraryManagement.dto.Author;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private String authorName;
    private String slug;
}
