package com.maruf.hms.controller;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.entity.Doctor;
import com.maruf.hms.repository.DoctorRepository;
import com.maruf.hms.service.DoctorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctor")
@CrossOrigin(maxAge = 3600)
public class DoctorController {
     @Autowired
     private DoctorInterface doctorInterface;
     @GetMapping("/appointment")
     public ResponseEntity<String> getAppointment(){

         return new ResponseEntity<>("Booking Successful!", HttpStatus.OK);
     }
    @GetMapping("/appointment/all")
    public ResponseEntity<List<Admin>> getAll() {
        List<Admin> admins = doctorInterface.findAll();
        System.out.println(admins);
        return new ResponseEntity<>(doctorInterface.findAll(), HttpStatus.OK);
    }



}
