package com.example.demo.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.ActiveFlightsEntity;

@Repository
public class TestRepository {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
    @Autowired  // DataSource : application.properties 에서 가져옴
    public TestRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
	 public List<ActiveFlightsEntity> airlineInfoGetList() {
	    String sql = "SELECT id\r\n"
	    		+ "	 , flight_date\r\n"
	    		+ "	 , flight_status\r\n"
	    		+ "	 , arrgate\r\n"
	    		+ "	 , airlinename\r\n"
	    		+ "	 , flightnumber\r\n"
	    		+ "	 , inserttimestamp\r\n"
	    		+ "  FROM activeflights;\r\n"
	    		+ "";
	    return jdbcTemplate.query(sql, (rs, rowNum) -> {
	    	ActiveFlightsEntity activeFlightsEntity = new ActiveFlightsEntity();
	    	activeFlightsEntity.setId(rs.getLong("id"));
	    	activeFlightsEntity.setFlight_date(rs.getDate("flight_date"));
	    	activeFlightsEntity.setFlight_status(rs.getString("flight_status"));
	    	activeFlightsEntity.setAirlinename(rs.getString("airlinename"));
	    	activeFlightsEntity.setFlightnumber(rs.getString("flightnumber"));
	    	activeFlightsEntity.setInserttimestamp(rs.getTimestamp("inserttimestamp"));
	        return activeFlightsEntity;
	    });
    }
}
