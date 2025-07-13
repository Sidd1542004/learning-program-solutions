package com.example.springrest.controller;

import com.example.springrest.model.AuthRequest;
import com.example.springrest.util.JwtUtil;
import org.springframework.web.bind.annotation.*;

@RestController
public class AuthController {

    @PostMapping("/authenticate")
    public String authenticate(@RequestBody AuthRequest request) {
        if ("admin".equals(request.getUsername()) && "password".equals(request.getPassword())) {
            return JwtUtil.generateToken(request.getUsername());
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }
}
