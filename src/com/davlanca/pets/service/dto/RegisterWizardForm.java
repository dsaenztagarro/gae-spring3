package com.davlanca.pets.service.dto;

import java.util.ArrayList;
import java.util.List;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.model.User;

public class RegisterWizardForm {

	private Pet pet;
	private User user;
	private String retypePassword;
	
	public RegisterWizardForm() {
		pet = new Pet();
		user = new User();
	}
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRetypePassword() {
		return retypePassword;
	}

	public void setRetypePassword(String retypePassword) {
		this.retypePassword = retypePassword;
	}	
	
}
