package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "seaTransports")
public class SeaTransportEntity extends BaseTransportEntity{
    @Column
    private String shipType;
    @Column
    private String shipName;
    @Column(nullable = false)
    private int weight;

    public SeaTransportEntity() {
    }

    public SeaTransportEntity(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status, String shipType, String shipName, int weight) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit, cargo, personal, mission, note, faxNumber, TMR, status);
        this.shipType = shipType;
        this.shipName = shipName;
        this.weight = weight;
    }

    public String getShipType() {
        return shipType;
    }

    public SeaTransportEntity setShipType(String shipType) {
        this.shipType = shipType;
        return this;
    }

    public String getShipName() {
        return shipName;
    }

    public SeaTransportEntity setShipName(String shipName) {
        this.shipName = shipName;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public SeaTransportEntity setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
