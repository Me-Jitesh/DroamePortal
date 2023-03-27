package com.droame.droameportal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "booking_tab")
public class Booking {

    @Id
    @GeneratedValue
    @Column(name = "booking_id")
    private Integer bookingId;
    @Column(name = "booking_customer")
    @OneToOne
    private Customer customer;
    @Column(name = "booking_address")
    @OneToOne
    private Location location;
    @OneToOne
    @Column(name = "booking_shot")
    private DroneShot droneShot;
    @Column(name = "booking_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
}
