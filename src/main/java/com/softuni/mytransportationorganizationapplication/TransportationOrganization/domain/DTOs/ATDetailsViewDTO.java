package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;

public class ATDetailsViewDTO {
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
    private String planeType;
    private String flightNumber;

    public ATDetailsViewDTO() {
    }

    public ATDetailsViewDTO(Long id, String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, String planeType, String flightNumber) {
        this.id = id;
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
        this.planeType = planeType;
        this.flightNumber = flightNumber;
    }

    public Long getId() {
        return id;
    }

    public ATDetailsViewDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public ATDetailsViewDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public ATDetailsViewDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public ATDetailsViewDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public ATDetailsViewDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public ATDetailsViewDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public ATDetailsViewDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public ATDetailsViewDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public ATDetailsViewDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public ATDetailsViewDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public ATDetailsViewDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public ATDetailsViewDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public ATDetailsViewDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public ATDetailsViewDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public String getPlaneType() {
        return planeType;
    }

    public ATDetailsViewDTO setPlaneType(String planeType) {
        this.planeType = planeType;
        return this;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public ATDetailsViewDTO setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }
}
