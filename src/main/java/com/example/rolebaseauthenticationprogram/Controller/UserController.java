package com.example.rolebaseauthenticationprogram.Controller;

import com.example.rolebaseauthenticationprogram.Entity.User;
import com.example.rolebaseauthenticationprogram.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    // If your want to execute the method as soon as the application starts, you have to use @PostConstruct.
    @PostConstruct
    public void initRolesAndUsers() {
        userService.initRolesAndUser();
    }

    @PostMapping({"/registerNewUser"})
    public User registerNewUser(@RequestBody User user) {
        return userService.registerNewUser(user);
    }

    @GetMapping({"/forAdmin"})
    public String forAdmin() {
        return "This URL is only accessible to admin";
    }
}
