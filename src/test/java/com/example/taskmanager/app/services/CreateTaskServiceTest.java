package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.test_data_builder.task.TaskDataTestBuilder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CreateTaskServiceTest {

    @Mock
    private TaskRepository taskRepository;

    private CreateTaskService subject;

    @BeforeEach
    void setTest() {
        subject = new CreateTaskService(taskRepository);
    }

    @Test
    @DisplayName("Given a task request, " +
            "when create a new task, " +
            "then create the new task")
    void createTask() {
        Task task = TaskDataTestBuilder.build();
        Mockito.when(taskRepository.save(task)).thenReturn(task);
        subject.create(task);

        Mockito.verify(taskRepository, Mockito.times(1)).save(task);
    }

}