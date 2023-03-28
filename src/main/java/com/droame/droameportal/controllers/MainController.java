package com.droame.droameportal.controllers;

import com.droame.droameportal.models.Booking;
import com.droame.droameportal.services.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@Controller
@RequestMapping("/droam")
public class MainController {

    @Autowired
    private IBookingService bookingService;

    @GetMapping("/home")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/operator")
    public String getOperatorPortal(Model model) {
        model.addAttribute("bookings", bookingService.getAllBooking());
        return "BookingDashboard";
    }

    @GetMapping("/addBooking")
    public String addBookingPage(Model model) {
        return "AddBooking";
    }

    @PostMapping("/saveBooking")
    public String saveBooking(@ModelAttribute Booking booking) {
        booking.setCreatedTime(new Date());
        bookingService.saveBooking(booking);
        return "redirect:operator";
    }

    @GetMapping("/getUpdateBookingPage")
    public String getUpdateBookingPage(@RequestParam Integer bookingId, Model model) {
        model.addAttribute("booking", bookingService.getBooking(bookingId));
        return "UpdateBookingPage";
    }

    @PostMapping("/updateBooking")
    public String updateBooking(@ModelAttribute Booking booking) {
        booking.setCreatedTime(new Date());
        bookingService.updateBooking(booking);
        return "redirect:operator";
    }

    @GetMapping("/deleteBooking")
    public String deleteBooking(@RequestParam Integer bookingId) {
        bookingService.deleteBooking(bookingId);
        return "redirect:operator";
    }
}
