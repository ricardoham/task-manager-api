package com.example.taskmanager.app.domain.ports.in;

import com.example.taskmanager.app.domain.model.Task;

public interface CreateTask {
    void create(Task task);
}
