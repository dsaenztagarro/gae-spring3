package com.davlanca.pets.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class MainController extends MultiActionController {

	private static final Logger log = Logger.getLogger(MainController.class.getName());
	
	private String indexView;
	private String petsView;
	private String newsView;
	private String registerView;

	public ModelAndView goToHome(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView(indexView);
	}

	public ModelAndView goToNews(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView(newsView,"msg","page1");
	}

	public ModelAndView goToPets(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView(petsView,"msg","page1");
	}
	
	public ModelAndView goToRegister(HttpServletRequest request, HttpServletResponse response) {
		return new ModelAndView("CustomerPage","msg","page3");
	}
	
	public void setIndexView(String indexView) {
		this.indexView = indexView;
	}

	public void setNewsView(String newsView) {
		this.newsView = newsView;
	}
	
	public void setPetsView(String petsView) {
		this.petsView = petsView;
	}
	
	public void setRegisterView(String registerView) {
		this.registerView = registerView;
	}
	
}
