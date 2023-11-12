package com.example.taskmanager.app.domain.ports.in.task;

import com.example.taskmanager.app.domain.model.Task;

public interface CreateTask {
    void create(Task task);
}
