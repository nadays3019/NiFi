package com.example.demo.entity;
import java.sql.Timestamp;
import java.util.Date;

public class ActiveFlightsEntity {
	
	private Long id;
	private Date flight_date;
	private String flight_status;
	private String arrgate;
	private String airlinename;
	private String flightnumber;
	private Timestamp inserttimestamp;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getFlight_date() {
		return flight_date;
	}
	public void setFlight_date(Date flight_date) {
		this.flight_date = flight_date;
	}
	public String getFlight_status() {
		return flight_status;
	}
	public void setFlight_status(String flight_status) {
		this.flight_status = flight_status;
	}
	public String getArrgate() {
		return arrgate;
	}
	public void setArrgate(String arrgate) {
		this.arrgate = arrgate;
	}
	public String getAirlinename() {
		return airlinename;
	}
	public void setAirlinename(String airlinename) {
		this.airlinename = airlinename;
	}
	public String getFlightnumber() {
		return flightnumber;
	}
	public void setFlightnumber(String flightnumber) {
		this.flightnumber = flightnumber;
	}
	public Timestamp getInserttimestamp() {
		return inserttimestamp;
	}
	public void setInserttimestamp(Timestamp inserttimestamp) {
		this.inserttimestamp = inserttimestamp;
	}
	
}
