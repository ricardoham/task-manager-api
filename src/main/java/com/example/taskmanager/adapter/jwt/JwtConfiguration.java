package com.example.taskmanager.adapter.jwt;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Getter
@Configuration
public class JwtConfiguration {
    public static final String ISSUER = "task-manager-api";
    
    @Value("${api.security.token.secret}")
    private String jwtSecret;
}
