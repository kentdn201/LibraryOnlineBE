package com.example.LibraryManagement.dto.Category;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    private String name;
    private String slug;
    private String image;
}
