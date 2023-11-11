package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.services.CreateTaskService;
import com.example.taskmanager.app.services.GetTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/tasks")
public class TaskController {
    @Autowired
    private GetTaskService taskService;
    @Autowired
    private CreateTaskService createTaskService;

    @GetMapping("/{id}")
    Task getTask(@RequestParam String id) {
        return taskService.getTask(Long.parseLong(id));
    }
    @GetMapping
    List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }

    @PostMapping
    void createTask(@RequestBody TaskRequest taskRequest) {
        createTaskService.create(TaskRequestMapper.taskRequestToTask(taskRequest));
    }

}
