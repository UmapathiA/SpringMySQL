package com.mysql.repository;

import com.mysql.domain.Ride;
import com.mysql.repository.util.RideRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RideRepositoryImpl implements RideRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Ride> getRides() {
        return jdbcTemplate.query("SELECT * FROM DemoDb.Ride", new RideRowMapper());
    }
}
