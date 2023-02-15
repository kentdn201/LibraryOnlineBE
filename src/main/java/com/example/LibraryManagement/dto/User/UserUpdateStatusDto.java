package com.example.LibraryManagement.dto.User;

import com.example.LibraryManagement.model.Enum.UserStatus;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@JsonIgnoreProperties
@AllArgsConstructor
@NoArgsConstructor
public class UserUpdateStatusDto {
    private UserStatus userStatus;
}
