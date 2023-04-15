package com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.entities;

import com.softuni.mytransportationorganizationapplication.TransportationOrganization.domain.enums.MOT;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "MOT")
public class ModeOfTransportation extends BaseEntity{
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MOT modeOfTransportation;
    private String description;

    public ModeOfTransportation setModeOfTransportation(MOT modeOfTransportation) {
        this.modeOfTransportation = modeOfTransportation;
        return this;
    }
}
