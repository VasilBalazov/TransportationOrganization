package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "airTransports")
public class AirTransportEntity extends BaseTransportEntity{
    @Column
    private String planeType;
    @Column
    private String flightNumber;

    public AirTransportEntity() {
    }

    public AirTransportEntity(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status, String planeType, String flightNumber) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit, cargo, personal, mission, note, faxNumber, TMR, status);
        this.planeType = planeType;
        this.flightNumber = flightNumber;
    }

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
