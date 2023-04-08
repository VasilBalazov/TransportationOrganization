package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

public class LandTransportRequestDTO {
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

    public LandTransportRequestDTO() {

    }

    public LandTransportRequestDTO(String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, String typeOfVehicle, String licensePlateNumber, String licensePlateNumberTrailer, String drivers) {
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
        this.typeOfVehicle = typeOfVehicle;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        this.drivers = drivers;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public LandTransportRequestDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public LandTransportRequestDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public LandTransportRequestDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public LandTransportRequestDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public LandTransportRequestDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public LandTransportRequestDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public LandTransportRequestDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public LandTransportRequestDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public LandTransportRequestDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public LandTransportRequestDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public LandTransportRequestDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public LandTransportRequestDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public LandTransportRequestDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public LandTransportRequestDTO setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        return this;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public LandTransportRequestDTO setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    public String getLicensePlateNumberTrailer() {
        return licensePlateNumberTrailer;
    }

    public LandTransportRequestDTO setLicensePlateNumberTrailer(String licensePlateNumberTrailer) {
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        return this;
    }

    public String getDrivers() {
        return drivers;
    }

    public LandTransportRequestDTO setDrivers(String drivers) {
        this.drivers = drivers;
        return this;
    }
}
