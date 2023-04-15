package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.User;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RoleRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InitTestData {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    @Autowired
    public InitTestData(UserRepository userRepository, PasswordEncoder passwordEncoder, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;

        this.roleRepository = roleRepository;
    }

    @PostConstruct
    @DependsOn("roleSetting")
    private void initUsers() {
        if (userRepository.count() == 0) {
            initAdmin();
            initModerator();
            initNormalUser();
            initClient();
        }
    }

    private void initAdmin(){
        User admin = new User();
        admin.setEmail("admin@test.com");
        admin.setUsername("admin");
        admin.setRoles(roleRepository.findAll());
        admin.setPassword(passwordEncoder.encode("admin"));
        userRepository.save(admin);
    }
    private void initModerator(){

        var moderatorRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.MODERATOR).orElseThrow();
        var userRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.USER).orElseThrow();
        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();
        User moderator = new User();
        moderator.setEmail("moderator@test.com");
        moderator.setUsername("moderator");
        moderator.setEmail("moderator@test.com");
        moderator.setPassword(passwordEncoder.encode("moderator"));
        moderator.setRoles(List.of(moderatorRole, userRole, clientRole));
        userRepository.save(moderator);
    }
    private void initNormalUser(){

        var userRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.USER).orElseThrow();
        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();
        User user = new User();
        user.setEmail("user@test.com");
        user.setUsername("user");
        user.setPassword(passwordEncoder.encode("user"));
        user.setRoles(List.of(userRole, clientRole));
        userRepository.save(user);
    }
    private void initClient(){

        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();

        User client = new User();
        client.setEmail("client@test.com");
        client.setUsername("client");
        client.setPassword(passwordEncoder.encode("client"));
        client.setRoles(List.of(clientRole));
        userRepository.save(client);
    }
}
