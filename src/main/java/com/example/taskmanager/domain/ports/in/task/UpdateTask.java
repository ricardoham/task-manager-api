package com.example.taskmanager.domain.ports.in.task;

import com.example.taskmanager.adapter.api.controller.TaskUpdateRequest;
import com.example.taskmanager.domain.model.TaskDTO;

public interface UpdateTask {
    TaskDTO update(String userName, TaskUpdateRequest taskUpdateRequest, Long id);
}
