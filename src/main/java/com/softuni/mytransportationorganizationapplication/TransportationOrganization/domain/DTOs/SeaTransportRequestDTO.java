package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class SeaTransportRequestDTO {
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

    public SeaTransportRequestDTO() {
    }

    public SeaTransportRequestDTO(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, String shipType, String shipName, int weight) {
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
        this.shipType = shipType;
        this.shipName = shipName;
        this.weight = weight;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public SeaTransportRequestDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public SeaTransportRequestDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public SeaTransportRequestDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public SeaTransportRequestDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public SeaTransportRequestDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public SeaTransportRequestDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public SeaTransportRequestDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public SeaTransportRequestDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public SeaTransportRequestDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public SeaTransportRequestDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public SeaTransportRequestDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public SeaTransportRequestDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public SeaTransportRequestDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public String getShipType() {
        return shipType;
    }

    public SeaTransportRequestDTO setShipType(String shipType) {
        this.shipType = shipType;
        return this;
    }

    public String getShipName() {
        return shipName;
    }

    public SeaTransportRequestDTO setShipName(String shipName) {
        this.shipName = shipName;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public SeaTransportRequestDTO setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
