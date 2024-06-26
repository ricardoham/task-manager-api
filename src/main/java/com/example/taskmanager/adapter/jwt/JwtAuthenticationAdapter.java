package com.example.taskmanager.adapter.jwt;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.example.taskmanager.configuration.JwtConfiguration;
import com.example.taskmanager.domain.model.User;
import com.example.taskmanager.domain.ports.in.jwt.JwtAuthentication;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

@Slf4j
@Service
public class JwtAuthenticationAdapter implements JwtAuthentication {
    @Autowired
    private JwtConfiguration jwtConfiguration;

    public String generateToken(User user) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(jwtConfiguration.getJwtSecret());

            return JWT.create()
                    .withIssuer(JwtConfiguration.ISSUER)
                    .withSubject(user.getUsername())
                    .withExpiresAt(genExpirationDate())
                    .sign(algorithm);
        } catch (JWTCreationException exception) {
            throw new RuntimeException("Error while generating token", exception);
        }
    }

    public String validateToken(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256(jwtConfiguration.getJwtSecret());
            return JWT.require(algorithm)
                    .withIssuer(JwtConfiguration.ISSUER)
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTVerificationException exception) {
            log.error("Error when validating the token", exception.getCause());
            throw exception;
        }
    }

    private Instant genExpirationDate() {
        return LocalDateTime.now().plusHours(2).toInstant(ZoneOffset.of("-03:00"));
    }
}
