package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RailTransportRequestDTO {
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
    private int cargoWeight;
    @NotNull
    private int compositionLength;

    public RailTransportRequestDTO() {
    }

    public RailTransportRequestDTO(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, int cargoWeight, int compositionLength) {
        this.startPoint = startPoint;
        this.finalDestination = finalDestination;
        this.entryPoint = entryPoint;
        this.dateOfEntry = dateOfEntry;
        this.hourOfEntry = hourOfEntry;
        this.exitPoint = exitPoint;
        this.dateOfExit = dateOfExit;
        this.hourOfExit = hourOfExit;
        this.cargo = cargo;
        this.personal = personal;
        this.mission = mission;
        this.note = note;
        this.TMR = TMR;
        this.cargoWeight = cargoWeight;
        this.compositionLength = compositionLength;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public RailTransportRequestDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public RailTransportRequestDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public RailTransportRequestDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public RailTransportRequestDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public RailTransportRequestDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public RailTransportRequestDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public RailTransportRequestDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public RailTransportRequestDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public RailTransportRequestDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public RailTransportRequestDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public RailTransportRequestDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public RailTransportRequestDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public RailTransportRequestDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public RailTransportRequestDTO setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }

    public int getCompositionLength() {
        return compositionLength;
    }

    public RailTransportRequestDTO setCompositionLength(int compositionLength) {
        this.compositionLength = compositionLength;
        return this;
    }
}
