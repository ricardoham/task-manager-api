package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;

public class TaskRequestMapper {
    public static Task taskRequestToTask(TaskRequest taskRequest) {
        Task task = new Task();
        task.setTitle(taskRequest.getTitle());
        task.setDescription(taskRequest.getDescription());
        task.setTaskPriority(taskRequest.getTaskPriority());

        return task;
    }
}
