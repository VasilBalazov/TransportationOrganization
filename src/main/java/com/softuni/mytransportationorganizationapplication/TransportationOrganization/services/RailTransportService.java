package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.AirTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.RailTransportRequestDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.AirTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.RailTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RailTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum.PENDING;

@Service
public class RailTransportService {
    private final StatusRepository statusRepository;
    private final ModelMapper modelMapper;
    private final RailTransportRepository railTransportRepository;

    public RailTransportService(StatusRepository statusRepository, ModelMapper modelMapper, RailTransportRepository railTransportRepository) {
        this.statusRepository = statusRepository;
        this.modelMapper = modelMapper;
        this.railTransportRepository = railTransportRepository;
    }


    public void saveRailTransport(RailTransportRequestDTO ltr){
        StatusOfTransport defaultStatus = statusRepository.findStatusOfTransportByStatus(PENDING).orElseThrow();
        RailTransportEntity transportRequest = this.modelMapper.map(ltr, RailTransportEntity.class);
        transportRequest.setStatus(defaultStatus);
        railTransportRepository.saveAndFlush(transportRequest);
    }

}
