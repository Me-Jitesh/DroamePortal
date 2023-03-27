package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class DroneShot {
    @Id
    @GeneratedValue
    private Integer shotId;
    private String droneShotName;
    private String droneShotPath;
}
