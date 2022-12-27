package com.otromundo.springboot.service;

import com.otromundo.springboot.model.User;

import java.util.List;

public interface UserService {
    List<User> getList();

    void add(User user);

    User get(Long id);

    void update(User user);

    void delete(User user);
}
