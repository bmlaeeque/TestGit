package com.smsone.controller;

import java.util.Date;
import java.util.UUID;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smsone.model.Owner;
import com.smsone.service.OwnerService;

@Controller

public class OwnerController {
	@Autowired
	private OwnerService ownerService;
	@Autowired
	private MailSender mailSender;

	//show Owner page
	@RequestMapping(value = "/showOwnerPage")
	public String showOwnerPage()
	{
		return "owner";
	}

	//show owner reg page
	@RequestMapping(value = "/showOwnerReg")
	public String showOwnerRegistration()
	{
		return "ownerRegistration";
	}

	//save owner
	@RequestMapping(value = "/saveOwner", method = RequestMethod.POST)
	public String saveOwner(@RequestParam("firstName") String firstName,@RequestParam("contactNumber")Long contactNumber,@RequestParam("password1") String password,
			@RequestParam("aadharNumber") Long aadharNumber,@RequestParam("lastName") String lastName,@RequestParam("email") String email,Model model,HttpSession session)
	{
		Date date=new Date();
		Owner owner=new Owner();
		owner.setFirstName(firstName);
		owner.setLastName(lastName);
		owner.setContactNumber(contactNumber);
		owner.setEmail(email);
		owner.setAadharNumber(aadharNumber);
		owner.setPassword(password);
		String ownerHashcode = UUID.randomUUID().toString();
		String link="http://localhost:2018/PGHOSTEL/ownerEmailVerify"+"?ownerHashcode="+ownerHashcode+"&email="+email;
		owner.setownerHashcode(ownerHashcode);
		owner.setOwnerCreation_date(date);
		ownerService.saveOwner(owner);
		SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
		simpleMailMessage.setTo(email);
		simpleMailMessage.setSubject(" Divastays Email Verification Link");
		simpleMailMessage.setText("Thank You For Your Interest..\r\n"+ "Your account"+" " +email+" " +"will be activated..\r\n"+" Please click on the below link.\r\n\r\n"+" "+link);
		mailSender.send(simpleMailMessage);
		model.addAttribute("oId",owner.getoId());
		return "redirect:/showOwnerPage";
	}
	@RequestMapping(value = "/ownerEmailVerify")
	public String emailVerify(@RequestParam(required = false, defaultValue = "ownerHashcode", value="ownerHashcode") String ownerHashcode,@RequestParam(required = false, defaultValue = "email", value="email") String email,Model model)
	{
		Owner owner=new Owner();					
		owner.setownerHashcode(ownerHashcode);
		owner.setEmail(email);
		owner=ownerService.verifyOwnerAccount(owner);
		if(owner==null)
		{	
			model.addAttribute("ownerStatus", "InvalidUser");
		}
		else
		{
			String ownerStatus=owner.getOwnerStatus();
			if(ownerStatus.equals("Activated"))
			{
				model.addAttribute("ownerStatus", "Activated");
			}
			else
			{
				model.addAttribute("ownerStatus", "Expired");
			}

		}
		model.addAttribute("email", email);
		return "redirect:/showHome";
	}
	@RequestMapping(value = "/ownerEmailExpirePopup",method = RequestMethod.POST)
	public String ownerExpirePopup(@RequestParam("email") String email)
	{
		Owner owner=new Owner();
		owner.setEmail(email);
		owner=ownerService.sendNewLink(owner);
		return "redirect:/showHome";
	}
	//check owner aadhar Number
	@RequestMapping(value = "/checkOwnerAadharNumber1")
	public @ResponseBody String checkOwnerAadharNumber1(@RequestParam("aadharNumber") Long aadharNumber)
	{
		String msg=null;
		Owner owner=new Owner();
		owner.setAadharNumber(aadharNumber);
		boolean flag=ownerService.checkAadharNumber(owner);
		if(flag==true)
		{
			msg="alreday used Aadhar number";
		}
		else
		{
			msg="";
		}
		return msg;
	}

	//check owner contact Number
	@RequestMapping(value = "/checkOwnerContactNumber")
	public @ResponseBody String checkOwnerContactNumber(@RequestParam("contactNumber") Long contactNumber)
	{
		String msg=null;
		Owner owner=new Owner();
		owner.setContactNumber(contactNumber);
		boolean flag=ownerService.checkContactNumber(owner);
		if(flag==true)
		{
			msg="alreday used contact number";
		}
		else
		{
			msg="";
		}
		return msg;
	}

	//check owner email
	@RequestMapping(value = "/checkOwnerEmail")
	public @ResponseBody String checkOwnerEmail(@RequestParam("email") String email)
	{
		String msg=null;
		Owner owner=new Owner();
		owner.setEmail(email);
		boolean flag=ownerService.checkEmail(owner);
		if(flag==true)
		{
			msg="alreday used email";
		}
		else
		{
			msg="";
		}
		return msg;
	}

	//owner login check 
	@RequestMapping(value = "/loginOwner", method = RequestMethod.POST)
	public String loginOwner(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session,Model model,HttpServletResponse response)
	{
		Owner owner=new Owner();
		owner.setEmail(email);
		owner.setPassword(password);

		owner=ownerService.checkOwnerLogin(owner);
		if(owner==null)
		{
			session.setAttribute("invalid", "invalid");
		}
		else
		{
			String email2=owner.getEmail();
			session.setAttribute("ownerEmail", email2);
			session.setAttribute("owner",owner);

		}
		return "redirect:/showOwnerPage";
	}

	//Owner Logout Code
	@RequestMapping("/logoutOwner")
	public String logoutOwner(HttpSession session) {
		session.removeAttribute("Owner");
		session.removeAttribute("ownerEmail");
		session.invalidate();
		return "redirect:/showOwnerPage";
	}




}
