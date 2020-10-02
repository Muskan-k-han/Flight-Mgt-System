package com.dxctraining.bookingmodule.util;

import com.dxctraining.bookingmodule.dto.BookingDto;
import com.dxctraining.bookingmodule.entities.Booking;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class BookingUtil {

	public BookingDto bookingDto(Booking booking,Integer userId,String userType, String userName, String email, Long userPhone, String password,Long pnrNumber, String passengerName,int passengerAge,long passengerUIN,char gender, BigInteger sfId,Integer availableSeats,Integer scheduleId,BigInteger flightNumber) {
		BookingDto dto = new BookingDto(booking.getBookingId(),booking.getBookingDate(), booking.getTicketCost());
		dto.setUserId(userId);
		dto.setUserType(userType);
		dto.setUserName(userName);
		dto.setEmail(email);
		dto.setUserPhone(userPhone);
		dto.setPassword(password);
		dto.setPnrNumber(pnrNumber);
		dto.setPassengerName(passengerName);
		dto.setPassengerAge(passengerAge);
		dto.setPassengerUIN(passengerUIN);
		dto.setGender(gender);
		dto.setSfId(sfId);
		dto.setAvailableSeats(availableSeats);
		dto.setScheduleId(scheduleId);
		dto.setFlightNumber(flightNumber);
		return dto;
	}
}