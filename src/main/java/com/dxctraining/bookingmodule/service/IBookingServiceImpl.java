package com.dxctraining.bookingmodule.service;

import java.math.BigInteger;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.dxctraining.bookingmodule.dao.IBookingDao;
import com.dxctraining.bookingmodule.entities.Booking;
import com.dxctraining.bookingmodule.exceptions.BookingNotFoundException;
import com.dxctraining.bookingmodule.exceptions.InvalidArgumentException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class IBookingServiceImpl implements IBookingService {

	@Autowired
	private IBookingDao dao;

	@Override
	public Booking addBooking(Booking booking) {
		validateBooking(booking);
		booking = dao.save(booking);
		return booking;
	}

	@Override
	public Booking viewByBookingId(BigInteger bookingId) {
		Optional<Booking> optional = dao.findById(bookingId);
		if(!optional.isPresent()) {
			throw new BookingNotFoundException("provide valid bookingId");
		}
		Booking booking = optional.get();
		return booking;
	}

	@Override
	public List<Booking> viewAllBookings() {
		List<Booking>list = dao.findAll();
		return list;
	}

	@Override
	public void deleteBooking(BigInteger bookingId) {
		if(!dao.existsById(bookingId)) {
			throw new BookingNotFoundException("provide valid bookingId");
		}
		dao.deleteById(bookingId);
	}

	@Override
	public void validateBooking(Booking booking) {
		if(booking == null) {
			throw new InvalidArgumentException("Invalid booking");
		}
		
	}
	
}