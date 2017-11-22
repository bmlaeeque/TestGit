package com.smsone.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.Booking;
import com.smsone.model.User;
@Repository
public class BookingDAOImpl implements BookingDAO {
	@Autowired
	private SessionFactory sessionFactory;
	//save user
	public void saveBooking(Booking booking) {
		Session session=sessionFactory.openSession();
		session.save(booking);
		session.close();
	}
	

}
