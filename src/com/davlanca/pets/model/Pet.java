package com.davlanca.pets.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pet {

	private int breedId;
	private String name;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long petId;
	
	public int getBreedId() {
		return breedId;
	}

	public String getName() {
		return name;
	}

	public Long getPetId() {
		return petId;
	}
	
	public void setBreedId(int breedId) {
		this.breedId = breedId;
	}	

	public void setName(String name) {
		this.name = name;
	}

	public void setPetId(Long petId) {
		this.petId = petId;
	}

}