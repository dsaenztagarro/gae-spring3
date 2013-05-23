package com.davlanca.pets.controller;

import java.security.Principal;
import java.util.logging.Logger;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class LoginController extends MultiActionController {

	private static final Logger log = Logger.getLogger(LoginController.class.getName());

	@RequestMapping(value="/welcome", method = RequestMethod.GET)
	public String printWelcome(ModelMap model, Principal principal ) {
 
		String name = principal.getName();
		model.addAttribute("username", name);
		model.addAttribute("message", "Spring Security Custom Form example");
		return "hello";
 
	}
 
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String login(ModelMap model) {
 
		return "login";
 	}
 
	@RequestMapping(value="/loginfailed", method = RequestMethod.GET)
	public String loginerror(ModelMap model) {
 
		model.addAttribute("error", "true");
		return "login";
 
	}
 
	@RequestMapping(value="/logout", method = RequestMethod.GET)
	public String logout(ModelMap model) {
 
		return "login";
 	}	
	
}
