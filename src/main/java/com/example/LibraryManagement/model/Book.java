package com.example.LibraryManagement.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private @NotNull String name;
    private @NotNull String imageURL;
    private @NotNull double price;
    private @NotNull String description;

    @Column(unique = true)
    private @NotNull String slug;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private @NotNull Category category;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private @NotNull Author author;
}
