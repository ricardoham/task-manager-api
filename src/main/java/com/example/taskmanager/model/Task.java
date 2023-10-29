package com.example.taskmanager.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String title;

    private String description;

    private String owner;

    private String createdBy;

    @Enumerated
    private TaskPriority taskPriority;

    private LocalDateTime createAt;

    private LocalDateTime updateAt;

    private LocalDateTime closedAt;

}
