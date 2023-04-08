package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "landTransports")
public class LandTransportEntity extends BaseTransportEntity{
    @Column
    private String typeOfVehicle;
    @Column
    private String licensePlateNumber;
    @Column
    private String licensePlateNumberTrailer;
    @Column
    private String drivers;

    public LandTransportEntity() {
    }

    public LandTransportEntity(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status, String typeOfVehicle, String licensePlateNumber, String licensePlateNumberTrailer, String drivers) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit, cargo, personal, mission, note, faxNumber, TMR, status);
        this.typeOfVehicle = typeOfVehicle;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        this.drivers = drivers;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public LandTransportEntity setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        return this;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public LandTransportEntity setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    public String getLicensePlateNumberTrailer() {
        return licensePlateNumberTrailer;
    }

    public LandTransportEntity setLicensePlateNumberTrailer(String licensePlateNumberTrailer) {
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        return this;
    }

    public String getDrivers() {
        return drivers;
    }

    public LandTransportEntity setDrivers(String drivers) {
        this.drivers = drivers;
        return this;
    }
}
