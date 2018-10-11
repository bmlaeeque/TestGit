package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.CreditCardBookingDAO;
import com.smsone.model.CreditCardBooking;

@Service
public class CreditCardBookingServiceImpl implements CreditCardBookingService{
	
	@Autowired
	CreditCardBookingDAO creditcardbookingDAO;
	public void saveCreditCardBooking(CreditCardBooking creditcardbooking) 
	{
		creditcardbookingDAO.saveCreditCardBooking(creditcardbooking);
		
	}
	public boolean checkBed(CreditCardBooking creditcardbooking)
	{
		return creditcardbookingDAO.checkBed(creditcardbooking);
	}
	
	

}
