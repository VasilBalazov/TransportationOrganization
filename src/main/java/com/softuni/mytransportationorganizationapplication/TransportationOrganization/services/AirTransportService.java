package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.AirTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.AirTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.AirTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class AirTransportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final AirTransportRepository airTransportRepository;

    public AirTransportService(StatusRepository statusRepository, ModelMapper modelMapper, AirTransportRepository airTransportRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.airTransportRepository = airTransportRepository;
    }




    public void saveAirTransport(AirTransportRequestDTO ltr){
        StatusOfTransport defaultStatus = statusRepository.findStatusOfTransportByStatus(PENDING).orElseThrow();
        AirTransportEntity transportRequest = this.modelMapper.map(ltr, AirTransportEntity.class);
        transportRequest.setStatus(defaultStatus);
        airTransportRepository.saveAndFlush(transportRequest);
    }

}
