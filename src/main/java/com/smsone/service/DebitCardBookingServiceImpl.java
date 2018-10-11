package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.DebitCardBookingDAO;
import com.smsone.model.DebitCardBooking;

@Service

public class DebitCardBookingServiceImpl implements DebitCardBookingService{
	@Autowired
	
	
	DebitCardBookingDAO debitcardbookingDAO;
	public void saveDebitCardBooking(DebitCardBooking debitcardbooking) {
		debitcardbookingDAO.saveDebitCardBooking(debitcardbooking);
		
	}

}
