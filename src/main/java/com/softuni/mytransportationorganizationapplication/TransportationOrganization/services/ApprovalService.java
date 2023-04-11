package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.LandTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.LandTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.StatusRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApprovalService {
    private final LandTransportRepository landTransportRepository;

    public ApprovalService(LandTransportRepository landTransportRepository) {
        this.landTransportRepository = landTransportRepository;
    }


    public List<LTDetailsViewDTO> getAllUnapproved() {
        return
                landTransportRepository.findAllByStatus_IdIs("2").stream().map(this::map).collect(Collectors.toList());
    }

    private LTDetailsViewDTO map(LandTransportEntity LTEntity) {
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
