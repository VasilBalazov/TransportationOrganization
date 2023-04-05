package com.softuni.mytransportationorganizationapplication.TransportationOrganization.services;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.DTOs.UserRegistrationDTO;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UserEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.RoleRepository;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.function.Consumer;

@Service
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;
    private final RoleRepository roleRepository;
//    public static final String BINDING_RESULT_PATH = "org.springframework.validation.BindingResult.";
    @Autowired
    public UserService(UserRepository userRepository,
                       PasswordEncoder passwordEncoder,
                       UserDetailsService userDetailsService, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
        this.roleRepository = roleRepository;
    }

    public void registerUser(UserRegistrationDTO registrationDTO,
                             Consumer<Authentication> successfulLoginProcessor) {
        var role = roleRepository.
                findUserRoleEntityByRole(UserRoleEnum.valueOf(registrationDTO.getRole())).orElseThrow();

        UserEntity userEntity = new UserEntity().
                setUsername(registrationDTO.getUsername()).
                setEmail(registrationDTO.getEmail()).
                setPassword(passwordEncoder.encode(registrationDTO.getPassword()))
                .setRoles(List.of(role));

        userRepository.save(userEntity);

        UserDetails userDetails = userDetailsService.loadUserByUsername(registrationDTO.getUsername());

        Authentication authentication = new UsernamePasswordAuthenticationToken(
                userDetails,
                userDetails.getPassword(),
                userDetails.getAuthorities()
        );

        successfulLoginProcessor.accept(authentication);
    }
}
