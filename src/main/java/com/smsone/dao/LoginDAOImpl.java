/*
 * File: LoginDAOImpl.java
 *
 * (c)2014 BookShop, Inc.
 *
 * All Rights Reserved.
 *
 * Change History:
 *
 * Date      	Release   	Developer          	Changes
 * ----------  	--------  	-----------------  	-------------------------------
 * 09/13/2014  	1.0.0     	Abhiram       		Creation
 */
package com.smsone.dao;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.smsone.exception.DAOException;
import com.smsone.model.SystemUsers;






@Repository
public class LoginDAOImpl implements LoginDAO {
	
	private static final Logger logger = Logger.getLogger(LoginDAOImpl.class.getName());

	@Autowired
	private SessionFactory sessionFactory;

	public boolean validateUser(String username, String password) throws DAOException 
	{
		logger.debug("Enter");
		Session session = null;
		boolean flag = false;
		try {
			session = sessionFactory.getCurrentSession();
			Criteria crit=session.createCriteria(SystemUsers.class)
	        .add(Restrictions.eq("UserName", username))
	        .add(Restrictions.eq("password", password));
			
			List<SystemUsers> list = crit.list();
			
			if(list == null || list.isEmpty()) {
				flag = false;
			}
			else {
				flag = true;
			}
			
			
		}
		catch(HibernateException he) {
			logger.error("Error while validating user : "+ he.getMessage());
			throw new DAOException();
		}
		logger.debug("Exit");
		return flag;
	}
}
