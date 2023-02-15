package com.example.LibraryManagement.dto.Book;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class BookDto {
    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull double price;
    private @NotNull String description;
}
