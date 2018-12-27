/*
 * File: LogoutController.java
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
package com.smsone.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/logout")
public class LogoutController 
{
	private static final Logger LOGGER = Logger.getLogger(LogoutController.class.getName());
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	{
		HttpSession session = request.getSession(true);
		session.removeAttribute("USER_KEY");
		// Invalidate the session
		session.invalidate();
		LOGGER.info("User is able to logout Successfully");
		return new ModelAndView("redirect:login.html");
	}
}
