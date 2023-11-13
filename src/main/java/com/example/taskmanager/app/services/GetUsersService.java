package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.UserRepository;
import com.example.taskmanager.app.domain.model.User;
import com.example.taskmanager.app.domain.ports.in.user.GetUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetUsersService implements GetUsers {
    @Autowired
    UserRepository userRepository;

    @Override
    public User retrieve(Long id) {
        return userRepository.findById(id).orElseThrow();
    }

    @Override
    public List<User> retrieveAll() {
        return userRepository.findAll();
    }
}
