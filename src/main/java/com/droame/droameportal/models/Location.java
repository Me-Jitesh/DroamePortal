package com.droame.droameportal.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.Data;

@Data
@Entity
public class Location {
    @Id
    @GeneratedValue(generator = "loc_sql")
    @SequenceGenerator(name = "loc_sql")
    private Integer addrId;
    private String addrLine;
    private String city;
    private String dist;
    private String pin;
    private String state;
    private String country;
}
