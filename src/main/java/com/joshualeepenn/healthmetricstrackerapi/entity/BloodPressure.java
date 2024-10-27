package com.joshualeepenn.healthmetricstrackerapi.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "blood_pressure")
@Data
public class BloodPressure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @PositiveOrZero
    private int systolic;

    @PositiveOrZero
    private int diastolic;

    @Lob
    private String note;

    @NotEmpty
    private LocalDateTime readingTime;

}