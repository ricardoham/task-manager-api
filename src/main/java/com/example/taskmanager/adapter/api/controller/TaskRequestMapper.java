package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;

import java.time.LocalDateTime;

public class TaskRequestMapper {
    public static Task taskRequestToTask(TaskRequest taskRequest) {
        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDescription(taskRequest.getDescription());
        task.setOwner(null);
        task.setCreatedBy(null);
        task.setTaskPriority(taskRequest.getTaskPriority());
        task.setCreateAt(LocalDateTime.now());
        task.setUpdateAt(null);
        task.setClosedAt(null);

        return task;
    }
}
