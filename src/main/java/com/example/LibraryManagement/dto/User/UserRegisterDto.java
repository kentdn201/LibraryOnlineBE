package com.example.LibraryManagement.dto.User;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class UserRegisterDto {
    private String firstName;
    private String lastName;
    private String email;
    private String userName;
    private String passWord;
    private Object roles;
}
