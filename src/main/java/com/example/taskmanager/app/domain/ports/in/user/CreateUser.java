package com.example.taskmanager.app.domain.ports.in.user;

import com.example.taskmanager.app.domain.model.User;

public interface CreateUser {
    void create(User user);
}
