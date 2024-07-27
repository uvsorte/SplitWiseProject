package com.Splitwise.SplitwiseApp.service;

import com.Splitwise.SplitwiseApp.entity.User;

public interface UserService {
        User signUp(String name, String email, String password);
}
