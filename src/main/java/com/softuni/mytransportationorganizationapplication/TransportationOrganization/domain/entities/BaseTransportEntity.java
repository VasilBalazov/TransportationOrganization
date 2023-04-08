package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.*;

import java.util.List;

@MappedSuperclass
public abstract class BaseTransportEntity extends BaseEntity {
//    TODO: replace String with date and time where needed
    @Column(nullable = false)
    private String startPoint;
    @Column(nullable = false)
    private String finalDestination;
    @Column(nullable = false)
    private String entryPoint;
    @Column(nullable = false)
    private String dateOfEntry;
    @Column
    private String hourOfEntry;
    @Column(nullable = false)
    private String exitPoint;
    @Column(nullable = false)
    private String dateOfExit;
    @Column
    private String hourOfExit;
    @Column
    private String cargo;
    @Column
    private String personal;
    @Column(nullable = false)
    private String mission;
    @Column
    private String note;
    @Column(unique = true)
    private String faxNumber;
    @Column(nullable = false)
    private String TMR;

    @OneToOne
    private StatusOfTransport status;



    public BaseTransportEntity() {
    }
    public BaseTransportEntity(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status) {
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
        this.faxNumber = faxNumber;
        this.TMR = TMR;
        this.status = status;
    }

    public StatusOfTransport getStatus() {
        return status;
    }

    public BaseTransportEntity setStatus(StatusOfTransport status) {
        this.status = status;
        return this;
    }

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

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public BaseTransportEntity setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public BaseTransportEntity setHourOfEntry(String hourOfEntry) {
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

    public String getDateOfExit() {
        return dateOfExit;
    }

    public BaseTransportEntity setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public BaseTransportEntity setHourOfExit(String hourOfExit) {
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
