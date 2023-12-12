package com.example.taskmanager.app.services;

import com.example.taskmanager.adapter.repository.TaskRepository;
import com.example.taskmanager.app.domain.model.Task;
import com.example.taskmanager.app.domain.ports.in.task.GetTasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetTasksService implements GetTasks {
    @Autowired
    private TaskRepository taskManagerRepository;


    @Override
    public Task retrieve(Long id, String userName) {

        return taskManagerRepository.findByIdAndCreatedBy(id, userName).orElseThrow();
    }

    public List<Task> retrieveAll(String userName) {

        return taskManagerRepository.findAllByCreatedBy(userName);
    }
}
