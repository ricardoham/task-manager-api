package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.domain.ports.in.CreateTask;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskService implements CreateTask {
    private final TaskRepository taskRepository;

    public CreateTaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public void create(Task task) {
        taskRepository.save(task);
    }
}
