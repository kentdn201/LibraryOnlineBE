package com.example.LibraryManagement.service;

import com.example.LibraryManagement.config.ObjectMapperUtils;
import com.example.LibraryManagement.dto.User.UserDto;
import com.example.LibraryManagement.dto.User.UserRegisterDto;
import com.example.LibraryManagement.model.User;
import com.example.LibraryManagement.repository.UserRepository;
import com.example.LibraryManagement.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service
public class UserServiceImpl implements UserDetails, UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(UserRegisterDto userDto) {
        User user = ObjectMapperUtils.map(userDto, User.class);
        userRepository.save(user);
        return user;
    }

    @Override
    public User editUser(UserDto userDto, Integer id) {
        User currentUser = userRepository.findUserById(id);
        return currentUser;
    }

    @Override
    public User findByUserId(Integer id) {
        return userRepository.findUserById(id);
    }

    @Override
    public List<UserDto> getAllUser() {
        List<User> listUser = userRepository.findAll();
        List<UserDto> userDtoList = ObjectMapperUtils.mapAll(listUser, UserDto.class);
        return userDtoList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
