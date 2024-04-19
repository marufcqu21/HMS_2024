package com.maruf.hms.controller;

import com.maruf.hms.entity.Admin;
import com.maruf.hms.repository.AdminRepository;
import com.maruf.hms.request.AdminRequest;
import com.maruf.hms.request.UserRequest;
import com.maruf.hms.service.impl.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(maxAge = 3600)
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/details")
    public ResponseEntity<String> getDetails(){

        return null;
    }

    @PostMapping("/book")
    public ResponseEntity<?> bookUser(@RequestBody AdminRequest adminRequest){
        System.out.println("Admin request" + adminRequest.toString());
        Admin admin = new Admin();
        admin.setDoctorName(adminRequest.getDoctorName());
        admin.setPatientName(adminRequest.getPatientName());
        admin.setTime(new Time(System.currentTimeMillis()));
        admin.setDate(adminRequest.getDate());
        adminService.add(admin);

            return new ResponseEntity<>("Booking successful!",HttpStatus.OK);

    }

}
