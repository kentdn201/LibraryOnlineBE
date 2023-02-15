package com.example.LibraryManagement.repository;

import com.example.LibraryManagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    User findByEmail(String email);
    User findUserById(Integer id);
    User findByUsername(String name);
}
