package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.config.SecurityConfig;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.AppUserDetails;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LandTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.TransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.UserRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class transportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final transportRepository transportRepository;
    private final UserRepository userRepository;

    private final SecurityConfig securityConfig;
    @Autowired
    public transportService(StatusRepository statusRepository,
                            ModelMapper modelMapper,
                            com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository transportRepository
            , UserRepository userRepository, SecurityConfig securityConfig) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.transportRepository = transportRepository;
        this.userRepository = userRepository;
        this.securityConfig = securityConfig;
    }


    public void saveLandTransport(LandTransportRequestDTO ltr) {
        StatusOfTransport defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        TransportEntity transportRequest = this.modelMapper.map(ltr, TransportEntity.class);
        transportRequest.setStatus(defaultStatus);
        transportRequest.setId(((AppUserDetails) securityConfig.userDetailsService(userRepository)
                .loadUserByUsername(securityConfig.loggedUsername())).getId());
        transportRepository.saveAndFlush(transportRequest);
    }

}
