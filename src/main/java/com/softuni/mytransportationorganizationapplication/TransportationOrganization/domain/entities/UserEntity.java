package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{
    @Column
    private String username;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @NotBlank
    @Email
    private String email;
    @Column
    private String organization;
    @Column
    private String job;

    @Column
    private String country;

    public String getCountry() {
        return country;
    }

    public UserEntity setCountry(String country) {
        this.country = country;
        return this;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    private List<UsersRolesEntity> roles;
    @OneToMany(cascade = CascadeType.ALL)
    private List<RequestEntity> requests;

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

    public String getOrganization() {
        return organization;
    }

    public UserEntity setOrganization(String organization) {
        this.organization = organization;
        return this;
    }

    public String getJob() {
        return job;
    }

    public UserEntity setJob(String job) {
        this.job = job;
        return this;
    }

    public List<UsersRolesEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(List<UsersRolesEntity> roles) {
        this.roles = roles;
        return this;
    }

    public List<RequestEntity> getRequests() {
        return requests;
    }

    public UserEntity setRequests(List<RequestEntity> requests) {
        this.requests = requests;
        return this;
    }
}
