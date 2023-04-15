package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.StatusOfTransportEnum;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "status")
public class Status extends BaseEntity{
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatusOfTransportEnum status;

    public StatusOfTransportEnum getStatus() {
        return status;
    }

    public Status setStatus(StatusOfTransportEnum status) {
        this.status = status;
        return this;
    }
}
