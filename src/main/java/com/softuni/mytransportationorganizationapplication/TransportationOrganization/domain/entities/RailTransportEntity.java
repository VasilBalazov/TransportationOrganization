package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "railTransports")
public class RailTransportEntity extends BaseTransportEntity {
    @Column(nullable = false)
    private int cargoWeight;
    @Column(nullable = false)
    private int compositionLength;

    public RailTransportEntity() {
    }

    public RailTransportEntity(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status, int cargoWeight, int compositionLength) {
        super(startPoint, finalDestination, entryPoint, dateOfEntry, hourOfEntry, exitPoint, dateOfExit, hourOfExit, cargo, personal, mission, note, faxNumber, TMR, status);
        this.cargoWeight = cargoWeight;
        this.compositionLength = compositionLength;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public RailTransportEntity setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }

    public int getCompositionLength() {
        return compositionLength;
    }

    public RailTransportEntity setCompositionLength(int compositionLength) {
        this.compositionLength = compositionLength;
        return this;
    }
}
