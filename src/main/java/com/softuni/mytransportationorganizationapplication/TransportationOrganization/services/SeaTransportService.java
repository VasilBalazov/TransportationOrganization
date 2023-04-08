package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.AirTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.SeaTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.AirTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.SeaTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.SeaTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class SeaTransportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final SeaTransportRepository seaTransportRepository;

    public SeaTransportService(StatusRepository statusRepository, ModelMapper modelMapper, SeaTransportRepository seaTransportRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.seaTransportRepository = seaTransportRepository;
    }


    public void saveSeaTransport(SeaTransportRequestDTO ltr){
        StatusOfTransport defaultStatus = statusRepository.findStatusOfTransportByStatus(PENDING).orElseThrow();
        SeaTransportEntity transportRequest = this.modelMapper.map(ltr, SeaTransportEntity.class);
        transportRequest.setStatus(defaultStatus);
        seaTransportRepository.saveAndFlush(transportRequest);
    }

}
