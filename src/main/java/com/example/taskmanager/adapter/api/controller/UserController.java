package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.domain.model.User;
import com.example.taskmanager.domain.ports.in.user.GetUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    GetUsers getUsers;


    @GetMapping("/{id}")
    User getUser(@PathVariable String id) {
        return getUsers.retrieve(Long.parseLong(id));
    }

    @GetMapping
    List<User> getAllUsers() {
        return getUsers.retrieveAll();
    }

}
