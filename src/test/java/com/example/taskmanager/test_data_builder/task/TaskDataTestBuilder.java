package com.example.taskmanager.test_data_builder.task;

import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.domain.model.TaskPriority;

import java.time.LocalDateTime;

public class TaskDataTestBuilder {
    public static Task build() {
        Task task = new Task();
        task.setId(1L);
        task.setTitle("Default Title");
        task.setDescription("Default Description");
        task.setOwner("Default Owner");
        task.setCreatedBy("Default Creator");
        task.setTaskPriority(TaskPriority.LOW);
        task.setCreateAt(LocalDateTime.now());
        task.setUpdateAt(null);
        task.setClosedAt(null);
        return task;
    }
}
