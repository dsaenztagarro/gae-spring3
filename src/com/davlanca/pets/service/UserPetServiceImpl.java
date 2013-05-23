package com.davlanca.pets.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.UserPet;
import com.davlanca.pets.repository.UserPetDAO;

public class UserPetServiceImpl implements UserPetService {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());
	
	@Autowired 
	private UserPetDAO userPetDAO;
	
	@Override
	public void add(UserPet userPet) {
		log.info("UserPet added successfully");
		try {
			userPetDAO.create(userPet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
