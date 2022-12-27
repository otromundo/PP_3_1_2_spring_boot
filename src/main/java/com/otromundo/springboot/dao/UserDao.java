package com.otromundo.springboot.dao;

import com.otromundo.springboot.model.User;

import java.util.List;

public interface UserDao {
    List<User> getList();

    void add(User user);

    User get(Long id);

    void update(User user);

    void delete(User user);
}
