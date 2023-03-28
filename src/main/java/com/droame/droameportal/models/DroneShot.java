package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class DroneShot {
    @Id
    @GeneratedValue(generator = "ds_sql")
    @SequenceGenerator(name = "ds_sql")
    private Integer shotId;
    private String droneShotName;
    private String droneShotPath;
}
