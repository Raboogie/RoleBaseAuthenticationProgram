package com.example.rolebaseauthenticationprogram.Service;

import com.example.rolebaseauthenticationprogram.Entity.Role;
import com.example.rolebaseauthenticationprogram.Repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
@Transactional
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;

    public Role createNewRole(Role role) {
        return roleRepo.save(role);
    }
}
