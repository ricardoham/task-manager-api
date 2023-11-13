package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.domain.ports.in.task.CreateTask;
import com.example.taskmanager.app.domain.ports.in.task.DeleteTasks;
import com.example.taskmanager.app.domain.ports.in.task.GetTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private GetTasks getTask;
    @Autowired
    private CreateTask createTask;

    @Autowired
    private DeleteTasks deleteTasks;

    @GetMapping("/{id}")
    Task getTask(@PathVariable String id) {
        return getTask.retrieve(Long.parseLong(id));
    }
    @GetMapping
    List<Task> getAllTasks() {
        return getTask.retrieveAll();
    }

    @PostMapping
    void createTask(@RequestBody TaskRequest taskRequest) {
        createTask.create(TaskRequestMapper.taskRequestToTask(taskRequest));
    }

    @DeleteMapping("/{id}")
    void deleteTask(@PathVariable String id) {
        deleteTasks.deleteTask(Long.parseLong(id));
    }
}
