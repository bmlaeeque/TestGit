/*
 * File: LoginController.java
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

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smsone.form.LoginForm;
import com.smsone.service.LoginService;

@Controller
@RequestMapping("/login")
public class LoginController 
{
	private static final Logger LOGGER = Logger.getLogger(LoginController.class.getName());
	
	@Autowired
	private LoginService loginService;
	
		
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView handleRequest(@ModelAttribute("LoginForm") LoginForm loginForm,
		      BindingResult result, ModelMap model, HttpServletRequest request) throws Exception 
		{
		ModelAndView mav = null;
		boolean flag = false;
		String userName = null;
		String password = null;
		
		if(result.hasErrors()) {
			mav = new ModelAndView("login");
		}
		else {
			userName = loginForm.getUserName();
			password = loginForm.getPassword();
			try {
				
				
				// Validate user against DB//here  i m passing values to Service class 
				flag = loginService.validateUser(userName, password);
			
			
			
			}
			catch(Exception e) {
				mav = new ModelAndView("error", "ERROR_KEY", "Unable to process your request, Please try again..!");
				LOGGER.error("Error is due to : " + e.getMessage());
			}
			if(true) {
				HttpSession session = request.getSession(true);
				// Setting User Name in session scope
				session.setAttribute("USER_KEY", userName);
				//after that they redirect to searchbook
				
				mav = new ModelAndView("redirect:searchBooks.html");
				LOGGER.info("User is able to login Successfully : " + userName);
			}
			else {
				mav = new ModelAndView("login", "INVALID_USER", "Invalid Username or Password. Please try again..!");
				LOGGER.info("User is unable to login : " + userName);
			}
		}
		return mav;
	}
}