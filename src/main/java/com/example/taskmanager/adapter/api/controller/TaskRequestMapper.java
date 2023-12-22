package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.Task;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

import java.time.LocalDateTime;

public class TaskRequestMapper {
    private static final UserDetails user = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    public static Task taskRequestToTask(TaskCreateRequest taskCreateRequest) {
        Task task = new Task();
        task.setTitle(taskCreateRequest.getTitle());
        task.setDescription(taskCreateRequest.getDescription());
        task.setOwner(null);
        task.setCreatedBy(user.getUsername());
        task.setTaskPriority(taskCreateRequest.getTaskPriority());
        task.setCreateAt(LocalDateTime.now());
        task.setUpdateAt(null);
        task.setClosedAt(null);

        return task;
    }
}
