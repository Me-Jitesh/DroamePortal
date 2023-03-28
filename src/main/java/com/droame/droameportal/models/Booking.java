package com.droame.droameportal.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
@Table(name = "booking_tab")
public class Booking {

    @Id
    @GeneratedValue(generator = "booking_sql")
    @SequenceGenerator(name = "booking_sql")
    @Column(name = "booking_id")
    private Integer bookingId;
    @OneToOne(cascade = CascadeType.ALL)
    private Customer customer;
    @OneToOne(cascade = CascadeType.ALL)
    private Location location;
    @OneToOne(cascade = CascadeType.ALL)
    private DroneShot droneShot;
    @Column(name = "booking_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createdTime;
}
