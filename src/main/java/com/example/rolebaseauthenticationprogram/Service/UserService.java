package com.example.rolebaseauthenticationprogram.Service;

import com.example.rolebaseauthenticationprogram.Entity.User;
import com.example.rolebaseauthenticationprogram.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public User registerNewUser(User user) {
        return userRepo.save(user);
    }
}
