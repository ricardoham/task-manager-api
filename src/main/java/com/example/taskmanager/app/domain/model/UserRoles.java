package com.example.taskmanager.app.domain.model;

public enum UserRoles {
    ADMIN("admin"),
    EDITOR("editor"),
    VIEWER("viewer"),
    ;

    private final String role;


    UserRoles(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
