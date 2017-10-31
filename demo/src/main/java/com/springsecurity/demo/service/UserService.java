package com.springsecurity.demo.service;

import com.springsecurity.demo.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}