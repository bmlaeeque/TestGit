package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.smsone.dao.BookingDAO;
import com.smsone.model.Booking;

public class BookingServiceImpl implements BookingService {
	@Autowired
	BookingDAO bookingDAO;
	
	public void saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		
	}
	

}
