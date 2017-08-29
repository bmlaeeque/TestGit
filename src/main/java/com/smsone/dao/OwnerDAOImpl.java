package com.smsone.dao;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Repository;

import com.smsone.model.Owner;
import com.smsone.model.User;
@Repository
public class OwnerDAOImpl implements OwnerDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private MailSender mailSender;

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

	public Owner verifyOwnerAccount(Owner owner) {
		Date date=new Date(); 
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		Criterion c2=Restrictions.eq("ownerHashcode",owner.getownerHashcode());
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
		  Date ownerDate=owner.getOwnerCreation_date();
		  long duration=date.getTime()-ownerDate.getTime();
		  Transaction tx=session.beginTransaction();
		  if(duration>60000)
		  {
			  owner.setOwnerStatus("Expired");
		  }
		  else
		  {
			  owner.setOwnerStatus("Activated");
		  }
		  session.save(owner);
		  tx.commit();
		  session.close();
		return owner;
		}
	}

	public Owner sendNewLink(Owner owner) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(Owner.class);
		Criterion c1=Restrictions.eq("email",owner.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<Owner> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			owner=(Owner)list.get(0);
			String newHashcode = UUID.randomUUID().toString();
			String newLink="http://localhost:2018/PGHOSTEL/ownerEmailVerify"+"?newHashcode="+newHashcode+"&email="+owner.getEmail();		
			SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
			simpleMailMessage.setTo(owner.getEmail());
			simpleMailMessage.setSubject(" Divastays Email Verification Link");
			simpleMailMessage.setText("Thank You For Your Interest ..\r\n"+ "Your account"+" " +owner.getEmail()+" " +"will be activated..\r\n"+" Please click on the below link.\r\n\r\n"+" "+newLink);
			mailSender.send(simpleMailMessage);
		  	Transaction tx=session.beginTransaction();
		  	owner.setownerHashcode(newHashcode);
			session.save(owner);
			tx.commit();
			session.close();
		}
		
		return owner;
	}

}

