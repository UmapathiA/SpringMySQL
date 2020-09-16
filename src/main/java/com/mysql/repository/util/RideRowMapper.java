package com.mysql.repository.util;

import com.mysql.domain.Ride;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RideRowMapper implements RowMapper<Ride> {
    @Override
    public Ride mapRow(ResultSet resultSet, int i) throws SQLException {
        Ride ride=new Ride();
        ride.setId(resultSet.getInt(1));
        ride.setName(resultSet.getString(2));
        ride.setDuration(resultSet.getInt(3));
        return ride;
    }
}
