package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "transports")
public class Transport extends BaseEntity{
    @Column(nullable = false)
    private String type;
    @Column(nullable = false)
    private String startPoint;
    @Column(nullable = false)
    private String finalDestination;
    @Column(nullable = false)
    private String entryPoint;
    @Column(nullable = false)
    private String dateOfEntry;
    @Column
    private String hourOfEntry;
    @Column(nullable = false)
    private String exitPoint;
    @Column(nullable = false)
    private String dateOfExit;
    @Column
    private String hourOfExit;
    @Column
    private String cargo;
    @Column
    private String personal;
    @Column(nullable = false)
    private String mission;
    @Column
    private String note;
    @Column(unique = true)
    private String faxNumber;
    @Column(nullable = false)
    private String TMR;
    @OneToOne
    private Status status;
    @Column
    private String typeOfVehicle;
    @Column
    private String licensePlateNumber;
    @Column
    private String licensePlateNumberTrailer;
    @Column
    private String drivers;
    @Column
    private String shipType;
    @Column
    private String shipName;
    @Column
    private int weight;
    @Column
    private String planeType;
    @Column
    private String flightNumber;
    @Column
    private int cargoWeight;
    @Column
    private int compositionLength;
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

}
