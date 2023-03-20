package com.softuni.mytransportationorganizationapplication.TransportationOrganization.init;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.RolesEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RoleRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Init {
    RoleRepository roleRepository;
    @Autowired
    public Init(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @PostConstruct
    public void roleSetting(){
        RolesEntity admin = new RolesEntity().setRole(UserRoleEnum.ADMIN);
        RolesEntity moderator = new RolesEntity().setRole(UserRoleEnum.MODERATOR);
        RolesEntity user = new RolesEntity().setRole(UserRoleEnum.USER);
        RolesEntity client = new RolesEntity().setRole(UserRoleEnum.CLIENT);
        roleRepository.saveAndFlush(admin);
        roleRepository.saveAndFlush(moderator);
        roleRepository.saveAndFlush(user);
        roleRepository.saveAndFlush(client);
    }

}
