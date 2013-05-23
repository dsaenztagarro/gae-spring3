package com.davlanca.pets.repository;

import java.util.List;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.model.User;

public interface PetDAO extends GenericDAO<Pet> {

	public List<Pet> findAll();
}
