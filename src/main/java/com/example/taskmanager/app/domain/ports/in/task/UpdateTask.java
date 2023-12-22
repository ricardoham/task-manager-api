package com.example.taskmanager.app.domain.ports.in.task;

import com.example.taskmanager.adapter.api.controller.TaskUpdateRequest;
import com.example.taskmanager.app.domain.model.TaskDTO;

public interface UpdateTask {
    TaskDTO update(String userName, TaskUpdateRequest taskUpdateRequest, Long id);
}
