package com.joshualeepenn.healthmetricstrackerapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "pulse")
@Data
public class Pulse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @PositiveOrZero
    private int pulseRate;

    @Lob
    private String note;

    @NotNull
    private LocalDateTime timeOfReading;

}
