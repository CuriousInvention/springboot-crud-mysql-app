package com.kkdevportal.springboot_crud_mysql_app.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {
    public enum USER_ROLE {
        ADMIN,           // Full access to all resources
        MODERATOR,       // Can manage content but not users
        MANAGER,         // Can manage assigned departments or users
        EMPLOYEE,        // Regular authenticated user
        GUEST            // Read-only or limited access
    }

    @Id
    private String userId;

    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String email;

    private USER_ROLE role;
}


