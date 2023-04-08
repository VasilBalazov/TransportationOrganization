package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

@Entity
@Table(name = "status")
public class StatusOfTransport extends BaseEntity{
    @Enumerated(EnumType.STRING)
    private StatusOfTransportEnum status;

    public StatusOfTransportEnum getStatus() {
        return status;
    }

    public StatusOfTransport setStatus(StatusOfTransportEnum status) {
        this.status = status;
        return this;
    }
}
