package com.example.taskmanager.domain.services.task;

import com.example.taskmanager.adapter.api.controller.TaskUpdateRequest;
import com.example.taskmanager.domain.model.Task;
import com.example.taskmanager.domain.model.TaskDTO;
import com.example.taskmanager.domain.ports.in.task.UpdateTask;
import com.example.taskmanager.domain.ports.out.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UpdateTaskService implements UpdateTask {
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public TaskDTO update(String userName, TaskUpdateRequest taskUpdateRequest, Long id) {
        Task task = taskRepository.findByIdAndCreatedBy(id, userName).orElseThrow();
        task.setTitle(taskUpdateRequest.getTitle());
        task.setDescription(taskUpdateRequest.getDescription());
        task.setOwner(taskUpdateRequest.getOwner());
        task.setTaskPriority(taskUpdateRequest.getTaskPriority());
        task.setUpdateAt(LocalDateTime.now());
        task.setClosedAt(taskUpdateRequest.getClosedAt());

        taskRepository.save(task);

        return TaskDTO.builder()
                .id(task.getId())
                .title(taskUpdateRequest.getTitle())
                .description(taskUpdateRequest.getDescription())
                .owner(taskUpdateRequest.getOwner())
                .createdBy(task.getCreatedBy())
                .taskPriority(taskUpdateRequest.getTaskPriority())
                .createAt(task.getCreateAt())
                .updateAt(LocalDateTime.now())
                .closedAt(taskUpdateRequest.getClosedAt())
                .build();
    }
}
