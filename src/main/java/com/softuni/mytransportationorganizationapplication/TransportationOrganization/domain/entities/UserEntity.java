package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false, unique = true)
    @NotBlank
    @Email
    private String email;
    @Column
    private String country;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<UsersRolesEntity> roles = new ArrayList<>();;

    @OneToMany(cascade = CascadeType.ALL)
    private List<LandTransportEntity> landTransports;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AirTransportEntity> airTransports;

    @OneToMany(cascade = CascadeType.ALL)
    private List<RailTransportEntity> railTransports;

    @OneToMany(cascade = CascadeType.ALL)
    private List<SeaTransportEntity> seaTransports;

    public UserEntity(String username, String password, String email,
                      String country, List<UsersRolesEntity> roles,
                      List<LandTransportEntity> landTransports,
                      List<AirTransportEntity> airTransports,
                      List<RailTransportEntity> railTransports,
                      List<SeaTransportEntity> seaTransports) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.country = country;
        this.roles = roles;
        this.landTransports = landTransports;
        this.airTransports = airTransports;
        this.railTransports = railTransports;
        this.seaTransports = seaTransports;
    }

    public UserEntity() {
    }

    public List<LandTransportEntity> getLandTransports() {
        return landTransports;
    }

    public UserEntity setLandTransports(List<LandTransportEntity> landTransports) {
        this.landTransports = landTransports;
        return this;
    }

    public List<AirTransportEntity> getAirTransports() {
        return airTransports;
    }

    public UserEntity setAirTransports(List<AirTransportEntity> airTransports) {
        this.airTransports = airTransports;
        return this;
    }

    public List<RailTransportEntity> getRailTransports() {
        return railTransports;
    }

    public UserEntity setRailTransports(List<RailTransportEntity> railTransports) {
        this.railTransports = railTransports;
        return this;
    }

    public List<SeaTransportEntity> getSeaTransports() {
        return seaTransports;
    }

    public UserEntity setSeaTransports(List<SeaTransportEntity> seaTransports) {
        this.seaTransports = seaTransports;
        return this;
    }



    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public UserEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    public List<UsersRolesEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(List<UsersRolesEntity> roles) {
        this.roles = roles;
        return this;
    }




}
