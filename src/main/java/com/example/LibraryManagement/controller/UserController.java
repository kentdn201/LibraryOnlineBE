package com.example.LibraryManagement.controller;

import com.example.LibraryManagement.dto.User.UserDto;
import com.example.LibraryManagement.dto.User.UserRegisterDto;
import com.example.LibraryManagement.model.User;
import com.example.LibraryManagement.service.UserServiceImpl;
import com.example.LibraryManagement.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/all")
    public List<UserDto> getAll()
    {
        return userService.getAllUser();
    }

    @PostMapping("/create")
    public User createUser(@RequestBody UserRegisterDto userRegisterDto)
    {
        return userService.createUser(userRegisterDto);
    }
}
