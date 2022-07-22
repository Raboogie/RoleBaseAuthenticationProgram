package com.example.rolebaseauthenticationprogram.Repository;

import com.example.rolebaseauthenticationprogram.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {

}
