package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.TaskPriority;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaskCreateRequest {
    private String title;
    private String description;
    private TaskPriority taskPriority;
}
