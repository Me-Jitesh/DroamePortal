package com.droame.droameportal.repositories;

import com.droame.droameportal.models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepo extends JpaRepository<Booking, Integer> {

}
