package com.maruf.hms.service.impl;

import com.maruf.hms.entity.Patient;
import com.maruf.hms.repository.PatientRepository;
import com.maruf.hms.service.PatientInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService implements PatientInterface {
    @Autowired
    private PatientRepository patientRepository;
    @Override
    public boolean add(Patient patient) {
        patientRepository.save(patient);
        return true;
    }

    @Override
    public boolean edit(Patient patient) {
        return false;
    }

    @Override
    public Patient read(String patientName) {
        return null;
    }

    @Override
    public boolean delete(Patient patient) {
        return false;
    }

    @Override
    public Patient search(Integer Id) {
        return null;
    }

    @Override
    public List<Patient> findAll() {
        return patientRepository.findAll();
    }


}
