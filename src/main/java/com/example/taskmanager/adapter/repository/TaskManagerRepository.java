package com.example.taskmanager.adapter.repository;

import com.example.taskmanager.app.domain.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskManagerRepository extends JpaRepository<Task, Long> {
}
