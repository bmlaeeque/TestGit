package com.smsone.controller;


import javax.servlet.http.HttpSession;
import javax.mail.Session;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smsone.model.CreditCardBooking;
import com.smsone.model.DebitCardBooking;
import com.smsone.model.User;
import com.smsone.service.CreditCardBookingService;
import com.smsone.service.DebitCardBookingService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class DebitCardBookingController {
	@Autowired
  DebitCardBookingService debitcardbookingservice;
	
	
	// save Debitcard
	
	@RequestMapping(value = "/savedebitcardbookinghere", method = RequestMethod.POST)
  	public String saveDebitCardBooking(@RequestParam("debitName") String debitName,@RequestParam("debitcardNumber") String debitcardNumber,@RequestParam("exmonth1") String exmonth1,@RequestParam("exyear1") Long exyear1,@RequestParam("debitcardCVC") Long debitcardCVC,Model model,HttpSession session)
  	{
  		
    	DebitCardBooking debitcardbooking= new DebitCardBooking();
    	
    	debitcardbooking.setDebitName(debitName);
    	debitcardbooking.setDebitcardNumber(debitcardNumber);
    	debitcardbooking.setExmonth1(exmonth1);
    	debitcardbooking.setExyear1(exyear1);
    	debitcardbooking.setDebitcardCVC(debitcardCVC);
  		
    	debitcardbookingservice.saveDebitCardBooking(debitcardbooking);
      	model.addAttribute("dcId",debitcardbooking.getDcId());
      	
  		return "success";
  	}
	
	

}
