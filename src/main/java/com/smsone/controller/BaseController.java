package com.smsone.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BaseController {
	//show home
	@RequestMapping(value = "/showHome")
	public String showHome()
	{
		return "home";
	}
	//show short term
	@RequestMapping(value = "/showShortTerm")
	public String showShortTerm()
	{
		return "shortTerm";
	}
	//show long term
	@RequestMapping(value = "/showLongTerm")
	public String showLongTerm()
	{
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
}
