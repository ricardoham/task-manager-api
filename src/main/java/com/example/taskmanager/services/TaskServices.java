package com.example.taskmanager.services;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskManagerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskServices {
    private TaskManagerRepository taskManagerRepository;


    public List<Task> getAllTasks() {
        return taskManagerRepository.findAll();
    }
}
