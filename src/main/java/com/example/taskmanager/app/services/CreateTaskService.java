package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.domain.ports.in.CreateTask;

public class CreateTaskService implements CreateTask {
    TaskRepository taskRepository;

    @Override
    public void create(Task task) {
        taskRepository.save(task);
    }
}
