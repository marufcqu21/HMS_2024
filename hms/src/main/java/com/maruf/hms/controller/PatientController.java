package com.maruf.hms.controller;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Patient;
import com.maruf.hms.repository.PatientRepository;
import com.maruf.hms.request.PatientRequest;
import com.maruf.hms.service.DoctorInterface;
import com.maruf.hms.service.PatientInterface;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/api/patient")
@CrossOrigin(maxAge = 3600)
public class PatientController {
    @Autowired
    private PatientInterface patientInterface;

    @PostMapping("/prescription")
    public ResponseEntity<String> addAppointment(@RequestBody PatientRequest patientRequest ){
    System.out.println("Patient request" + patientRequest.toString());
    Patient patient= new Patient();
    patient.setDoctorId(10L);
    patient.setPatientName(patientRequest.getPatientName());
    patient.setDate(patientRequest.getDate());
    patient.setTime(new Time(Instant.now().toEpochMilli()));
    patient.setPrescription(patientRequest.getPrescription());
    patientInterface.add(patient);

    return new ResponseEntity<>("Successful",HttpStatus.OK);
    }


    @GetMapping("/appointment/all")
    public ResponseEntity<List<Patient>> getAll(){
        List<Patient> patients = patientInterface.findAll();
        System.out.println(patients);
        return new ResponseEntity<>(patientInterface.findAll(),HttpStatus.OK);
    }







}
