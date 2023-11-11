package com.example.taskmanager.app.services;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.ports.in.GetTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTaskService implements GetTasks {
    @Autowired
    private TaskRepository taskManagerRepository;


    @Override
    public Task getTask(Long id) {
        return taskManagerRepository.findById(id).orElseThrow();
    }

    public List<Task> getAllTasks() {
        return taskManagerRepository.findAll();
    }
}
