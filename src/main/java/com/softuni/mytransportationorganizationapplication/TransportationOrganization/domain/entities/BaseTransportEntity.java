package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import java.time.LocalDate;
import java.time.LocalTime;

@MappedSuperclass
public abstract class BaseTransportEntity extends BaseEntity {
    @Column(nullable = false)
    private String startPoint;
    @Column(nullable = false)
    private String finalDestination;
    @Column(nullable = false)
    private String entryPoint;
    @Column(nullable = false)
    private LocalDate dateOfEntry;
    @Column
    private LocalTime hourOfEntry;
    @Column(nullable = false)
    private String exitPoint;
    @Column(nullable = false)
    private LocalDate dateOfExit;
    @Column
    private LocalTime hourOfExit;
    @Column
    private String cargo;
    @Column
    private String personal;
    @Column(nullable = false)
    private String mission;
    @Column
    private String note;
    @Column(nullable = false, unique = true)
    private String faxNumber;
    @Column(nullable = false)
    private String TMR;



    public String getStartPoint() {
        return startPoint;
    }

    public BaseTransportEntity setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public BaseTransportEntity setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public BaseTransportEntity setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public LocalDate getDateOfEntry() {
        return dateOfEntry;
    }

    public BaseTransportEntity setDateOfEntry(LocalDate dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public LocalTime getHourOfEntry() {
        return hourOfEntry;
    }

    public BaseTransportEntity setHourOfEntry(LocalTime hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public BaseTransportEntity setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public LocalDate getDateOfExit() {
        return dateOfExit;
    }

    public BaseTransportEntity setDateOfExit(LocalDate dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public LocalTime getHourOfExit() {
        return hourOfExit;
    }

    public BaseTransportEntity setHourOfExit(LocalTime hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public BaseTransportEntity setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public BaseTransportEntity setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public BaseTransportEntity setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public BaseTransportEntity setNote(String note) {
        this.note = note;
        return this;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public BaseTransportEntity setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public BaseTransportEntity setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }
}
