package com.maruf.hms.service;

import com.maruf.hms.entity.User;

public interface UserInterface {
    boolean add(User user);
    boolean edit(User user);
    User read(String email);
    boolean delete(User user);
    User search(String name);



}
