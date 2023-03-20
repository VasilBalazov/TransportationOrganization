package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

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
