package com.droame.droameportal.services.impl;

import com.droame.droameportal.models.Booking;
import com.droame.droameportal.repositories.BookingRepo;
import com.droame.droameportal.services.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements IBookingService {

    @Autowired
    private BookingRepo repo;

    @Override
    public Integer saveBooking(Booking booking) {
        return repo.save(booking).getBookingId();
    }

    @Override
    public void updateBooking(Booking booking) {
        repo.save(booking);
    }

    @Override
    public void deleteBooking(Integer id) {
        repo.deleteById(id);
    }

    @Override
    public Booking getBooking(Integer bookingId) {
        return repo.findById(bookingId).get();
    }

    @Override
    public List<Booking> getAllBooking() {
        return repo.findAll();
    }
}
