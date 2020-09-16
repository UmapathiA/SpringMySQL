package com.mysql.repository;

import com.mysql.domain.Ride;

import java.util.List;

public interface RideRepository {
    List<Ride> getRides();
}
