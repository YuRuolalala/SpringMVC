package com.service.impl;

import com.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {


    @Override
    public void save() {
        System.out.println("UserService save...");
    }
}
