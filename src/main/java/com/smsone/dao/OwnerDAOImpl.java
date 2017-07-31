package com.smsone.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.model.Owner;
import com.smsone.model.User;
@Repository
public class OwnerDAOImpl implements OwnerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	//save owner
	public void saveOwner(Owner owner) {
		Session session=sessionFactory.openSession();
		session.save(owner);
		session.close();

	}

	public boolean checkContactNumber(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("contactNumber",owner.getContactNumber());
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

	public boolean checkAadharNumber(Owner owner) {
			Session session=sessionFactory.openSession();
			Criteria crit=session.createCriteria(Owner.class);
			Criterion c1=Restrictions.eq("aadharNumber",owner.getAadharNumber());
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

	public boolean checkEmail(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
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
	
	public Owner checkOwnerLogin(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		Criterion c2=Restrictions.eq("password",owner.getPassword());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<Owner> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
			owner=(Owner)list.get(0);
		return owner;
		}
		
	}

}

