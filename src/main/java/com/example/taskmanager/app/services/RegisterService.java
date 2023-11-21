package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.UserRepository;
import com.example.taskmanager.app.domain.model.RegisterDTO;
import com.example.taskmanager.app.domain.model.User;
import com.example.taskmanager.app.domain.ports.in.register.Register;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements Register {
    @Autowired
    UserRepository repository;

    @Override
    public void register(RegisterDTO registerDTO) throws Exception {
        if (this.repository.findByUserName(registerDTO.userName()) != null) {
            throw new Exception("User already registered");
        }

        String encryptedPassword = new BCryptPasswordEncoder().encode(registerDTO.password());
        User newUser = new User(registerDTO.userName(), encryptedPassword, registerDTO.role());

        this.repository.save(newUser);
    }
}
