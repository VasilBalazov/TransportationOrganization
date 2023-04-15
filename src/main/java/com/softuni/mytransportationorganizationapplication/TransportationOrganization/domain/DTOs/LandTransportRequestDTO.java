package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LandTransportRequestDTO {

    private MOT modeOfTransportation;
//    @Size(min = 6, max = 20)
    @NotNull
    private String startPoint;
    @NotNull
    private String finalDestination;
    @NotNull
    private String entryPoint;
    // TODO: set dateOfEntry, hourOfEntry, dateOfExit, hourOfExit - to LocalDate and LocalTime
    @NotNull
    private String dateOfEntry;
    @NotNull
    private String hourOfEntry;
    @NotNull
    private String exitPoint;
    @NotNull
    private String dateOfExit;
    @NotNull
    private String hourOfExit;
    @NotNull
    private String cargo;

    private String personal;
    @NotNull
    private String mission;

    private String note;
    @NotNull
    private String TMR;

    private String typeOfVehicle;

    private String licensePlateNumber;

    private String licensePlateNumberTrailer;

    private String drivers;

}
