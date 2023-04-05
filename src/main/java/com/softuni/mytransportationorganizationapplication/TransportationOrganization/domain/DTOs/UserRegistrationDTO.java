package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.validation.FieldMatch;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.validation.UniqueUserEmail;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.validation.UniqueUserName;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
@FieldMatch(
        first = "password",
        second = "confirmPassword",
        message = "Passwords do not match."
)
public class UserRegistrationDTO {
  @NotNull
  @Size(min = 5, max = 20)
  @UniqueUserName(message = "Username should be unique")
  private String username;
  @NotEmpty(message = "User email should be provided.")
  @Email(message = "User email should be valid.")
  @UniqueUserEmail(message = "User email should be unique.")
  private String email;
  @NotNull
  @Size(min = 6, max = 20)
  private String password;
  private String confirmPassword;

  private String role;

  public String getRole() {
    return role;
  }

  public UserRegistrationDTO setRole(String role) {
    this.role = role;
    return this;
  }

  public UserRegistrationDTO(String username, String email, String password, String confirmPassword, String role) {
    this.username = username;
    this.email = email;
    this.password = password;
    this.confirmPassword = confirmPassword;
    this.role = role;
  }
  public UserRegistrationDTO() {
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

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public UserRegistrationDTO setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
    return this;
  }


}
