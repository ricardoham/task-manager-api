package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.services.TaskServices;
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
