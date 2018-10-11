package com.smsone.controller;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.smsone.model.House;
import com.smsone.model.Member;
import com.smsone.model.Owner;
import com.smsone.service.MemberService;
import com.smsone.service.OwnerService;

@Controller
public class MemberController {

	@Autowired
	private MailSender mailSender;
	@Autowired
	private MemberService memberService;
	@Autowired
	private OwnerService ownerService;
	
	
	@RequestMapping(value = "/showMemberPage")
	public String showMemberPage() {

		return "member";
	}
	//Member List
	@RequestMapping(value = "/memberList")
	public String memberList() {

		return "divaMemberList";
	}

	// show member reg page
	@RequestMapping(value = "/showMemberReg")
	public String showMemberRegistration() {
		return "memberRegistration";
	}

	// edit Member details
	@RequestMapping(value = "/editMemberProfile/{mId}")
	public String editMemberProfile(@PathVariable("mId") Long mId, RedirectAttributes ra) {
		ra.addAttribute("mId", mId);
		return "redirect:/editMemberRegistration1";
	}

	@RequestMapping(value = "/editMemberRegistration1")
	public String editMemberRegistration1(@RequestParam("mId") Long mId, Model model) {
		Member member = new Member();
		member.setmId(mId);
		model.addAttribute("member", memberService.getMember(member));
		return "editMemberRegistration";
	}

	// show Member Houses
	@RequestMapping(value = "/memberHouse")
	public String memberHouse(Model model, HttpSession session) {
		Member member = (Member) session.getAttribute("member");
		if (member != null) {
			List<House> house = member.getHouse();
			model.addAttribute("house", house);
		}
		return "memberHomes";
	}

	@RequestMapping(value = "/showMemberPage1")
	public String showMemberPage1(@RequestParam("invalid") Long invalid, Model model) {
		model.addAttribute("invalid", invalid);
		model.addAttribute("LoginMsg", "Please enter valid email and password");
		return "member";
	}

	// save member
	@RequestMapping(value = "/saveMember", method = RequestMethod.POST)
	public String saveMember(@RequestParam("firstName") String firstName,
			@RequestParam("contactNumber") Long contactNumber, @RequestParam("password1") String password,
			@RequestParam("aadharNumber") Long aadharNumber, @RequestParam("lastName") String lastName,
			@RequestParam("email") String email, Model model, HttpSession session) {
		Date date = new Date();
		Member member = new Member();
		Owner owner= new Owner();
		member.setFirstName(firstName);
		member.setLastName(lastName);
		member.setContactNumber(contactNumber);
		member.setEmail(email);
		member.setAadharNumber(aadharNumber);
		member.setPassword(password);
		String memberHashcode = UUID.randomUUID().toString();
		member.setMemberHashcode(memberHashcode);
		member.setMemberCreation_date(date);
		memberService.saveMember(member);
		//ownerService.updateOwnerMember(owner);
		/*
		 * String link="http://localhost:8080/PGHOSTEL/ownerEmailVerify"+
		 * "?ownerHashcode="+ownerHashcode+"&email="+email; String
		 * msg="Thank You For Your Interest..\r\n"+ "Your account"+" "
		 * +email+" "
		 * +"will be activated..\r\n"+" Please click on the below link.\r\n\r\n"
		 * +" "+link;
		 * sendDivastaysMail(email,msg,"Divastays Email Activation Link");
		 */
		model.addAttribute("mId", member.getmId());
		
		return "success";
	}

	// owner login check
	@RequestMapping(value = "/loginMember", method = RequestMethod.POST)
	public String loginMember(@RequestParam("email") String email, @RequestParam("password") String password,
			HttpSession session, RedirectAttributes ra) {
		Member member = new Member();

		member.setEmail(email);
		member.setPassword(password);
		member = memberService.checkMemberLogin(member);
		if (member == null) {
			ra.addAttribute("invalid", 400);
		} else {
			ra.addAttribute("invalid", 0000);
			Long mId = member.getmId();
			ra.addAttribute("mId", mId);
			session.setAttribute("member", member);
			session.setAttribute("mId", member.getmId());

		}
		return "redirect:/showMemberPage1";
	}

	// Member Logout Code
	@RequestMapping("/logoutMember")
	public String logoutMember(HttpSession session) {
		session.removeAttribute("Member");
		session.removeAttribute("memberEmail");
		session.invalidate();
		return "redirect:/showMemberPage";
	}

	@RequestMapping(value = "/memberEmailVerify")
	public String memberEmailVerify(
			@RequestParam(required = false, defaultValue = "memberHashcode", value = "memberHashcode") String memberHashcode,
			@RequestParam(required = false, defaultValue = "email", value = "email") String email, Model model) {
		Member member = new Member();
		member.setMemberHashcode(memberHashcode);
		member.setEmail(email);
		member = memberService.verifyMemberAccount(member);
		if (member == null) {
			model.addAttribute("memberStatus", "InvalidUser");
		} else {
			String memberStatus = member.getMemberStatus();
			if (memberStatus.equals("Activated")) {
				model.addAttribute("memberrStatus", "Activated");
			} else {
				model.addAttribute("memberStatus", "Expired");
			}

		}
		model.addAttribute("email", email);
		return "home";
	}

	@RequestMapping(value = "/resendMemberEmailVerify")
	public String resendEmailVerify(
			@RequestParam(required = false, defaultValue = "memberHashcode", value = "memberHashcode") String memberHashcode,
			@RequestParam(required = false, defaultValue = "email", value = "email") String email, Model model) {
		Member member = new Member();
		member.setMemberHashcode(memberHashcode);
		member.setEmail(email);
		member = memberService.sendNewLink(member);
		if (member == null) {
			model.addAttribute("status", "InvalidUser");
		} else {
			String status = member.getMemberStatus();
			if (status.equals("Activated")) {
				model.addAttribute("status", "Activated");
			} else {
				model.addAttribute("status", "Expired");
			}

		}
		model.addAttribute("email", email);
		return "home";
	}

	@RequestMapping(value = "/memberEmailExpirePopup", method = RequestMethod.POST)
	public String memberEmailExpirePopup(@RequestParam("email") String email) {
		Date date = new Date();
		Member member = new Member();
		String memberHashcode = UUID.randomUUID().toString();
		member.setEmailResendTime(date);
		member.setMemberHashcode(memberHashcode);
		member.setEmail(email);
		member = memberService.sendNewLink(member);
		String newLink = "http://localhost:8080/PGHOSTEL/resendMemberEmailVerify" + "?memberHashcode=" + memberHashcode
				+ "&email=" + email;
		String msg = "Thank You For Your Interest..\r\n" + "Your account" + " " + email + " "
				+ "will be activated..\r\n" + " Please click on the below link.\r\n\r\n" + " " + newLink;
		sendDivastaysMail(email, msg, " Divastays Email Verification Link");
		return "home";
	}

	public String sendDivastaysMail(String email, String message, String subject) {
		SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
		simpleMailMessage.setTo(email);
		simpleMailMessage.setSubject(subject);
		simpleMailMessage.setText(message);
		mailSender.send(simpleMailMessage);
		return "success";
	}

	// check owner aadhar Number
	@RequestMapping(value = "/checkMemberAadharNumber1")
	public @ResponseBody String checkMemberAadharNumber1(@RequestParam("aadharNumber") Long aadharNumber) {
		String msg = null;
		Member member = new Member();
		member.setAadharNumber(aadharNumber);
		boolean flag = memberService.checkAadharNumber(member);
		if (flag == true) {
			msg = "alreday used Aadhar number";
		} else {
			msg = "";
		}
		return msg;
	}

	// check owner contact Number
	@RequestMapping(value = "/checkMemberContactNumber")
	public @ResponseBody String checkMemberContactNumber(@RequestParam("contactNumber") Long contactNumber) {
		String msg = null;
		Member member = new Member();
		member.setContactNumber(contactNumber);
		boolean flag = memberService.checkContactNumber(member);
		if (flag == true) {
			msg = "alreday used contact number";
		} else {
			msg = "";
		}
		return msg;
	}

	// check owner email
	@RequestMapping(value = "/checkMemberEmail")
	public @ResponseBody String checkMemberEmail(@RequestParam("email") String email) {
		String msg = null;
		Member member = new Member();
		member.setEmail(email);
		boolean flag = memberService.checkEmail(member);
		if (flag == true) {
			msg = "alreday used email";
		} else {
			msg = "";
		}
		return msg;
	}
	

}
