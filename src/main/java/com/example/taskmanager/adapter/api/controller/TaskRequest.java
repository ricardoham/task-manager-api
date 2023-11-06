package com.example.taskmanager.adapter.api.controller;

import com.example.taskmanager.app.domain.model.TaskPriority;

public class TaskRequest {
    String title;
    String description;
    TaskPriority taskPriority;
}
