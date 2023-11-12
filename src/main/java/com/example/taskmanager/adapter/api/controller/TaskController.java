package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.services.CreateTaskService;
import com.example.taskmanager.app.services.DeleteTasksService;
import com.example.taskmanager.app.services.GetTasksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("api/tasks")
public class TaskController {
    @Autowired
    private GetTasksService taskService;
    @Autowired
    private CreateTaskService createTaskService;

    @Autowired
    private DeleteTasksService deleteTasksService;

    @GetMapping("/{id}")
    Task getTask(@PathVariable String id) {
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

    @DeleteMapping("/{id}")
    void deleteTask(@PathVariable String id) {
        deleteTasksService.deleteTask(Long.parseLong(id));
    }
}
