package com.example.taskmanager.domain.ports.in.task;

import com.example.taskmanager.domain.model.Task;

import java.util.List;

public interface GetTasks {
    Task retrieve(Long id, String userName);

    List<Task> retrieveAll(String userName);
}
