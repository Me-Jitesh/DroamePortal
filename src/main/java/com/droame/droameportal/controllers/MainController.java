package com.droame.droameportal.controllers;

import com.droame.droameportal.models.Booking;
import com.droame.droameportal.models.Customer;
import com.droame.droameportal.models.DroneShot;
import com.droame.droameportal.models.Location;
import com.droame.droameportal.services.IBookingService;
import com.droame.droameportal.services.ICustomerService;
import com.droame.droameportal.services.IDroneShotService;
import com.droame.droameportal.services.ILocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/droam")
public class MainController {

    @Autowired
    private IBookingService bookingService;
    @Autowired
    private ILocationService locationService;
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private IDroneShotService droneShotService;

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
        fetchMap(model);
        return "AddBooking";
    }

    @PostMapping("/saveBooking")
    public String saveBooking(@ModelAttribute Booking booking) {
        bookingService.saveBooking(booking);
        return "redirect:operator";
    }

    @GetMapping("/getUpdateBookingPage")
    public String getUpdateBookingPage(@RequestParam Integer bookingId, Model model) {
        model.addAttribute("booking", bookingService.getBooking(bookingId));
        fetchMap(model);
        return "UpdateBookingPage";
    }

    @PostMapping("/updateBooking")
    public String updateBooking(@ModelAttribute Booking booking) {
        bookingService.updateBooking(booking);
        return "redirect:operator";
    }

    @GetMapping("/deleteBooking")
    public String deleteBooking(@RequestParam Integer bookingId) {
        bookingService.deleteBooking(bookingId);
        return "redirect:operator";
    }

    @GetMapping("/addCustomer")
    public String addCustomerPage() {
        return "AddCustomer";
    }

    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:operator";
    }

    @GetMapping("/addLocation")
    public String addLocationPage() {
        return "AddLocation";
    }

    @PostMapping("/saveLocation")
    public String saveLocation(@ModelAttribute Location location) {
        locationService.saveLoc(location);
        return "redirect:operator";
    }

    @GetMapping("/addDroneShot")
    public String addDroneShotPage() {
        return "AddDroneShot";
    }

    @PostMapping("/saveDroneShot")
    public String saveDroneShot(@ModelAttribute DroneShot droneShot) {
        droneShotService.saveDroneShot(droneShot);
        return "redirect:operator";
    }

    private void fetchMap(Model model) {
        model.addAttribute("loc", locationService.getLocationIdAndAddrLine());
        model.addAttribute("custo", customerService.getCustomerIdAndName());
        model.addAttribute("drone", droneShotService.getShortIdAndName());
    }
}
