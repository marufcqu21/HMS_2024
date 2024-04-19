package com.maruf.hms.service.impl;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.repository.AdminRepository;
import com.maruf.hms.service.AdminInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService implements AdminInterface {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public boolean add(Admin admin){
        adminRepository.save(admin);
        return true;
    }
    @Override
    public Admin findById(Integer Id) {
        return null;
    }
}
