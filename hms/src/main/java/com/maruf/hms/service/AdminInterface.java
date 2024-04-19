package com.maruf.hms.service;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Doctor;

public interface AdminInterface {
    boolean add(Admin admin);

    Admin findById(Integer Id);
}
