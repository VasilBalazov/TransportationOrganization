package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    Optional<UserEntity> findUserEntityByUsername(String username);

    Optional<UserEntity> findByEmail(String email);

    Optional<UserEntity> findByUsername(String name);
}

