package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.services.TaskServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("api/tasks")
public class TaskController {
    private TaskServices taskServices;

    @GetMapping
    List<Task> getAllTasks() {
        return taskServices.getAllTasks();
    }

}
