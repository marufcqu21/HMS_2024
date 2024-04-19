package com.maruf.hms.service;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Patient;

import java.util.List;

public interface PatientInterface {
    boolean add(Patient patient);
    boolean edit(Patient patient);
    Patient read(String patientName);
    boolean delete(Patient patient);
    Patient search(Integer Id);


    List<Patient> findAll();
}
