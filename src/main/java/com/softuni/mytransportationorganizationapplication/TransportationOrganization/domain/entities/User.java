package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "users")
public class User extends BaseEntity{
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
    @ManyToMany
    private List<UsersRoles> roles = new ArrayList<>();;
    @OneToMany(mappedBy = "user")
    private List<Transport> transports = new ArrayList<>();


}
