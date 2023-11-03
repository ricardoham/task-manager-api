package com.example.taskmanager.app.services;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.adapter.repository.TaskManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    private TaskManagerRepository taskManagerRepository;


    public List<Task> getAllTasks() {
        return taskManagerRepository.findAll();
    }
}
