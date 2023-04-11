package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

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

    public STDetailsViewDTO() {
    }

    public STDetailsViewDTO(Long id, String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, String shipType, String shipName, int weight) {
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
        this.shipType = shipType;
        this.shipName = shipName;
        this.weight = weight;
    }

    public Long getId() {
        return id;
    }

    public STDetailsViewDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public STDetailsViewDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public STDetailsViewDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public STDetailsViewDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public STDetailsViewDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public STDetailsViewDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public STDetailsViewDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public STDetailsViewDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public STDetailsViewDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public STDetailsViewDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public STDetailsViewDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public STDetailsViewDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public STDetailsViewDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public STDetailsViewDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public String getShipType() {
        return shipType;
    }

    public STDetailsViewDTO setShipType(String shipType) {
        this.shipType = shipType;
        return this;
    }

    public String getShipName() {
        return shipName;
    }

    public STDetailsViewDTO setShipName(String shipName) {
        this.shipName = shipName;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public STDetailsViewDTO setWeight(int weight) {
        this.weight = weight;
        return this;
    }
}
