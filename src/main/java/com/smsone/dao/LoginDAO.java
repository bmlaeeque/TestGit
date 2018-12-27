/*
 * File: LoginDAO.java
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

import com.smsone.exception.DAOException;

public interface LoginDAO 
{
	boolean validateUser(String username, String password) throws DAOException;
}
