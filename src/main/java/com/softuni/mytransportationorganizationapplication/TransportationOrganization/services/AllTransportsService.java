package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.ATDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.LTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.RTDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.STDetailsViewDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.AirTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.LandTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.RailTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.SeaTransportEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.AirTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.LandTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RailTransportRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.SeaTransportRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AllTransportsService {
    private LandTransportRepository LTRepository;
    private AirTransportRepository ATRepository;
    private RailTransportRepository RTRepository;
    private SeaTransportRepository STRepository;

    public AllTransportsService(LandTransportRepository LTRepository, AirTransportRepository ATRepository, RailTransportRepository RTRepository, SeaTransportRepository STRepository) {
        this.LTRepository = LTRepository;
        this.ATRepository = ATRepository;
        this.RTRepository = RTRepository;
        this.STRepository = STRepository;
    }


    public List<LTDetailsViewDTO> getAllLandTransports() {
        return LTRepository.findAll().stream().map(this::lMap).collect(Collectors.toList());
    }
    public List<ATDetailsViewDTO> getAllAirTransports() {
        return ATRepository.findAll().stream().map(this::aMap).collect(Collectors.toList());
    }
    public List<RTDetailsViewDTO> getAllRailTransports() {
        return RTRepository.findAll().stream().map(this::rMap).collect(Collectors.toList());
    }
    public List<STDetailsViewDTO> getAllSeaTransports() {
        return STRepository.findAll().stream().map(this::sMap).collect(Collectors.toList());
    }
    private ATDetailsViewDTO aMap(AirTransportEntity a) {
        return new ATDetailsViewDTO().
                setCargo(a.getCargo()).setDateOfEntry(a.getDateOfEntry()).
                setDateOfExit(a.getDateOfExit()).setExitPoint(a.getExitPoint()).
                setEntryPoint(a.getEntryPoint()).setId(a.getId()).
                setFlightNumber(a.getFlightNumber()).setStartPoint(a.getStartPoint()).
                setFinalDestination(a.getFinalDestination()).setHourOfEntry(a.getHourOfEntry()).
                setHourOfExit(a.getHourOfExit()).setPersonal(a.getPersonal()).
                setMission(a.getMission()).setNote(a.getNote()).
                setTMR(a.getTMR()).setPlaneType(a.getPlaneType());
    }
    private RTDetailsViewDTO rMap(RailTransportEntity a) {
        return new RTDetailsViewDTO().
                setCargo(a.getCargo()).setDateOfEntry(a.getDateOfEntry()).
                setDateOfExit(a.getDateOfExit()).setExitPoint(a.getExitPoint()).
                setEntryPoint(a.getEntryPoint()).setId(a.getId()).
                setCargoWeight(a.getCargoWeight()).setStartPoint(a.getStartPoint()).
                setFinalDestination(a.getFinalDestination()).setHourOfEntry(a.getHourOfEntry()).
                setHourOfExit(a.getHourOfExit()).setPersonal(a.getPersonal()).
                setMission(a.getMission()).setNote(a.getNote()).
                setTMR(a.getTMR()).setCompositionLength(a.getCompositionLength());
    }
    private STDetailsViewDTO sMap(SeaTransportEntity a) {
        return new STDetailsViewDTO().
                setCargo(a.getCargo()).setDateOfEntry(a.getDateOfEntry()).
                setDateOfExit(a.getDateOfExit()).setExitPoint(a.getExitPoint()).
                setEntryPoint(a.getEntryPoint()).setId(a.getId()).
                setStartPoint(a.getStartPoint()).
                setFinalDestination(a.getFinalDestination()).setHourOfEntry(a.getHourOfEntry()).
                setHourOfExit(a.getHourOfExit()).setPersonal(a.getPersonal()).
                setMission(a.getMission()).setNote(a.getNote()).
                setTMR(a.getTMR()).setWeight(a.getWeight()).setShipName(a.getShipName()).setShipType(a.getShipType());
    }
    private LTDetailsViewDTO lMap(LandTransportEntity LTEntity) {
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
