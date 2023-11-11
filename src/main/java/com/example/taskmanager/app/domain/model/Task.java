package com.example.taskmanager.app.domain.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
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
