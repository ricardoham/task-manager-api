package com.example.taskmanager.app.domain.ports.in.user;

import com.example.taskmanager.app.domain.model.User;

import java.util.List;

public interface GetUsers {
    User retrieve(Long id);
    List<User> retrieveAll();
}
