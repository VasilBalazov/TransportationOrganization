package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.ModeOfTransportation;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Status;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UsersRoles;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.MOTRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RoleRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InitService {
    private final RoleRepository roleRepository;
    private final StatusRepository statusRepository;
    private final MOTRepository motRepository;


    @Autowired
    public InitService(RoleRepository roleRepository, StatusRepository statusRepository, MOTRepository motRepository) {
        this.roleRepository = roleRepository;

        this.statusRepository = statusRepository;
        this.motRepository = motRepository;
    }

    @PostConstruct
    public void roleSetting(){
        if (roleRepository.count() == 0) {
            UsersRoles admin = new UsersRoles().setRole(UserRoleEnum.ADMIN);
            UsersRoles moderator = new UsersRoles().setRole(UserRoleEnum.MODERATOR);
            UsersRoles user = new UsersRoles().setRole(UserRoleEnum.USER);
            UsersRoles client = new UsersRoles().setRole(UserRoleEnum.CLIENT);
            roleRepository.saveAndFlush(admin);
            roleRepository.saveAndFlush(moderator);
            roleRepository.saveAndFlush(user);
            roleRepository.saveAndFlush(client);
        }
    }

    @PostConstruct
    public void statusSetting(){
        if (statusRepository.count() == 0) {
            Status approved = new Status().setStatus(StatusOfTransportEnum.APPROVED);
            Status pending = new Status().setStatus(StatusOfTransportEnum.PENDING);
            Status onCall = new Status().setStatus(StatusOfTransportEnum.ON_CALL);
            Status canceled = new Status().setStatus(StatusOfTransportEnum.CANCELED);
            Status refused = new Status().setStatus(StatusOfTransportEnum.REFUSED);
            statusRepository.saveAndFlush(approved);
            statusRepository.saveAndFlush(pending);
            statusRepository.saveAndFlush(onCall);
            statusRepository.saveAndFlush(canceled);
            statusRepository.saveAndFlush(refused);
        }
    }
    @PostConstruct
    public void MOTSetting(){
        if (motRepository.count() == 0) {
            ModeOfTransportation land = new ModeOfTransportation().setModeOfTransportation(MOT.LAND);
            ModeOfTransportation air = new ModeOfTransportation().setModeOfTransportation(MOT.AIR);
            ModeOfTransportation rail = new ModeOfTransportation().setModeOfTransportation(MOT.RAIL);
            ModeOfTransportation sea = new ModeOfTransportation().setModeOfTransportation(MOT.SEA);

            motRepository.saveAndFlush(land);
            motRepository.saveAndFlush(air);
            motRepository.saveAndFlush(rail);
            motRepository.saveAndFlush(sea);
        }
    }
}
