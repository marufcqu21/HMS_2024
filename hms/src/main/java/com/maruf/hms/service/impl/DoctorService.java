package com.maruf.hms.service.impl;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Doctor;
import com.maruf.hms.repository.AdminRepository;
import com.maruf.hms.repository.DoctorRepository;
import com.maruf.hms.service.DoctorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService implements DoctorInterface {
    @Autowired
    private AdminRepository adminRepository;
    @Override
    public boolean add(Doctor doctor) {
        return false;
    }

    @Override
    public boolean edit(Doctor doctor) {
        return false;
    }

    @Override
    public Doctor read(String patientName) {
        return null;
    }

    @Override
    public boolean delete(Doctor doctor) {
        return false;
    }

    @Override
    public Doctor search(Long appointmentId) {
        return null;
    }

    @Override
    public List<Admin> findAll() {
        return adminRepository.findAll();

    }
}
