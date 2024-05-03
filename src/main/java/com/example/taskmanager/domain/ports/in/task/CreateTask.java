package com.example.taskmanager.domain.ports.in.task;

import com.example.taskmanager.domain.model.Task;

public interface CreateTask {
    void create(Task task);
}
