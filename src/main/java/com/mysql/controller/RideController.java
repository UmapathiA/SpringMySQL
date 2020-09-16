package com.mysql.controller;

import com.mysql.domain.Ride;
import com.mysql.service.RideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RideController {
    @Autowired
    private RideService rideService;

    @RequestMapping("/rides")
    public List<Ride> gerRides() {
        return rideService.getRides();
    }


}
