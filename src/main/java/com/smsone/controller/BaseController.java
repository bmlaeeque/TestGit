
package com.smsone.controller;
import java.util.Date;
import javax.servlet.http.HttpSession;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.smsone.model.User;
@Controller
public class BaseController {
	private MailSender mailSender;

	@RequestMapping(value = "/showHome")
	public String showHome()
	{
		return "home";
	}
	
	
	@RequestMapping(value = "/showHome1")
	public String showHome1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		model.addAttribute("LoginMsg","Please enter valid email and password");
		return "home";
	}
	//show short term
	@RequestMapping(value = "/showShortTerm")
	public String showShortTerm(HttpSession session)
	{		
		session.setAttribute("accommodationType", "shortTerm");
		return "shortTerm";
	}
	@RequestMapping(value = "/showShortTerm1")
	public String showShortTerm1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		return "shortTerm";
	}
	//show long term
	@RequestMapping(value = "/showLongTerm")
	public String showLongTerm(HttpSession session)
	{
		session.setAttribute("accommodationType", "longTerm");
		return "longTerm";
	}
	@RequestMapping(value = "/showLongTerm1")
	public String showLongTerm1(@RequestParam("invalid") Long invalid,Model model)
	{
		model.addAttribute("invalid", invalid);
		return "longTerm";
	}
	//show help page
	@RequestMapping(value = "/showHelp")
	public String showHelp()
	{
		return "help";
	}
	//show HouseInfo help
	@RequestMapping(value = "/showHouseInfo/showHelp")
	public String showHelp1()
	{
		return "redirect:/showHelp";
	}
	//show HouseInfo Terms and condition page
	@RequestMapping(value = "/showHouseInfo/showTermsAndCondition")
	public String showTermsAndCondition1()
	{
		return "redirect:/showTermsAndCondition";
	}
	//show  Terms and condition page
	@RequestMapping(value = "/showTermsAndCondition")
	public String showTermsAndCondition()
	{
		return "termsAndCondition";
	}
	//show know more page
	@RequestMapping(value = "/showKnowMore")
	public String showKnowMore()
	{
		return "knowMore";
	}
	//show HouseInfo know more page
	@RequestMapping(value = "/showHouseInfo/showKnowMore")
	public String showKnowMore1()
	{
		return "redirect:/showKnowMore";
	}
	//show deal1 page
	@RequestMapping(value = "/showDeal1")
	public String showDeal1()
	{
		return "deal1";
	}	
	@RequestMapping(value = "/checkdate")
	public String checkdate(@RequestParam("date")@DateTimeFormat(pattern="yyyy-MM-dd") Date date)
	{			
		return "deal1";
	}
	//forgot password
	@RequestMapping(value = "/ForgotPassword1")
	public String ForgotPassword1()
	{
		return "ForgotPassword";
	}
	
	

	//for verification Link
	    @RequestMapping(value = "VerificationLink",method = RequestMethod.GET)
		public String VerificationLink(@RequestParam("email") String email,String message,String subject,Model model)
		{
	    	User user=new User();
	    	System.out.println("Hii");
			SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
			
			simpleMailMessage.setTo(email);
			simpleMailMessage.setSubject(subject);
			simpleMailMessage.setText(message);
			mailSender.send(simpleMailMessage);
			return "success";
		}
}
