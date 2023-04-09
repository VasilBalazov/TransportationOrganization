package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UserEntity;
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
        UserEntity admin = new UserEntity().setUsername("admin").
                setEmail("admin@test.com").
                setRoles(roleRepository.findAll()).
                setPassword(passwordEncoder.encode("admin"));
        userRepository.save(admin);
    }
    private void initModerator(){

        var moderatorRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.MODERATOR).orElseThrow();
        var userRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.USER).orElseThrow();
        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();
        UserEntity moderator = new UserEntity().
                setEmail("moderator@test.com").
                setUsername("moderator").
                setPassword(passwordEncoder.encode("moderator")).
                setRoles(List.of(moderatorRole, userRole, clientRole));
        userRepository.save(moderator);
    }
    private void initNormalUser(){

        var userRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.USER).orElseThrow();
        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();
        UserEntity user = new UserEntity().
                setEmail("user@test.com").
                setUsername("user").
                setPassword(passwordEncoder.encode("user")).
                setRoles(List.of(userRole, clientRole));
        userRepository.save(user);
    }
    private void initClient(){

        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();

        UserEntity client = new UserEntity().
                setEmail("client@test.com").
                setUsername("client").
                setPassword(passwordEncoder.encode("client")).
                setRoles(List.of(clientRole));
        userRepository.save(client);
    }
}
