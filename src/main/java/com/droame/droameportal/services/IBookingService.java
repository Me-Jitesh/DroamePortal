package com.droame.droameportal.services;

import com.droame.droameportal.models.Booking;

import java.util.List;

public interface IBookingService {

    Integer saveBooking(Booking booking);

    void updateBooking(Booking booking);

    void deleteBooking(Integer id);

    Booking getBooking(Integer bookingId);

    List<Booking> getAllBooking();
}
