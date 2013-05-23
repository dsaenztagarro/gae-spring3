package com.davlanca.pets.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.model.User;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.Query;

@Component
public class PetDAOImpl implements PetDAO {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());

	@Autowired
	private ObjectifyFactory objectifyFactory;

	public PetDAOImpl() {
	}

	public PetDAOImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}

	@Override
	public void create(Pet pet) throws Exception {
		if (pet != null) {
			Objectify ofy = objectifyFactory.begin();
			ofy.put(pet);
		} else {
			throw new Exception("You can't create a null pet");
		}
	}

	@Override
	public boolean update(Pet pet) {

		if (pet == null)
			return false;

		Objectify ofy = objectifyFactory.begin();

		boolean thisAccountAlreadyExist = ofy.query(Pet.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(pet);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(Pet pet) {
		Objectify ofy = objectifyFactory.begin();
		ofy.delete(pet);
		return true;
	}

	@Override
	public List<Pet> findAll() {
		Objectify ofy = objectifyFactory.begin();

		Query<Pet> q = ofy.query(Pet.class);
		ArrayList<Pet> pets = (ArrayList<Pet>) q.list();

		return pets;
	}
	
	@Override
    public List<Pet> findBy(HashMap<String,Object> propList) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<Pet> q = ofy.query(Pet.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public Pet getByProperty(String propName, Object propValue) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<Pet> q = ofy.query(Pet.class);
    	q.filter(propName, propValue);

    	Pet obj = q.get();
    	return obj;
    }
	
}