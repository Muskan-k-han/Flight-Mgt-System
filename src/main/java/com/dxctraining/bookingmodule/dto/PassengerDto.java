package com.dxctraining.bookingmodule.dto;

public class PassengerDto {
	
	private Long pnrNumber;
	
	private String passengerName;
	
	private int passengerAge;
	
	private long passengerUIN;
	
	private char gender;

	public Long getPnrNumber() {
		return pnrNumber;
	}

	public void setPnrNumber(Long pnrNumber) {
		this.pnrNumber = pnrNumber;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public int getPassengerAge() {
		return passengerAge;
	}

	public void setPassengerAge(int passengerAge) {
		this.passengerAge = passengerAge;
	}

	public long getPassengerUIN() {
		return passengerUIN;
	}

	public void setPassengerUIN(long passengerUIN) {
		this.passengerUIN = passengerUIN;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

}
