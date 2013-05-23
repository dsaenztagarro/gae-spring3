package com.davlanca.pets.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.User;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.Query;

@Component
public class UserDAOImpl implements UserDAO {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());

	@Autowired
	private ObjectifyFactory objectifyFactory;

	public UserDAOImpl() {
	}

	public UserDAOImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}
	
	@Override
	public void create(User user) throws Exception {
		if (user != null) {
			Objectify ofy = objectifyFactory.begin();
			ofy.put(user);
		} else {
			throw new Exception("You can't create a null user");
		}
	}

	@Override
	public boolean update(User user) {

		if (user == null)
			return false;

		Objectify ofy = objectifyFactory.begin();

		boolean thisAccountAlreadyExist = ofy.query(User.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(user);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(User user) {
		Objectify ofy = objectifyFactory.begin();
		ofy.delete(user);
		return true;
	}

	@Override
    public List<User> findBy(HashMap<String,Object> propList) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<User> q = ofy.query(User.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public User getByProperty(String propName, Object propValue) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<User> q = ofy.query(User.class);
    	q.filter(propName, propValue);

    	User obj = q.get();
    	return obj;
    }
}