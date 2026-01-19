package com.hiresense.auth.service;

import com.hiresense.auth.model.User;

public interface AuthService {

    void register(User user);

    String login(User user);
}
