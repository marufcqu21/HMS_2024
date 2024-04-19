package com.maruf.hms.service.impl;

import com.maruf.hms.entity.User;
import com.maruf.hms.repository.UserRepository;
import com.maruf.hms.service.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserInterface {
    @Autowired
    private UserRepository userRepository;
    @Override
    public boolean add(User user) {
        userRepository.save(user);
        return true;
    }

    @Override
    public boolean edit(User user) {
        return false;
    }

    @Override
    public User read(String email) {
        return null;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public User search(String name) {
        return null;
    }
}
