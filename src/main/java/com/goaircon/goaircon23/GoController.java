package com.goaircon.goaircon23;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GoController {

	@RequestMapping("/")
	public String Index()
	{
		return "index";
	}
	
	@RequestMapping("waight")
	public String Waight()
	{
		return "waight";
	}
	
	@RequestMapping("UserAccount")
	public String UserAccount()
	{
		return "UserAccount";
	}
	
	@RequestMapping("UserLogin")
	public String UserLogin()
	{
		return "UserLogin";
	}
	
}
