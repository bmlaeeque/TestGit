/*
 * File: LoginServiceImpl.java
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
package com.smsone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smsone.dao.LoginDAO;



@Service
@Transactional
public class LoginServiceImpl implements LoginService 
{
	@Autowired
	private LoginDAO loginDAO;
	
	public boolean validateUser(String username, String password) throws Exception {
		return loginDAO.validateUser(username, password);
	}
}
