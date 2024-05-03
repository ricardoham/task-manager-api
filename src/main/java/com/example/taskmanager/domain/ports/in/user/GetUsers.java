package com.example.taskmanager.domain.ports.in.user;

import com.example.taskmanager.domain.model.User;

import java.util.List;

public interface GetUsers {
    User retrieve(Long id);

    List<User> retrieveAll();
}
