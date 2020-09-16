package com.mysql.service;

import com.mysql.domain.Ride;
import com.mysql.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {
    @Autowired
    private RideRepository rideRepository;

    @Override
    public List<Ride> getRides() {
        return rideRepository.getRides();
    }
}
