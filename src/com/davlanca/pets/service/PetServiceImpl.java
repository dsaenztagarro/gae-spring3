package com.davlanca.pets.service;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.repository.PetDAO;

public class PetServiceImpl implements PetService {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());
	
	@Autowired 
	private PetDAO petDAO;
	
	@Override
	public void add(Pet pet) {
		log.info("Pet added successfully");
		try {
			petDAO.create(pet);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
