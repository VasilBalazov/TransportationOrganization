package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

public class LTDetailsViewDTO {
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
    private String typeOfVehicle;
    private String licensePlateNumber;
    private String licensePlateNumberTrailer;
    private String drivers;

    public LTDetailsViewDTO() {
    }

    public LTDetailsViewDTO(Long id, String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String TMR, String typeOfVehicle, String licensePlateNumber, String licensePlateNumberTrailer, String drivers) {
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
        this.typeOfVehicle = typeOfVehicle;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        this.drivers = drivers;
    }

    public Long getId() {
        return id;
    }

    public LTDetailsViewDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public LTDetailsViewDTO setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public LTDetailsViewDTO setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public LTDetailsViewDTO setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public LTDetailsViewDTO setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public LTDetailsViewDTO setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public LTDetailsViewDTO setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public LTDetailsViewDTO setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public LTDetailsViewDTO setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public LTDetailsViewDTO setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public LTDetailsViewDTO setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public LTDetailsViewDTO setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public LTDetailsViewDTO setNote(String note) {
        this.note = note;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public LTDetailsViewDTO setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public LTDetailsViewDTO setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        return this;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public LTDetailsViewDTO setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    public String getLicensePlateNumberTrailer() {
        return licensePlateNumberTrailer;
    }

    public LTDetailsViewDTO setLicensePlateNumberTrailer(String licensePlateNumberTrailer) {
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        return this;
    }

    public String getDrivers() {
        return drivers;
    }

    public LTDetailsViewDTO setDrivers(String drivers) {
        this.drivers = drivers;
        return this;
    }
}
