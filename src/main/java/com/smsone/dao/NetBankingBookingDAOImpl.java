package com.smsone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.NetBankingBooking;

@Repository

public class NetBankingBookingDAOImpl implements  NetBankingBookingDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void submitForm(NetBankingBooking netbankingbooking) {
		Session session=sessionFactory.openSession();
		session.save(netbankingbooking);
		session.close();	
		
	}

}
