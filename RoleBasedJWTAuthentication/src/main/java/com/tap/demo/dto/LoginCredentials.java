package com.tap.demo.dto;

public class LoginCredentials {
    private String username;
    private String role;

    public void SetUsername(String username){
        this.username=username;
    }

    public String getUsername(){
        return username;
    }

    public void setRole(String role){
        this.role=role;
    }

    public String getRole(){
        return role;
    }
}
