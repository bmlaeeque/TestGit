/*
 * File: LoginForm.java
 *
 * (c)2014 BookShop, Inc.
 *
 * All Rights Reserved.
 *
 * Change History:
 *
 * Date      	Release   	Developer          	Changes
 * ----------  	--------  	-----------------  	-------------------------------
 * 12/12/2014  	1.0.0     	Abhiram       		Creation
 */
package com.smsone.form;

import java.io.Serializable;

import javax.validation.constraints.Size;


public class LoginForm implements Serializable
{
	private static final long serialVersionUID = 997893460134793472L;

	private String userName;

	@Size(min=5)
	private String password;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
