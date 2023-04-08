package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.StatusOfTransport;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.UsersRolesEntity;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.UserRoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StatusRepository extends JpaRepository<StatusOfTransport, Long> {

    Optional<StatusOfTransport> findStatusOfTransportByStatus(StatusOfTransportEnum status);
}
