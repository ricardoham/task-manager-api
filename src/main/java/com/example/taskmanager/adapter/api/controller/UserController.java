package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.User;
import com.example.taskmanager.app.domain.ports.in.user.CreateUser;
import com.example.taskmanager.app.domain.ports.in.user.GetUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    GetUsers getUsers;

    @Autowired
    CreateUser createUser;

    @GetMapping("/{id}")
    User getUser(@PathVariable String id) {
        return getUsers.retrieve(Long.parseLong(id));
    }

    @GetMapping
    List<User> getAllUsers() {
        return getUsers.retrieveAll();
    }

    @PostMapping
    void createUser(@RequestBody User user) {
        createUser.create(user);
    }
}
