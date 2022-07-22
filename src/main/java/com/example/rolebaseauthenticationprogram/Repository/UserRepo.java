package com.example.rolebaseauthenticationprogram.Repository;

import com.example.rolebaseauthenticationprogram.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
