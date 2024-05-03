package com.example.taskmanager.domain.services.task;

import com.example.taskmanager.domain.ports.in.task.DeleteTasks;
import com.example.taskmanager.domain.ports.out.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeleteTasksService implements DeleteTasks {

    @Autowired
    TaskRepository taskRepository;

    // TODO implement soft delete
    @Override
    public void deleteTask(Long id, String userName) {
        taskRepository.deleteById(id);
    }

    @Override
    public void deleteTasks(List<Long> ids) {

    }
}
