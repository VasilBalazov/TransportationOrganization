package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UserEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UsersRolesEntity;
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
public class InitService {
    private final RoleRepository roleRepository;
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;


    @Autowired
    public InitService(RoleRepository roleRepository, UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @PostConstruct
    public void roleSetting(){
        if (roleRepository.count() == 0) {
            UsersRolesEntity admin = new UsersRolesEntity().setRole(UserRoleEnum.ADMIN);
            UsersRolesEntity moderator = new UsersRolesEntity().setRole(UserRoleEnum.MODERATOR);
            UsersRolesEntity user = new UsersRolesEntity().setRole(UserRoleEnum.USER);
            UsersRolesEntity client = new UsersRolesEntity().setRole(UserRoleEnum.CLIENT);
            roleRepository.saveAndFlush(admin);
            roleRepository.saveAndFlush(moderator);
            roleRepository.saveAndFlush(user);
            roleRepository.saveAndFlush(client);
        }
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
        UserEntity admin = new UserEntity().setFullName("Admin Adminov").
                setEmail("admin@test.com")
                .setJob("admin").
                setOrganization("administration").
                setRoles(roleRepository.findAll()).
                setPassword(passwordEncoder.encode("administrator"));
        userRepository.save(admin);
    }
    private void initModerator(){

        var moderatorRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.MODERATOR).orElseThrow();

        UserEntity moderator = new UserEntity().
                setEmail("moderator@test.com").
                setFullName("Moderator Moderatorov").
                setJob("moderator").
                setOrganization("moderators").
                setPassword(passwordEncoder.encode("moderator")).
                setRoles(List.of(moderatorRole));
        userRepository.save(moderator);
    }
    private void initNormalUser(){

        var userRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.USER).orElseThrow();

        UserEntity user = new UserEntity().
                setEmail("user@test.com").
                setFullName("User User").
                setJob("user").
                setOrganization("users").
                setPassword(passwordEncoder.encode("user")).
                setRoles(List.of(userRole));
        userRepository.save(user);
    }
    private void initClient(){

        var clientRole = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.CLIENT).orElseThrow();

        UserEntity client = new UserEntity().
                setEmail("client@test.com").
                setFullName("Client Client").
                setJob("client").
                setOrganization("clients").
                setPassword(passwordEncoder.encode("client")).
                setRoles(List.of(clientRole));
        userRepository.save(client);
    }

}
