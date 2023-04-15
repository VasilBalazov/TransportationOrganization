package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SeaTransportRequestDTO {
    private MOT modeOfTransportation;

    @NotNull
    @Size(min = 3, max = 35, message = "nonono")
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

    @NotNull
    private String shipType;
    @NotNull
    private String shipName;
    @NotNull
    private int weight;

}
