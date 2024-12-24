package com.example.demo.entity;
import java.sql.Timestamp;
import java.util.Date;

import lombok.Data;

@Data
public class ActiveFlightsEntity {
	
	private Long id;
	private Date flight_date;
	private String flight_status;
	private String arrgate;
	private String airlinename;
	private String flightnumber;
	private Timestamp inserttimestamp;
	
}
