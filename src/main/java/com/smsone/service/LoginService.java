/*
 * File: LoginService.java
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

public interface LoginService 
{
	boolean validateUser(String username, String password) throws Exception;
}
