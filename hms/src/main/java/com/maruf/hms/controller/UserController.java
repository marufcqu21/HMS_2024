package com.maruf.hms.controller;


import com.maruf.hms.entity.User;
import com.maruf.hms.repository.UserRepository;
import com.maruf.hms.request.LoginRequest;
import com.maruf.hms.request.LogoutRequest;
import com.maruf.hms.request.UserRequest;
import com.maruf.hms.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;
    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {
        System.out.println("Login request=" + loginRequest.toString());
        User user = userRepository.findByEmail(loginRequest.getEmail()).get();
        if (user.getPassword().equals(loginRequest.getPassword()))
        {
            return new ResponseEntity<>("Login Successful!", HttpStatus.OK);
        }
        return new ResponseEntity<>("Login Failed!", HttpStatus.BAD_REQUEST);
    }

    @PostMapping("/signup")
    public ResponseEntity<?> registerUser(@RequestBody UserRequest userRequest){
        System.out.println("User request=" + userRequest.toString());
        User user= new User();
        user.setUsertype(userRequest.getType());
        user.setName(userRequest.getName());
        user.setAge(userRequest.getAge());
        user.setCity(userRequest.getCity());
        user.setGender(userRequest.getGender());
        user.setPhone(userRequest.getPhone());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        userService.add(user);
        return new ResponseEntity<>("Successful!", HttpStatus.OK);
    }

    @PostMapping("/signout")
    public ResponseEntity<?> logoutUser(@RequestBody LogoutRequest logoutRequest){

        return new ResponseEntity<>("Logout Successful!", HttpStatus.OK);
    }
}
