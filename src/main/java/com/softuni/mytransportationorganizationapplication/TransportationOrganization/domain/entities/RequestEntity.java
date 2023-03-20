package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "requests")
public class RequestEntity extends BaseTransportEntity {
   @ManyToOne
    private LandTransportEntity land;
   @ManyToOne
    private AirTransportEntity air;
    @ManyToOne
    private RailTransportEntity rail;
    @ManyToOne
    private SeaTransportEntity seaT;

    public RequestEntity() {
    }
}
