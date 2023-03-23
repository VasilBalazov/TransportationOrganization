package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserRegistrationDTO {
  @NotNull
  @Size(min = 5, max = 20)
  private String username;
  @Size(min = 3, max = 30)
  private String organization;

  @Email
  @NotBlank
  private String email;
  @NotNull
  @Size(min = 6, max = 20)
  private String password;

  @Size(min = 5, max = 20)
  private String job;





  public String getOrganization() {
    return organization;
  }

  public UserRegistrationDTO setOrganization(String organization) {
    this.organization = organization;
    return this;
  }

  public String getUsername() {
    return username;
  }

  public UserRegistrationDTO setUsername(String username) {
    this.username = username;
    return this;
  }

  public String getEmail() {
    return email;
  }

  public UserRegistrationDTO setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getPassword() {
    return password;
  }

  public UserRegistrationDTO setPassword(String password) {
    this.password = password;
    return this;
  }

  public String getJob() {
    return job;
  }

  public UserRegistrationDTO setJob(String job) {
    this.job = job;
    return this;
  }

  public UserRegistrationDTO(String userName, String organization, String email, String password, String job) {
    this.username = userName;
    this.organization = organization;
    this.email = email;
    this.password = password;
    this.job = job;
  }

  public UserRegistrationDTO() {
  }
}
