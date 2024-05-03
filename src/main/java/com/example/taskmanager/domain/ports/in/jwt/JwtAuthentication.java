package com.example.taskmanager.domain.ports.in.jwt;

import com.example.taskmanager.domain.model.User;

public interface JwtAuthentication {
    String generateToken(User user);

    String validateToken(String token);
}
