package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class AppUserDetails extends User {
    private String country;
    private Long id;

    public AppUserDetails(String username, String password, Long id,
                          Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public AppUserDetails setId(Long id) {
        this.id = id;
        return this;
    }

    public String getCountry() {
        return country;
    }

    public AppUserDetails setCountry(String country) {
        this.country = country;
        return this;
    }

}