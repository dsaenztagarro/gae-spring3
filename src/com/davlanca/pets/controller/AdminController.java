package com.davlanca.pets.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class AdminController extends MultiActionController {

	private static final Logger log = Logger.getLogger(MainController.class.getName());
	
	private String leftView;
	
	public ModelAndView goToLeft(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView(leftView);
	}
	
	public void setLeftView(String leftView) {
		this.leftView = leftView;
	}

}
