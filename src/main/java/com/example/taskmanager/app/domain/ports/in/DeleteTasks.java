package com.example.taskmanager.app.domain.ports.in;

import java.util.List;

public interface DeleteTasks {
    void deleteTask(Long id);
    void deleteTasks(List<Long> ids);
}
