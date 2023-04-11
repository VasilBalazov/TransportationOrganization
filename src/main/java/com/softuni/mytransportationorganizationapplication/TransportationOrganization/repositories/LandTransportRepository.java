package com.softuni.mytransportationorganizationapplication.TransportationOrganization.repositories;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities.LandTransportEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LandTransportRepository extends JpaRepository<LandTransportEntity, Long> {
//    @Query("SELECT t FROM land_transports as t " +
//            "WHERE t.status_id = 2")
//    LandTransportEntity findAllByIdWithStatusIsPending ();
    List<LandTransportEntity> findAllByStatus_IdIs(String statusRepository);

}
