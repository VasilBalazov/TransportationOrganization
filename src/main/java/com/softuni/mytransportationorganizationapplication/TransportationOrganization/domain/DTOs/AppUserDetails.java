package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class AppUserDetails extends User {
    private String country;


    public AppUserDetails(String username, String password,
                          Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);

    }



    public String getCountry() {
        return country;
    }

    public AppUserDetails setCountry(String country) {
        this.country = country;
        return this;
    }

}