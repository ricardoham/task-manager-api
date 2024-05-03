package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.domain.model.TaskPriority;
import jakarta.persistence.Enumerated;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class TaskUpdateRequest {
    private String title;
    private String description;
    @Enumerated
    private TaskPriority taskPriority;
    private String owner;
    private LocalDateTime closedAt;
}
