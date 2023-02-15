package com.example.LibraryManagement.service.impl;

import com.example.LibraryManagement.dto.User.UserDto;
import com.example.LibraryManagement.dto.User.UserRegisterDto;
import com.example.LibraryManagement.model.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService  {
    User createUser(UserRegisterDto userDto);

    User editUser(UserDto userDto, Integer id);

    User findByUserId(Integer id);

    List<UserDto> getAllUser();
}
