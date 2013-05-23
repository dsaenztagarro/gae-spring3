package com.davlanca.pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserPet {
	
	private Long petId;	
	private Long userId;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userPetId;

	public Long getPetId() {
		return petId;
	}
	
	public Long getUserId() {
		return userId;
	}

	public Long getUserPetId() {
		return userPetId;
	}
	
	public void setPetId(Long petId) {
		this.petId = petId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public void setUserPetId(Long userPetId) {
		this.userPetId = userPetId;
	}

}
