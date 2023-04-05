package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.validation;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.UserRepository;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class UniqueName implements ConstraintValidator<UniqueUserName, String> {

    private UserRepository userRepository;

    public UniqueName(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        return userRepository.
                findByUsername(value).
                isEmpty();
    }
}
