package com.tap.demo.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tap.demo.dto.LoginCredentials;
import com.tap.demo.util.JWTUtil;


@RestController
@RequestMapping("/auth")
public class AuthController {
    private final JWTUtil jwtUtil;
    public AuthController(JWTUtil jWTUtil1){
        this.jwtUtil=jWTUtil1;
    }

    @PostMapping("/login")
    public Map<String,String>login(@RequestBody LoginCredentials credentials){
        String name=credentials.getUsername();
        String role=credentials.getRole();

        System.out.println("Username: "+name+"Role: "+role);

        String token=jwtUtil.generateToken(credentials.getUsername(),credentials.getRole());
        return Map.of("token",token);
    }
}
