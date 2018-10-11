package com.smsone.controller;

import java.util.Date;

import javax.servlet.http.HttpSession;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smsone.model.Beds;
import com.smsone.model.CreditCardBooking;
import com.smsone.model.Room;
import com.smsone.model.User;
import com.smsone.service.CreditCardBookingService;
import com.smsone.service.HouseService;
import com.smsone.service.RoomService;

@Controller
@RequestMapping("/")
public class CreditCardBookingController {
	@Autowired
	CreditCardBookingService creditcardbookingservice;
	
	@Autowired
	private HouseService houseService;

	@Autowired
	private RoomService roomService;
	
	// save CreditcardBooking
		@RequestMapping(value = "/saveCreditCardBookingHere", method = RequestMethod.POST)
	  	public String saveCreditCardBooking(HttpSession httpSession,@RequestParam("creditName") String creditName,@RequestParam("cardNumber") String cardNumber,@RequestParam("exmonth") String exmonth,@RequestParam("exyear") Long exyear,@RequestParam("cvcnumber") Long cvcnumber,Model model,HttpSession session)
	  	{
	  		/**
	  		 * Set credit card details
	  		 */
	    	CreditCardBooking creditcardbooking = new CreditCardBooking();
	    	
	    	creditcardbooking.setCreditName(creditName);
	    	creditcardbooking.setCardNumber(cardNumber);
	  		creditcardbooking.setExmonth(exmonth);
	  		creditcardbooking.setExyear(exyear);
	  		creditcardbooking.setCvcnumber(cvcnumber);	  			  	
	  		/**
	  		 * 
	  		 */
	  		creditcardbookingservice.saveCreditCardBooking(creditcardbooking);
	  		
	  		int hId=(Integer)session.getAttribute("hId");
			int rId=(Integer)session.getAttribute("rId");
			int bId=(Integer)session.getAttribute("bId");
			System.out.println(hId+" ,"+rId+", "+bId);
			User user=(User)session.getAttribute("user");
			
			Beds beds=new Beds();
			beds.setBedId(Long.valueOf(bId));
			beds.sethId(hId+"");
			beds.setStatus(1);
			beds.setCheckIn(new Date());
			beds.setUser(user);
			
			Room rm=roomService.getRoom(Long.valueOf(rId));
			beds.setRoom(rm);
			
			roomService.updateBids(user, beds);
	      	model.addAttribute("cdId_bookedBed",creditcardbooking.getCdId_bookedBed());
	  		return "redirect:/showsucesspage";
	  	}
		@RequestMapping(value = "/showsucesspage")
		public String showsucesspage() {

			JOptionPane optionPane = new JOptionPane("Congratulations,Successfully Booked Bed",JOptionPane.OK_OPTION);
			JDialog dialog = optionPane.createDialog("Successfully!");
			dialog.setAlwaysOnTop(true); // to show top of all other application
			dialog.setVisible(true);// to visible the dialog
	         
			return "home";
		}
		
		//check Bed
		@RequestMapping(value = "/checkBed")
		public @ResponseBody String checkBed(@RequestParam("cdId_bookedBed") Long cdId_bookedBed)
		{
			String msg=null;
            CreditCardBooking creditcardbooking = new CreditCardBooking();
            creditcardbooking.setCdId_bookedBed(cdId_bookedBed);
			boolean flag=creditcardbookingservice.checkBed(creditcardbooking);
			if(flag==true)
			{
				msg="allreday BookedBed";
			}
			else
			{
				msg="";
				
			}
			return msg;
			
		}
}
