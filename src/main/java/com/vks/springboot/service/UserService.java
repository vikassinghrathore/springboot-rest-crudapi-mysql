package com.vks.springboot.service;


import com.vks.springboot.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User addUser(User user);
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
}
