package com.example.todolist.service;
import org.springframework.stereotype.Component;

@Component
public class LoginService {
    public boolean validateUser(String userid, String password)
    {
        return userid.equalsIgnoreCase("siva") && password.equals("admin");
    }
}
