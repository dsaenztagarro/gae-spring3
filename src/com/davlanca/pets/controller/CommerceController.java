package com.davlanca.pets.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class CommerceController extends AbstractController {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());
	
	private String PARAM_MSG = "message";
	private int counter;
	private String mode;
	
	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		log.info("handleRequestInternal-info");
		log.warning("handleRequestInternal-warning");
		log.severe("handleRequestInternal-severe");
		String mode = ServletRequestUtils.getRequiredStringParameter(req,PARAM_MSG);

		counter++;
		ModelAndView mav = new ModelAndView("commerce/master_commerce");
		mav.addObject(PARAM_MSG, mode);
		mav.addObject("counter", counter);
		mav.addObject("mode", mode);
		return mav;
	}

	public void setMode(String mode) {
		this.mode = mode;
	}
	
	
}
