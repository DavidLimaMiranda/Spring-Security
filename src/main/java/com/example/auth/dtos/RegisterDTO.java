package com.example.auth.dtos;

import com.example.auth.domain.user.UserRole;

public record RegisterDTO(String login, String password, UserRole role) {
}
