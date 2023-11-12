package com.example.taskmanager.app.domain.ports.in.task;

import com.example.taskmanager.app.domain.model.Task;

import java.util.List;

public interface GetTasks {
    Task getTask(Long id);
    List<Task> getAllTasks();
}
