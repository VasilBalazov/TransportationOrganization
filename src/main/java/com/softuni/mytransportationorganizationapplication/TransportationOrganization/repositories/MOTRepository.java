package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.ModeOfTransportation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MOTRepository extends JpaRepository<ModeOfTransportation, Long> {

}
