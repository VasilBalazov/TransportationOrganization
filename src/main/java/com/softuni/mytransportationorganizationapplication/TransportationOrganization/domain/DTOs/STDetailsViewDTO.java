package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

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
public class STDetailsViewDTO {
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
    private String shipType;
    private String shipName;
    private int weight;

}
