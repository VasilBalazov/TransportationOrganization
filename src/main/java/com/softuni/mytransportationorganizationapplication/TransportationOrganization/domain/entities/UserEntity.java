package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{
    @Column(name = "full_name")
    private String fullName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    @Email
    private String email;
    @Column
    private String organization;
    @Column
    private String job;
    @ManyToMany(fetch = FetchType.EAGER)
    private Set<RolesEntity> roles;
    @OneToMany(cascade = CascadeType.ALL)
    private List<RequestEntity> requests;

}
