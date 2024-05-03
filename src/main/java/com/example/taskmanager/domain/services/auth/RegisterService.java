package com.example.taskmanager.domain.services.auth;

import com.example.taskmanager.domain.model.RegisterDTO;
import com.example.taskmanager.domain.model.User;
import com.example.taskmanager.domain.ports.in.auth.Register;
import com.example.taskmanager.domain.ports.out.UserRepository;
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
