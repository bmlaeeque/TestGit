package com.smsone.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.smsone.model.NetBankingBooking;
import com.smsone.service.NetBankingBookingService;

@Controller
@RequestMapping("/")

public class NetBankingBookingcontroller {

	
	@Autowired
	NetBankingBookingService netbankingbookingservice;
	
	@RequestMapping(value = "/NetBankingBooking", method = RequestMethod.GET)
	public ModelAndView shownetbankingbookingForm() {
			NetBankingBooking netbankingbooking = new NetBankingBooking();
		
 
		// Add the command object to the modelview
		ModelAndView mv = new ModelAndView("netbankingbooking");
		mv.addObject("netbankingbooking", netbankingbooking);
 
		return mv;
	}
 
	@RequestMapping(value = "/NetBankingBooking", method = RequestMethod.POST)
	public String submitForm(Model model, NetBankingBooking netbankingbooking) {
 
		//model.addAttribute("NetBankingBooking", netbankingbooking);
      	model.addAttribute("nbId",netbankingbooking.getNbId());

		netbankingbookingservice.submitForm(netbankingbooking);
		return "success";
 
	}
}