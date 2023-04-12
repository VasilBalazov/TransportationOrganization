package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "transports")
public class TransportEntity extends BaseEntity{
    @Column(nullable = false)
    private String type;
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

    @Column
    private String typeOfVehicle;
    @Column
    private String licensePlateNumber;
    @Column
    private String licensePlateNumberTrailer;
    @Column
    private String drivers;
    @Column
    private String shipType;
    @Column
    private String shipName;
    @Column
    private int weight;
    @Column
    private String planeType;
    @Column
    private String flightNumber;
    @Column
    private int cargoWeight;
    @Column
    private int compositionLength;


    @ManyToOne
    @JoinColumn(name ="users_id")
    private UserEntity userEntity;

    public TransportEntity() {
    }

    public TransportEntity(String type, String startPoint, String finalDestination, String entryPoint, String dateOfEntry, String hourOfEntry, String exitPoint, String dateOfExit, String hourOfExit, String cargo, String personal, String mission, String note, String faxNumber, String TMR, StatusOfTransport status, String typeOfVehicle, String licensePlateNumber, String licensePlateNumberTrailer, String drivers, String shipType, String shipName, int weight, String planeType, String flightNumber, int cargoWeight, int compositionLength, UserEntity userEntity) {
        this.type = type;
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
        this.typeOfVehicle = typeOfVehicle;
        this.licensePlateNumber = licensePlateNumber;
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        this.drivers = drivers;
        this.shipType = shipType;
        this.shipName = shipName;
        this.weight = weight;
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.cargoWeight = cargoWeight;
        this.compositionLength = compositionLength;
        this.userEntity = userEntity;
    }

    public String getType() {
        return type;
    }

    public TransportEntity setType(String type) {
        this.type = type;
        return this;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public TransportEntity setStartPoint(String startPoint) {
        this.startPoint = startPoint;
        return this;
    }

    public String getFinalDestination() {
        return finalDestination;
    }

    public TransportEntity setFinalDestination(String finalDestination) {
        this.finalDestination = finalDestination;
        return this;
    }

    public String getEntryPoint() {
        return entryPoint;
    }

    public TransportEntity setEntryPoint(String entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    public String getDateOfEntry() {
        return dateOfEntry;
    }

    public TransportEntity setDateOfEntry(String dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
        return this;
    }

    public String getHourOfEntry() {
        return hourOfEntry;
    }

    public TransportEntity setHourOfEntry(String hourOfEntry) {
        this.hourOfEntry = hourOfEntry;
        return this;
    }

    public String getExitPoint() {
        return exitPoint;
    }

    public TransportEntity setExitPoint(String exitPoint) {
        this.exitPoint = exitPoint;
        return this;
    }

    public String getDateOfExit() {
        return dateOfExit;
    }

    public TransportEntity setDateOfExit(String dateOfExit) {
        this.dateOfExit = dateOfExit;
        return this;
    }

    public String getHourOfExit() {
        return hourOfExit;
    }

    public TransportEntity setHourOfExit(String hourOfExit) {
        this.hourOfExit = hourOfExit;
        return this;
    }

    public String getCargo() {
        return cargo;
    }

    public TransportEntity setCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    public String getPersonal() {
        return personal;
    }

    public TransportEntity setPersonal(String personal) {
        this.personal = personal;
        return this;
    }

    public String getMission() {
        return mission;
    }

    public TransportEntity setMission(String mission) {
        this.mission = mission;
        return this;
    }

    public String getNote() {
        return note;
    }

    public TransportEntity setNote(String note) {
        this.note = note;
        return this;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public TransportEntity setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
        return this;
    }

    public String getTMR() {
        return TMR;
    }

    public TransportEntity setTMR(String TMR) {
        this.TMR = TMR;
        return this;
    }

    public StatusOfTransport getStatus() {
        return status;
    }

    public TransportEntity setStatus(StatusOfTransport status) {
        this.status = status;
        return this;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public TransportEntity setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
        return this;
    }

    public String getLicensePlateNumber() {
        return licensePlateNumber;
    }

    public TransportEntity setLicensePlateNumber(String licensePlateNumber) {
        this.licensePlateNumber = licensePlateNumber;
        return this;
    }

    public String getLicensePlateNumberTrailer() {
        return licensePlateNumberTrailer;
    }

    public TransportEntity setLicensePlateNumberTrailer(String licensePlateNumberTrailer) {
        this.licensePlateNumberTrailer = licensePlateNumberTrailer;
        return this;
    }

    public String getDrivers() {
        return drivers;
    }

    public TransportEntity setDrivers(String drivers) {
        this.drivers = drivers;
        return this;
    }

    public String getShipType() {
        return shipType;
    }

    public TransportEntity setShipType(String shipType) {
        this.shipType = shipType;
        return this;
    }

    public String getShipName() {
        return shipName;
    }

    public TransportEntity setShipName(String shipName) {
        this.shipName = shipName;
        return this;
    }

    public int getWeight() {
        return weight;
    }

    public TransportEntity setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public String getPlaneType() {
        return planeType;
    }

    public TransportEntity setPlaneType(String planeType) {
        this.planeType = planeType;
        return this;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public TransportEntity setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
        return this;
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public TransportEntity setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
        return this;
    }

    public int getCompositionLength() {
        return compositionLength;
    }

    public TransportEntity setCompositionLength(int compositionLength) {
        this.compositionLength = compositionLength;
        return this;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public TransportEntity setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
        return this;
    }
}
