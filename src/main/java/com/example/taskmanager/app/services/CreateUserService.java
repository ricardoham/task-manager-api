package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.UserRepository;
import com.example.taskmanager.app.domain.model.User;
import com.example.taskmanager.app.domain.ports.in.user.CreateUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateUserService implements CreateUser {
    @Autowired
    UserRepository userRepository;

    @Override
    public void create(User user) {
        userRepository.save(user);
    }
}
