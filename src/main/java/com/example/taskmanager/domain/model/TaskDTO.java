package com.example.taskmanager.domain.model;

import jakarta.persistence.Enumerated;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record TaskDTO(Long id,
                      String title,
                      String description,
                      String owner,
                      String createdBy,
                      @Enumerated
                      TaskPriority taskPriority,
                      LocalDateTime createAt,
                      LocalDateTime updateAt,
                      LocalDateTime closedAt) {
}
