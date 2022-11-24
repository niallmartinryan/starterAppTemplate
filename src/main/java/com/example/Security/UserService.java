/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Security;

import com.example.Model.UserInfo;
import org.springframework.security.crypto.bcrypt.BCrypt;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author 35386
 */
@RestController
@RequestMapping("/UserService")
public class UserService {
    
    @RequestMapping("/login")
    public String login(@RequestBody UserInfo userInfo){
        String hashed = "updateThis";
        if(BCrypt.checkpw("oscar", userInfo.getPassword())){
            return "true";
        } else{
            return "false";
        } 
    }
    
    @RequestMapping("/signUp")
    public String signUp(@RequestBody UserInfo userInfo){
        String hashpw = BCrypt.hashpw(userInfo.getPassword(), BCrypt.gensalt());
        return hashpw;
    }
}
