package com.example.taskmanager.domain.services.task;

import com.example.taskmanager.domain.model.Task;
import com.example.taskmanager.domain.ports.in.task.CreateTask;
import com.example.taskmanager.domain.ports.out.TaskRepository;
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
