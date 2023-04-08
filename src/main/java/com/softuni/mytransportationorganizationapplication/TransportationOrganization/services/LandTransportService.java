package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LandTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.LandTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.LandTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class LandTransportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final LandTransportRepository landTransportRepository;

    public LandTransportService(StatusRepository statusRepository, ModelMapper modelMapper, LandTransportRepository landTransportRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.landTransportRepository = landTransportRepository;
    }




    public void saveLandTransport(LandTransportRequestDTO ltr){
        StatusOfTransport defaultStatus = statusRepository.findStatusOfTransportByStatus(PENDING).orElseThrow();
        LandTransportEntity transportRequest = this.modelMapper.map(ltr, LandTransportEntity.class);
        transportRequest.setStatus(defaultStatus);
        this.landTransportRepository.saveAndFlush(transportRequest);
        landTransportRepository.saveAndFlush(transportRequest);
    }

}
