package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.Transport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface transportRepository extends JpaRepository<Transport, Long> {
//    @Query("SELECT t FROM land_transports as t " +
//            "WHERE t.status_id = 2")
//    LandTransportEntity findAllByIdWithStatusIsPending ();
    List<Transport> findAllByStatus_IdIs(String statusRepository);

}
