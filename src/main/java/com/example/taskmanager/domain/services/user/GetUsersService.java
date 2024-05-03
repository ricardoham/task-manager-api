package com.example.taskmanager.domain.services.user;

import com.example.taskmanager.domain.model.User;
import com.example.taskmanager.domain.ports.in.user.GetUsers;
import com.example.taskmanager.domain.ports.out.UserRepository;
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
