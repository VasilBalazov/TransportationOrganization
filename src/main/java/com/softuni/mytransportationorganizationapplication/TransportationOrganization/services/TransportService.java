package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.*;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.ModeOfTransportation;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Status;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Transport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.User;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.MOTRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.UserRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.TransportRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class TransportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final TransportRepository transportRepository;
    private final UserRepository userRepository;
    private final MOTRepository motRepository;

    @Autowired
    public TransportService(StatusRepository statusRepository,
                            ModelMapper modelMapper,
                            TransportRepository transportRepository, UserRepository userRepository, MOTRepository motRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.transportRepository = transportRepository;
        this.userRepository = userRepository;
        this.motRepository = motRepository;
    }


    //TODO: add
    public void saveLandTransport(LandTransportRequestDTO ltr, AppUserDetails appUserDetails) {
        Status defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        ModeOfTransportation mot = motRepository.findById(1L).orElseThrow();
        User requester = userRepository.findUserByUsername(appUserDetails.getUsername()).orElseThrow();

        Transport transportRequest = this.modelMapper.map(ltr, Transport.class);
        transportRequest.setStatus(defaultStatus);
        transportRequest.setUser(requester);
        transportRequest.setModesOfTransportation(mot);
        transportRepository.saveAndFlush(transportRequest);
    }
    public void saveAirTransport(AirTransportRequestDTO atr, AppUserDetails appUserDetails) {
        Status defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        ModeOfTransportation mot = motRepository.findById(1L).orElseThrow();
        User requester = userRepository.findUserByUsername(appUserDetails.getUsername()).orElseThrow();

        Transport transportRequest = this.modelMapper.map(atr, Transport.class);
        transportRequest.setStatus(defaultStatus);
        transportRequest.setUser(requester);
        transportRequest.setModesOfTransportation(mot);
        transportRepository.saveAndFlush(transportRequest);
    }
    public void saveRailTransport(RailTransportRequestDTO rtr, AppUserDetails appUserDetails) {
        Status defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        ModeOfTransportation mot = motRepository.findById(1L).orElseThrow();
        User requester = userRepository.findUserByUsername(appUserDetails.getUsername()).orElseThrow();

        Transport transportRequest = this.modelMapper.map(rtr, Transport.class);
        transportRequest.setStatus(defaultStatus);
        transportRequest.setUser(requester);
        transportRequest.setModesOfTransportation(mot);
        transportRepository.saveAndFlush(transportRequest);
    }
    public void saveSeaTransport(SeaTransportRequestDTO str, AppUserDetails appUserDetails) {
        Status defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        ModeOfTransportation mot = motRepository.findById(1L).orElseThrow();
        User requester = userRepository.findUserByUsername(appUserDetails.getUsername()).orElseThrow();

        Transport transportRequest = this.modelMapper.map(str, Transport.class);
        transportRequest.setStatus(defaultStatus);
        transportRequest.setUser(requester);
        transportRequest.setModesOfTransportation(mot);
        transportRepository.saveAndFlush(transportRequest);
    }
}
