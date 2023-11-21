package com.example.taskmanager.app.domain.ports.in.register;

import com.example.taskmanager.app.domain.model.RegisterDTO;

public interface Register {
    void register(RegisterDTO registerDTO) throws Exception;
}
