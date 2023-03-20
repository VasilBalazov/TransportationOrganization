package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "airTransports")
public class AirTransportEntity extends BaseTransportEntity{
    @Column
    private String planeType;
    @Column
    private String flightNumber;




    public String getPlaneType() {
        return planeType;
    }

    public AirTransportEntity setPlaneType(String planeType) {
        this.planeType = planeType;
        return this;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public AirTransportEntity setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

}
