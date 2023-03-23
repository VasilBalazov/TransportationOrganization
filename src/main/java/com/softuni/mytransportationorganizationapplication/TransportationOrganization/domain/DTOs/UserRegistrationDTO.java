package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {
  @NotNull
  @Size(min = 5, max = 20)
  private String username;
  @NotNull
  @Size(min = 6, max = 20)
  private String password;
  @Email
  @NotBlank
  private String email;

  private String country;

  private String userRole;

  public UserRegistrationDTO() {
  }

  public UserRegistrationDTO(String username, String password, String email, String country, String userRole) {
    this.username = username;
    this.password = password;
    this.email = email;
    this.country = country;
    this.userRole = userRole;
  }

  public String getUsername() {
    return username;
  }

  public UserRegistrationDTO setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserRegistrationDTO setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserRegistrationDTO setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public UserRegistrationDTO setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getUserRole() {
    return userRole;
  }

  public UserRegistrationDTO setUserRole(String userRole) {
    this.userRole = userRole;
    return this;
  }
}
