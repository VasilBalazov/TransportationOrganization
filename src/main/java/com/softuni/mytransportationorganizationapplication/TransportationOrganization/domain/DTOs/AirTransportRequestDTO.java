package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class AirTransportRequestDTO {
    private MOT modeOfTransportation;
    @NotNull
    private String startPoint;
    @NotNull
    private String finalDestination;
    @NotNull
    private String entryPoint;
    @NotNull
    private String dateOfEntry;

    private String hourOfEntry;
    @NotNull
    private String exitPoint;
    @NotNull
    private String dateOfExit;

    private String hourOfExit;
    @NotNull
    private String cargo;
    @NotNull
    private String personal;
    @NotNull
    private String mission;

    private String note;
    @NotNull
    private String TMR;

    private String planeType;

    private String flightNumber;

}
