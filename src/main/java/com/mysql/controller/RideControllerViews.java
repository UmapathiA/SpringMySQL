package com.mysql.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RideControllerViews {

    @RequestMapping("/addRide")
    public String addRide() {
        return "home";
    }

    @RequestMapping("/rideInformation")
    public String addRide(@RequestParam String id,@RequestParam String name,@RequestParam String duration) {
        System.out.println(id);
        System.out.println(name);
        System.out.println(duration);
        return "home";
    }
}
