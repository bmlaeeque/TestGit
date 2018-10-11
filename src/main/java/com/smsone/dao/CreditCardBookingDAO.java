package com.smsone.dao;

import com.smsone.model.CreditCardBooking;


public interface CreditCardBookingDAO {
	public void saveCreditCardBooking(CreditCardBooking creditcardbooking);
	public boolean checkBed(CreditCardBooking creditcardbooking);

}
