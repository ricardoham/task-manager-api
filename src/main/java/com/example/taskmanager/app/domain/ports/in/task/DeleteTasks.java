package com.example.taskmanager.app.domain.ports.in.task;

import java.util.List;

public interface DeleteTasks {
    void deleteTask(Long id, String userName);

    void deleteTasks(List<Long> ids);
}
