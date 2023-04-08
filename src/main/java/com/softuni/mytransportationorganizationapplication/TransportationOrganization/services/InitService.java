package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UsersRolesEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RoleRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitService {
    private final RoleRepository roleRepository;
    private final StatusRepository statusRepository;


    @Autowired
    public InitService(RoleRepository roleRepository, StatusRepository statusRepository) {
        this.roleRepository = roleRepository;

        this.statusRepository = statusRepository;
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
    public void statusSetting(){
        if (statusRepository.count() == 0) {
            StatusOfTransport approved = new StatusOfTransport().setStatus(StatusOfTransportEnum.APPROVED);
            StatusOfTransport pending = new StatusOfTransport().setStatus(StatusOfTransportEnum.PENDING);
            StatusOfTransport onCall = new StatusOfTransport().setStatus(StatusOfTransportEnum.ON_CALL);
            StatusOfTransport canceled = new StatusOfTransport().setStatus(StatusOfTransportEnum.CANCELED);
            StatusOfTransport refused = new StatusOfTransport().setStatus(StatusOfTransportEnum.REFUSED);
            statusRepository.saveAndFlush(approved);
            statusRepository.saveAndFlush(pending);
            statusRepository.saveAndFlush(onCall);
            statusRepository.saveAndFlush(canceled);
            statusRepository.saveAndFlush(refused);
        }
    }
}
