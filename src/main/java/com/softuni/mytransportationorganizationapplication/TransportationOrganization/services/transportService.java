package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LandTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Status;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Transport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class transportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final transportRepository transportRepository;

    @Autowired
    public transportService(StatusRepository statusRepository,
                            ModelMapper modelMapper,
                            com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository transportRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.transportRepository = transportRepository;
    }

    //TODO: add
    public void saveLandTransport(LandTransportRequestDTO ltr) {
        Status defaultStatus = statusRepository
                .findStatusOfTransportByStatus(PENDING).orElseThrow();
        Transport transportRequest = this.modelMapper.map(ltr, Transport.class);
        transportRequest.setStatus(defaultStatus);
        transportRepository.saveAndFlush(transportRequest);
    }

}
