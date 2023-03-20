package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "railTransports")
public class RailTransportEntity extends BaseTransportEntity {
    @Column(nullable = false)
    private int cargoWeight;
    @Column(nullable = false)
    private int compositionLength;



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
