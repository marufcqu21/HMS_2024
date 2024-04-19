package com.maruf.hms.service;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Doctor;
import com.maruf.hms.entity.Patient;

import java.util.List;

public interface DoctorInterface {
    boolean add(Doctor doctor);
    boolean edit(Doctor doctor);
    Doctor read(String patientName);
    boolean delete(Doctor doctor);
    Doctor search(Long appointmentId);

    List<Admin> findAll();
}
