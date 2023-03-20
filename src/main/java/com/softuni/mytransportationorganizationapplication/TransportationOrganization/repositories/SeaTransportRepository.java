package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.SeaTransportEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeaTransportRepository extends JpaRepository<SeaTransportEntity, Long> {
}
