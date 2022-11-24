/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Model;

/**
 *
 * @author 35386
 */
public class UserInfo {
    private final String password;
    private final String email;
    private final String username;
    
    public UserInfo(String password, String email, String username){
        this.password = password;
        this.email = email;
        this.username = username;
    }
    
    public String getPassword(){
        return this.password;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getUsername(){
        return this.username;
    }
}
