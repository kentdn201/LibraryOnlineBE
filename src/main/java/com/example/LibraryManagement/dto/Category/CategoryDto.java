package com.example.LibraryManagement.dto.Category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private Integer id;
    private String name;
    private String slug;
    private String image;
}
