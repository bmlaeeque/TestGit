/* * File: DAOException.java * * (c)2014 BookShop, Inc. * * All Rights Reserved. * * Change History: * * Date      	Release   	Developer          	Changes * ----------  	--------  	-----------------  	------------------------------- * 09/13/2014  	1.0.0     	Abhiram       		Creation */package com.smsone.exception;public class DAOException extends Exception {	private static final long serialVersionUID = -2544106369733928646L;	public DAOException() {		super();	}	public DAOException(String aMessage) {		super(aMessage);	}	public DAOException(String aMessage, Throwable aException) {		super(aMessage, aException);	}	public DAOException(Throwable aException) {		super(aException);	}}