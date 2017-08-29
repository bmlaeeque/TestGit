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

import com.smsone.model.User;
@Repository
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private MailSender mailSender;

	//save user
	public void saveUser(User user) {
		Session session=sessionFactory.openSession();
		session.save(user);
		session.close();
	}
	@SuppressWarnings("unchecked")
	public boolean checkEmail(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		crit.add(c1);
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
	public boolean checkContactNumber(User user) {
		
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("contactNumber",user.getContactNumber());
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
	public boolean checkAadharNumber(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("aadharNumber",user.getAadharNumber());
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
	public User checkLogin(User user) {
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		Criterion c2=Restrictions.eq("password",user.getPassword());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{
		user=(User)list.get(0);
		return user;
		}
		
	}
	public User verifyUserAccount(User user) {
		Date date=new Date(); 
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		Criterion c2=Restrictions.eq("hashcode",user.getHashcode());
		Criterion c3=Restrictions.and(c1,c2);
		crit.add(c3);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
		user=(User)list.get(0);
		  Date userDate=user.getUserCreation_date();
		  long duration=date.getTime()-userDate.getTime();
		  Transaction tx=session.beginTransaction();
		  if(duration>60000)
		  {
			  user.setStatus("Expired");
		  }
		  else
		  {
			  user.setStatus("Activated");
		  }
		  session.save(user);
		  tx.commit();
		  session.close();
		return user;
		}
	}
	
	public User sendNewLink(User user) {
		
		Session session=sessionFactory.openSession();
		Criteria crit=session.createCriteria(User.class);
		Criterion c1=Restrictions.eq("email",user.getEmail());
		crit.add(c1);
		@SuppressWarnings("unchecked")
		List<User> list=crit.list();
		if(list.isEmpty())
		{
			return null;
		}
		else
		{	
			user=(User)list.get(0);
			String newHashcode = UUID.randomUUID().toString();
			String newLink="http://localhost:2018/PGHOSTEL/emailVerify"+"?newHashcode="+newHashcode+"&email="+user.getEmail();		
			SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
			simpleMailMessage.setTo(user.getEmail());
			simpleMailMessage.setSubject(" Divastays Email Verification Link");
			simpleMailMessage.setText("Thank You For Your ..\r\n"+ "Your account"+" " +user.getEmail()+" " +"will be activated..\r\n"+" Please click on the below link.\r\n\r\n"+" "+newLink);
			mailSender.send(simpleMailMessage);
		  	Transaction tx=session.beginTransaction();
			user.setHashcode(newHashcode);
			session.save(user);
			tx.commit();
			session.close();
		}
		
		return user;
	}

}
