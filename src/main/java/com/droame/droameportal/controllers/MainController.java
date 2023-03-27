package com.droame.droameportal.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String getHomePage() {
        return "index";
    }

    @GetMapping("/operator")
    public String getOperatorPortal() {
        return "BookingDashboard";
    }
}
