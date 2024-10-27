package com.joshualeepenn.healthmetricstrackerapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "blood_oxygen_saturation")
@Data
public class BloodOxygenSaturation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @PositiveOrZero
    private int saturation;

    @Lob
    private String note;

    @NotNull
    private LocalDateTime timeOfReading;

}
