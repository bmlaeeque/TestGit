package com.smsone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.DebitCardBooking;

@Repository


public class DebitCardBookingDAOImpl implements DebitCardBookingDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public void saveDebitCardBooking(DebitCardBooking debitcardbooking) {
		Session session=sessionFactory.openSession();
		session.save(debitcardbooking);
		session.close();	
		
	}

}
