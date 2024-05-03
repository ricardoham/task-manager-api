package com.example.taskmanager.domain.ports.in.auth;

import com.example.taskmanager.domain.model.RegisterDTO;

public interface Register {
    void register(RegisterDTO registerDTO) throws Exception;
}
