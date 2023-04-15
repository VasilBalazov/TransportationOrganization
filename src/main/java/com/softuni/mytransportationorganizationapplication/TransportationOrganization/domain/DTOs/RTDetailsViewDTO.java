package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RTDetailsViewDTO {
    private Long id;
    private String startPoint;
    private String finalDestination;
    private String entryPoint;
    private String dateOfEntry;
    private String hourOfEntry;
    private String exitPoint;
    private String dateOfExit;
    private String hourOfExit;
    private String cargo;
    private String personal;
    private String mission;
    private String note;
    private String TMR;
    private int cargoWeight;
    private int compositionLength;


}
