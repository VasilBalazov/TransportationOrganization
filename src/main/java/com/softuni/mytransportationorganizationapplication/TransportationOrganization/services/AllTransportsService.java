package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Transport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllTransportsService {
    private transportRepository transportRepository;

    public AllTransportsService(com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.transportRepository transportRepository) {
        this.transportRepository = transportRepository;
    }


    public List<LTDetailsViewDTO> getAllLandTransports() {
        return transportRepository.findAll().stream().map(this::lMap).collect(Collectors.toList());
    }

    private LTDetailsViewDTO lMap(Transport LTEntity) {
        return new LTDetailsViewDTO().
                setCargo(LTEntity.getCargo()).setDateOfEntry(LTEntity.getDateOfEntry()).
                setDateOfExit(LTEntity.getDateOfExit()).setExitPoint(LTEntity.getExitPoint()).
                setEntryPoint(LTEntity.getEntryPoint()).setId(LTEntity.getId()).
                setDrivers(LTEntity.getDrivers()).setStartPoint(LTEntity.getStartPoint()).
                setFinalDestination(LTEntity.getFinalDestination()).setHourOfEntry(LTEntity.getHourOfEntry()).
                setHourOfExit(LTEntity.getHourOfExit()).setPersonal(LTEntity.getPersonal()).
                setMission(LTEntity.getMission()).setNote(LTEntity.getNote()).
                setTMR(LTEntity.getTMR()).setTypeOfVehicle(LTEntity.getTypeOfVehicle()).
                setLicensePlateNumber(LTEntity.getLicensePlateNumber()).setLicensePlateNumberTrailer(LTEntity.getLicensePlateNumberTrailer());
    }
}
