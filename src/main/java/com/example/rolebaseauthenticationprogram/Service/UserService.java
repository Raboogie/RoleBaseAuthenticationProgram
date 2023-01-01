package com.example.rolebaseauthenticationprogram.Service;

import com.example.rolebaseauthenticationprogram.Entity.Role;
import com.example.rolebaseauthenticationprogram.Entity.User;
import com.example.rolebaseauthenticationprogram.Repository.RoleRepo;
import com.example.rolebaseauthenticationprogram.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private RoleRepo roleRepo;

    public User registerNewUser(User user) {
        return userRepo.save(user);
    }

    public void initRolesAndUser() {
        Role adminRole = new Role();
        adminRole.setRoleName("AdminRole");
        adminRole.setRoleDescription("Admin role default description example sentence");
        roleRepo.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("User role default description example sentence");
        roleRepo.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("AdminUserFirstName");
        adminUser.setUserLastName("AdminUserLastName");
        adminUser.setUserName("AdminUserName123");
        adminUser.setUserPassword("AdminUserPassword@pass123");


        Set<Role> adminRolesSet = new HashSet<>();
        adminRolesSet.add(adminRole);
        adminUser.setRole(adminRolesSet);
        userRepo.save(adminUser);

        User normalUser1 = new User();
        normalUser1.setUserFirstName("NormalUser1FirstName");
        normalUser1.setUserLastName("NormalUser1LastName");
        normalUser1.setUserName("NormalUser1Name123");
        normalUser1.setUserPassword("NormalUser1Password@pass123");


        Set<Role> userRolesSet = new HashSet<>();
        userRolesSet.add(userRole);
        normalUser1.setRole(userRolesSet);
        userRepo.save(normalUser1);
    }
}
