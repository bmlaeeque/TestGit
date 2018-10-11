package com.smsone.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.CreditCardBooking;
import com.smsone.model.User;


@Repository
public class CreditCardBookingDAOImpl implements  CreditCardBookingDAO{
	
	@Autowired
	private SessionFactory sessionFactory;

	
	// save CreditCardBooking
	public void saveCreditCardBooking(CreditCardBooking creditcardbooking) {
		Session session=sessionFactory.openSession();
		session.save(creditcardbooking);
		session.close();
	}


	public boolean checkBed(CreditCardBooking creditcardbooking) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(CreditCardBooking.class);
		Criterion c1=Restrictions.eq("cdId_bookedBed",creditcardbooking.getCdId_bookedBed());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return false;
		}
		else
		{
			return true;
		}
	}

}
