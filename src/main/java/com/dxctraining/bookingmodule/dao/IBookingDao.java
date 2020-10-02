package com.dxctraining.bookingmodule.dao;

import java.math.BigInteger;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dxctraining.bookingmodule.entities.Booking;

public interface IBookingDao extends JpaRepository<Booking, BigInteger> {
	
	
}
