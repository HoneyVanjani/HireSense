package com.hiresense.auth.service.impl;

import com.hiresense.auth.model.User;
import com.hiresense.auth.service.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public void register(User user) {
        // Temporary logic (no DB)
        System.out.println("Registering user: " + user.getEmail());
    }

    @Override
    public String login(User user) {
        // Temporary logic
        if ("admin@hiresense.com".equals(user.getEmail())) {
            return "Login successful";
        }
        return "Invalid credentials";
    }
}
