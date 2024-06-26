package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.domain.model.RegisterDTO;
import com.example.taskmanager.domain.model.User;
import com.example.taskmanager.domain.ports.in.auth.Register;
import com.example.taskmanager.domain.ports.in.jwt.JwtAuthentication;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthenticationController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Register register;

    @Autowired
    private JwtAuthentication jwtAuthentication;

    @PostMapping("/login")
    public ResponseEntity login(@RequestBody @Valid AuthenticationDTO authentication) {
        var usernamePassword = new UsernamePasswordAuthenticationToken(authentication.userName(), authentication.password());
        var auth = this.authenticationManager.authenticate(usernamePassword);

        var token = jwtAuthentication.generateToken((User) auth.getPrincipal());

        return ResponseEntity.ok(new LoginResponseDTO(token));
    }

    @PostMapping("/register")
    public ResponseEntity register(@RequestBody @Valid RegisterDTO registerDTO) {
        // TODO check the role from current logged user
        try {
            register.register(registerDTO);
            return ResponseEntity.ok().build();
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }


    }
}
