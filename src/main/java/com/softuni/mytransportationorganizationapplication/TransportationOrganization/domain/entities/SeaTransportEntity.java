package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "seaTransports")
public class SeaTransportEntity extends BaseTransportEntity{
    @Column
    private String shipType;
    @Column
    private String shipName;
    @Column(nullable = false)
    private int weight;



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
