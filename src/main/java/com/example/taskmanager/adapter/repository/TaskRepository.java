package com.example.taskmanager.adapter.repository;

import com.example.taskmanager.app.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    Optional<Task> findByIdAndCreatedBy(Long id, String createdBy);

    List<Task> findAllByCreatedBy(String createdBy);
}
