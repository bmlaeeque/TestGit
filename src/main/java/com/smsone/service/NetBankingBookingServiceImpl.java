package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smsone.dao.NetBankingBookingDAO;
import com.smsone.model.NetBankingBooking;

@Service
public class NetBankingBookingServiceImpl implements  NetBankingBookingService{
	@Autowired
	
	NetBankingBookingDAO netbankingbookingDAO;
	public void submitForm(NetBankingBooking netbankingbooking) {
		netbankingbookingDAO.submitForm(netbankingbooking);		
	}

}
