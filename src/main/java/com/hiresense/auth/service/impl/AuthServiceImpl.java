package com.hiresense.auth.service.impl;

import com.hiresense.auth.model.User;
import com.hiresense.auth.service.AuthService;
import com.hiresense.auth.service.JwtService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final JwtService jwtService;

    public AuthServiceImpl(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @Override
    public String login(User user) {

        // TEMP validation
        if ("admin@hiresense.com".equals(user.getEmail())
                && "1234".equals(user.getPassword())) {

            return jwtService.generateToken(user.getEmail());
        }

        throw new RuntimeException("Invalid credentials");
    }
}

