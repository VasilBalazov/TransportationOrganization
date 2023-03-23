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



    @Autowired
    public InitService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;

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


}
