package com.example.taskmanager.domain.ports.in.task;

import java.util.List;

public interface DeleteTasks {
    void deleteTask(Long id, String userName);

    void deleteTasks(List<Long> ids);
}
