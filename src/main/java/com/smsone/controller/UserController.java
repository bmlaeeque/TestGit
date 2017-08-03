

package com.smsone.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.serial.SerialException;

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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.smsone.model.Beds;
import com.smsone.model.House;
import com.smsone.model.Owner;
import com.smsone.model.Room;
import com.smsone.model.User;
import com.smsone.service.HouseService;
import com.smsone.service.OwnerService;
import com.smsone.service.RoomService;
import com.smsone.service.UserService;
import com.smsone.util.PlacesUtility;

@Controller
@RequestMapping("/")
public class UserController {
	@Autowired
	private OwnerService ownerService;
	@Autowired
	private UserService userService;
	@Autowired
	private HouseService houseService;
	@Autowired
	private RoomService roomService;
	@Autowired
	private MailSender mailSender;
	//show home
	@RequestMapping(value = "/showHome")
	public String showHome(HttpServletResponse response)
	{
		response.setHeader("Cache-Control","no-cache"); 
		response.setHeader("Cache-Control","no-store");
		response.setDateHeader("Expires", 0); 
		response.setHeader("Pragma","no-cache");
		return "home";
	}
	
	//show HouseInfo Home
	@RequestMapping(value = "/showHouseInfo/showHome")
	public String showHome1(HttpServletResponse response)
	{
		response.setHeader("Cache-Control","no-cache"); 
		response.setHeader("Cache-Control","no-store"); 
		response.setDateHeader("Expires", 0); 
		response.setHeader("Pragma","no-cache"); 
		return "redirect:/showHome";
	}
	
	//show short term
	@RequestMapping(value = "/showShortTerm")
	public String showShortTerm(HttpServletResponse response)
	{
		response.setHeader("Cache-Control","no-cache"); 
		response.setHeader("Cache-Control","no-store"); 
		response.setDateHeader("Expires", 0); 
		response.setHeader("Pragma","no-cache"); 
		return "shortTerm";
	}
	
	//show long term
	@RequestMapping(value = "/showLongTerm")
	public String showLongTerm(HttpServletResponse response)
	{
		response.setHeader("Cache-Control","no-cache");
		response.setHeader("Cache-Control","no-store"); 
		response.setDateHeader("Expires", 0); 
		response.setHeader("Pragma","no-cache");
		return "longTerm";
	}
	//show Owner page
	@RequestMapping(value = "/showOwnerPage")
	public String showOwnerPage()
	{
		return "owner";
	}
	
	//show user reg page
	@RequestMapping(value = "/showUserReg")
	public String showUserReg()
	{
		return "userRegistration";
	}
	@RequestMapping(value = "/showHouseInfo/showUserReg")
	public String showUserRegistration()
	{
		return "redirect:/showUserReg";
	}
	
	
	
	//save user
	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@RequestParam("firstName") String firstName,@RequestParam("contactNumber")Long contactNumber,@RequestParam("aadharNumber")Long aadharNumber,@RequestParam("motherTounge")String motherTongue,@RequestParam("address")String address,@RequestParam("pincode")Integer pincode,
			@RequestParam("subcategory1")String state,@RequestParam("password1")String password,@RequestParam("lastName")String lastName,@RequestParam("email")String email,@RequestParam("foodPreference")String foodPreference,@RequestParam("profession")String profession,@RequestParam("city")String city,
			@RequestParam("subcategory")String area,@RequestParam("subcategory2")String country,HttpSession session)
	{
		User user=new User();
		user.setFirstName(firstName);
		user.setContactNumber(contactNumber);
		user.setAddress(address);
		user.setPincode(pincode);
		user.setCountry(country);
		user.setMotherTongue(motherTongue);
		user.setProfession(profession);
		user.setPassword(password);
		user.setAddress(address);
		user.setLastName(lastName);
		user.setEmail(email);
		user.setCity(city);
		user.setState(state);
		//user.setGender(gender);
		user.setFoodPreference(foodPreference);
		user.setAadharNumber(aadharNumber);
		user.setArea(area);
		User user1=(User)session.getAttribute("user");
		if(user1!=null)
		{
			Long refId=user1.getuId();
			user.setRefId(refId);
		}
		else
		{
			
		}
		userService.saveUser(user);
		
		return "success";
	}
	
	//show house reg page
	@RequestMapping(value = "/showHouseReg")
	public String showHouseRegistration(HttpSession session,Model model)
	{
		Owner owner1=(Owner)session.getAttribute("owner");
		Long oId=owner1.getoId();
		model.addAttribute("oId", oId);
		return "houseRegistration";
	}
	//save house
		@RequestMapping(value = "/saveHouse",method = RequestMethod.POST)
		public String saveHouse(@RequestParam("ownerId")Long oId,@RequestParam("tenancyType")String tenancyType,@RequestParam("room")Integer room,@RequestParam("city")String city,@RequestParam("subcategory1")String state,@RequestParam("rent")Double rent,@RequestParam("area")Double area,@RequestParam("img1")MultipartFile img1,@RequestParam("img2")MultipartFile img2,@RequestParam("houseName")String houseName,@RequestParam("floorNumber")Integer floorNumber,
		@RequestParam("address")String address,@RequestParam("subcategory")String locationArea,@RequestParam("subcategory2")String country,@RequestParam("deposit")Double deposit,@RequestParam("foodPreference")String foodPreference,@RequestParam("latitude")Double latitude,@RequestParam("longitude")Double longitude,@RequestParam("img3")MultipartFile img3,Model model) throws IOException,SerialException
		{
			System.out.println(latitude);
			House house=new House();
			house.setAddress(address);
			house.setArea(area);
			house.setDeposit(deposit);
			house.setFloorNumber(floorNumber);
			house.setFoodPreference(foodPreference);
			house.setRent(rent);
			house.setRoom(room);
			house.setState(state);
			house.setCity(city);
			house.setCountry(country);
			house.setLocationArea(locationArea);
			house.setTenancyType(tenancyType);
			house.setLatitude(latitude);
			house.setLongitude(longitude);
			byte[] img11 = img1.getBytes();
			byte[] img13 = img2.getBytes();
			byte[] img12 = img3.getBytes();
			house.setImg1(img11);
			house.setImg2(img12);
			house.setImg3(img13);
			house.setHouseName(houseName);
			houseService.saveHouse(house,oId);
			model.addAttribute("hId",house.gethId());
			model.addAttribute("room",room);
			return "roomReg";
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
			Owner owner=new Owner();
			owner.setFirstName(firstName);
			owner.setLastName(lastName);
			owner.setContactNumber(contactNumber);
			owner.setEmail(email);
			owner.setAadharNumber(aadharNumber);
			owner.setPassword(password);
		
			ownerService.saveOwner(owner);
			model.addAttribute("oId",owner.getoId());
			return "owner";
		}
	
	
	//show deal1 page
	@RequestMapping(value = "/showDeal1")
	public String showDeal1()
	{
		return "deal1";
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
		
	//show filter based on requirements
	@RequestMapping(value = "/showFilter111")
	public String showFilter(@RequestParam("profession") String profession,@RequestParam("language") String language,@RequestParam("address") String address,
	@RequestParam("accomodation") String accomodation,@RequestParam("food") String food,@RequestParam("price") String price[])
	{
		return "filter";
	}	
		@RequestMapping(value = "/showHomeResult")
		public String showHomeResult()
		{
			return "filter";
		}
		
		@RequestMapping(value = "/showHeader")
		public String showHeader()
		{
			return "header";
		}
				
		//show house info
		@RequestMapping(value = "/showHouseInfo/{hId}")
		public String showHouseInfo(@PathVariable("hId") Long hId,Model model,HttpSession session)
		{
			User user=(User)session.getAttribute("user");
			if(user!=null)
			{
				House house=new House();
				house.sethId(hId);
				house=houseService.getHouse(house);
				model.addAttribute("house",house);
				return "houseInfo";
			}
			else
			{
				return "redirect:/showFilter";
			}
			
		}
		//show room reg form
		@RequestMapping(value = "/showRoomReg")
		public String showRoomReg()
			{
				return "roomReg";
			}
		//save room details
				@RequestMapping(value = "/saveRoom", method = RequestMethod.POST)
				public String saveRoom(@RequestParam("houseId")Long hId,@RequestParam("roomId")Long roomId,@RequestParam("roomType")String roomType,@RequestParam("ac")String ac,@RequestParam("wifi")String wifi,
						@RequestParam("bathroom")String bathroom,@RequestParam("geyser")String geyser,@RequestParam("bed")String bed,@RequestParam("swimmingPool")String swimmingPool,
						@RequestParam("gym")String gym,@RequestParam("NumberOfBed")Integer numberOfBed,@RequestParam("foodAvailability")String foodAvailability,@RequestParam("img1")MultipartFile img1,@RequestParam("img2")MultipartFile img2,@RequestParam("img3")MultipartFile img3,Model model) throws IOException
				{
					Room room=new Room();
					room.setRoomId(roomId);
					room.setRoomtype(roomType);
					room.setAc(ac);
					room.setWifi(wifi);
					room.setBathroom(bathroom);
					room.setGeyser(geyser);
					room.setBed(bed);
					room.setSwimmingPool(swimmingPool);
					room.setGym(gym);
					room.setNumberOfBed(numberOfBed);
					room.setFoodAvailability(foodAvailability);
					byte[] img11 = img1.getBytes();
					byte[] img13 = img2.getBytes();
					byte[] img12 = img3.getBytes();
					room.setImg1(img11);
					room.setImg2(img12);
					room.setImg3(img13);
					roomService.saveRoom(room,hId);
					model.addAttribute("rId",room.getrId());
					model.addAttribute("numberOfBed", numberOfBed);
					return "bedInfo";
				}
		
		//check user mail
		@RequestMapping(value = "/checkUserMail")
		public @ResponseBody String checkEmail(@RequestParam("email") String email)
		{
			String msg=null;
			User user=new User();
			user.setEmail(email);
			boolean flag=userService.checkEmail(user);
			if(flag==true)
			{
				msg="alreday used mail id";
			}
			else
			{
				msg="";
			}
			return msg;
		}
		//check user contact number
		@RequestMapping(value = "/checkContactNumber")
		public @ResponseBody String checkContactNumber(@RequestParam("contactNumber") Long contactNumber)
		{
			String msg=null;
			User user=new User();
			user.setContactNumber(contactNumber);
			boolean flag=userService.checkContactNumber(user);
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
		
		//check user aadhar Number
				@RequestMapping(value = "/checkAadharNumber")
				public @ResponseBody String checkAadharNumber(@RequestParam("aadharNumber") Long aadharNumber)
				{
					String msg=null;
					User user=new User();
					user.setAadharNumber(aadharNumber);
					boolean flag=userService.checkAadharNumber(user);
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
					
				//plcae autocomplete
				@RequestMapping(value = "/listAddress", method = RequestMethod.GET)
				public @ResponseBody
				List<String> getAddressList(@RequestParam String input) {
					try {
						return PlacesUtility.getData(input);
					} catch (IOException e) {
						return new ArrayList<String>();
					}
				}
				//mapCheckshow
				@RequestMapping(value = "/showMapCheck")
				public String showMapCheck()
				{
					return "mapCheck";
					
				}
				//show payment page
				@RequestMapping(value = "/showHouseInfo/showPaymentPage")
				public String showPaymentPage1()
				{
					return "redirect:/showPaymentPage";
					
				}
				@RequestMapping(value = "showPaymentPage")
				public String showPaymentPage()
				{
					return "payment";
					
				}
				
				//send mail
				@RequestMapping(value="/sendMail",method = RequestMethod.POST)
				public String sendMail(@RequestParam("firstName")String firstName,@RequestParam("email")String email,@RequestParam("phoneNumber")String phoneNumber,@RequestParam("message")String message)
				{
					
					SimpleMailMessage simpleMailMessage=new SimpleMailMessage();
					simpleMailMessage.setTo("desaiswapnil1823@gmail.com");
					simpleMailMessage.setFrom("swapnildesai162@gmail.com");
					simpleMailMessage.setSubject("for contact us");
					simpleMailMessage.setText("first name:"+firstName+" email:"+email+" phoneNumber:"+phoneNumber+" message:"+message);
					mailSender.send(simpleMailMessage);
					return "success";
				}
				
				//show filter with results 
				@RequestMapping(value="/showFilter")
				public String list(Model model, Integer offset, Integer maxResults,HttpServletResponse response){
					System.out.println("hiiiiiiiiiiiiii");
					response.setHeader("Cache-Control","no-cache"); 
					response.setHeader("Cache-Control","no-store"); 
					response.setDateHeader("Expires", 0); 
					response.setHeader("Pragma","no-cache"); 
					model.addAttribute("house", houseService.list(offset, maxResults));
					model.addAttribute("count", houseService.count());
					model.addAttribute("offset", offset);
					model.addAttribute("url", "showFilter");
					return "filter";
					}
				
				//filter page response with only address
				@RequestMapping(value="/showFilter1")
				public String listHouse(@RequestParam("address") String address,Model model, Integer offset, Integer maxResults,HttpSession session){
					if(address.isEmpty())
					{
						 return "redirect:/showFilter";

					}
					else
					{
					House house=new House();
					house.setAddress(address);
					model.addAttribute("house", houseService.listHouse(house,offset, maxResults));
					model.addAttribute("count", houseService.countByFilter(house));
					model.addAttribute("offset", offset);
					model.addAttribute("url", "showFilter1");
					return "filter";
					}
				}
				//login check
				@RequestMapping(value = "/login", method = RequestMethod.POST)
				public String login(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session,Model model,HttpServletResponse response)
				{
					//String msg=null;
					User user=new User();
					user.setEmail(email);
					user.setPassword(password);
					
					user=userService.checkLogin(user);
					
					if(user==null)
					{
						session.setAttribute("invalid", "invalid");
					}
					else
					{
						String email1=user.getEmail();
						session.setAttribute("email", email1);
						session.setAttribute("user",user);
					}
					return "home";
					
					
				}
				//filter page login check
				@RequestMapping(value = "/loginFilter", method = RequestMethod.POST)
				public String loginFilter(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session,Model model,HttpServletResponse response)
				{
					//String msg=null;
					User user=new User();
					user.setEmail(email);
					user.setPassword(password);
					
					user=userService.checkLogin(user);
					
					if(user==null)
					{
						session.setAttribute("invalid", "invalid");
						return "redirect:/showFilter";
					}
					else
					{
						String email1=user.getEmail();
						session.setAttribute("email", email1);
						session.setAttribute("user",user);
						return "redirect:/showFilter";
					}
					
					
					
				}
				
				//owner login check 
				@RequestMapping(value = "/loginOwner", method = RequestMethod.POST)
				public String loginOwner(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session,Model model,HttpServletResponse response)
				{
					//String msg=null;
					Owner owner=new Owner();
					owner.setEmail(email);
					owner.setPassword(password);
					
					owner=ownerService.checkOwnerLogin(owner);
					if(owner==null)
					{
						session.setAttribute("invalid", "invalid");
						return "owner";
					}
					else
					{
						String email2=owner.getEmail();
						session.setAttribute("ownerEmail", email2);
						session.setAttribute("owner",owner);
						return "owner";
					}
					
					
					
				}
			
				//login check popup
				@RequestMapping(value = "/login1", method = RequestMethod.POST)
				public @ResponseBody String loginPopup(@RequestParam("email") String email,@RequestParam("password") String password,HttpSession session)
				{
					//String msg=null;
					User user=new User();
					user.setEmail(email);
					user.setPassword(password);
					String msg="";
					user=userService.checkLogin(user);
					if(user==null)
					{
						msg="please enter valid username and password";
					}
					else
					{
						msg="ghgghgg";
					}
					return msg;
					
					
				}
				
				@RequestMapping("/logout")
				public String logout(HttpSession session,HttpServletResponse response) {
					response.setHeader("Cache-Control","no-cache"); 
					response.setHeader("Cache-Control","no-store"); 
					response.setDateHeader("Expires", 0); 
					response.setHeader("Pragma","no-cache"); 
					session.removeAttribute("User");
					session.removeAttribute("email");
					session.invalidate();
				    return "home";
				}
				
				//Owner Logout Code
				@RequestMapping("/logoutOwner")
				public String logoutOwner(HttpSession session,HttpServletResponse response) {
					response.setHeader("Cache-Control","no-cache"); 
					response.setHeader("Cache-Control","no-store"); 
					response.setDateHeader("Expires", 0); 
					response.setHeader("Pragma","no-cache"); 
					session.removeAttribute("Owner");
					session.removeAttribute("ownerEmail");
					session.invalidate();
				    return "owner";
				}
				
				
				//filter page response with filter
				@RequestMapping(value="/showFilter3")
				public String listHouseByFilters(@RequestParam("food") String food,Model model, Integer offset, Integer maxResults,HttpSession session){
					House house1=new House();
					house1.setFoodPreference(food);
					List<House> house=houseService.listHouseByFilters(house1,offset, maxResults);
					System.out.println(house);
					session.setAttribute("house", house1);
					model.addAttribute("house", houseService.listHouseByFilters(house1,offset, maxResults));
					model.addAttribute("count", houseService.count());
					model.addAttribute("offset", offset);
					model.addAttribute("url", "showFilter2");
					return "filter";
				}
				//filter page response with filter
				@RequestMapping(value="/showFilter2")
				public String listHouseByFilter(@RequestParam("profession") String profession,@RequestParam("language") String language,@RequestParam("subcategory") String area,@RequestParam("food") String food,@RequestParam("price") Double rent,Model model, Integer offset, Integer maxResults,HttpSession session){
					House house=new House();
					User user=new User();
					user.setProfession(profession);
					user.setMotherTongue(language);
					house.setLocationArea(area);
					house.setRent(rent);
					session.setAttribute("profession", profession);
					session.setAttribute("language", language);
					session.setAttribute("food", food);
					session.setAttribute("area", area);
					session.setAttribute("rent",rent);
					house.setFoodPreference(food);
					model.addAttribute("house", houseService.listHouseByFilter(house,offset, maxResults));
					model.addAttribute("count", houseService.count());
					model.addAttribute("offset", offset);
					//model.addAttribute("url", "showFilter2");
					return "filter";
				}
				@RequestMapping(value="/showFilterWithFacilities")
				public String showFilterWithFacilities(@RequestParam("facilities") String facilities[],Model model,Integer offset, Integer maxResults,HttpSession session)
				{
					String profeesion=(String)session.getAttribute("profession");
					String language=(String)session.getAttribute("language");
					String food=(String)session.getAttribute("food");
					String area=(String)session.getAttribute("area");
					Double rent=(Double)session.getAttribute("rent");
					User user=new User();
					user.setProfession(profeesion);
					user.setMotherTongue(language);
					House house=new House();
					house.setRent(rent);
					house.setLocationArea(area);
					model.addAttribute("house", houseService.listHouseByadvancedFilter(house,user,offset,maxResults,facilities));
					model.addAttribute("count", houseService.count());
					model.addAttribute("offset", offset);
					return "filter";
				}
				//sort record
				@RequestMapping(value="/sortPrice")
				public String Sortist(@RequestParam("priceSort")String priceSort,Model model, Integer offset, Integer maxResults){
					model.addAttribute("house", houseService.list(offset, maxResults));	
					model.addAttribute("count", houseService.count());
					model.addAttribute("offset", offset);
						return "filter";
					}	
				@RequestMapping(value="/saveBed")
				public String saveBed(@RequestParam("bed") String bed,@RequestParam("rid") Long rid)
				{
					Beds beds=new Beds();
					beds.setDirection(bed); 
					houseService.saveBed(beds,rid);
					return "bedInfo";
				}
				@RequestMapping(value="/showBed")
				public String saveBed()
				{
					
					
					return "bedInfo";
				}
				//assign bed
				@RequestMapping("/assignBed")
				public String assignBed(@RequestParam("uId")Long uId,@RequestParam("bId")Long bId)
				{
					User user=new User();
					Beds beds=new Beds();
					user.setuId(uId);
					beds.setbId(bId);
					roomService.assignBed(user, beds);
					return "assign";
				}
				
				//show room info
				@RequestMapping(value="/showRoomInfo/{hId}")
				public String showRoominfo(@PathVariable("hId") Long hId)
				{
					//model.addAttribute("room",roomService.getAllRoomDetails(hId));
					//model.addAttribute("roomCount",roomService.countRooms(hId));
					return "roomInfo";
				}
				
				@RequestMapping(value="/showHouseInfo/showRoomInfo")
				public String showRoomDetails(@RequestParam("hId")Long hId)
				{
					 return "redirect:/showRoomInfo/{hId}";
					
				}
				
				
				
			
			
				
}				


				
				
				
				
				