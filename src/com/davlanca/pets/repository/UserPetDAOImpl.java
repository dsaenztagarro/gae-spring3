package com.davlanca.pets.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserPet;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.Query;

@Component
public class UserPetDAOImpl implements UserPetDAO {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());

	@Autowired
	private ObjectifyFactory objectifyFactory;

	public UserPetDAOImpl() {
	}

	public UserPetDAOImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}

	@Override
	public void create(UserPet userPet) throws Exception {
		if (userPet != null) {
			Objectify ofy = objectifyFactory.begin();
			ofy.put(userPet);
		} else {
			throw new Exception("You can't create a null userPet");
		}
	}

	@Override
	public boolean update(UserPet userPet) {

		if (userPet == null)
			return false;

		Objectify ofy = objectifyFactory.begin();

		boolean thisAccountAlreadyExist = ofy.query(User.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(userPet);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(UserPet userPet) {
		Objectify ofy = objectifyFactory.begin();
		ofy.delete(userPet);
		return true;
	}
	
	@Override
    public List<UserPet> findBy(HashMap<String,Object> propList) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<UserPet> q = ofy.query(UserPet.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public UserPet getByProperty(String propName, Object propValue) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<UserPet> q = ofy.query(UserPet.class);
    	q.filter(propName, propValue);

    	UserPet obj = q.get();
    	return obj;
    }
	
}