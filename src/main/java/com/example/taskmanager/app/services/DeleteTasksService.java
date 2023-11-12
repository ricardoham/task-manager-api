package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.ports.in.task.DeleteTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeleteTasksService implements DeleteTasks {

    @Autowired
    TaskRepository taskRepository;

    // TODO implement soft delete
    @Override
    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteTasks(List<Long> ids) {

    }
}
