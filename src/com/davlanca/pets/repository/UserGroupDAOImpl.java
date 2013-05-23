package com.davlanca.pets.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserGroup;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.Query;

@Component
public class UserGroupDAOImpl implements UserGroupDAO {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());

	@Autowired
	private ObjectifyFactory objectifyFactory;

	public UserGroupDAOImpl() {
	}

	public UserGroupDAOImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}
	
	@Override
	public void create(UserGroup userGroup) throws Exception {
		if (userGroup != null) {
			Objectify ofy = objectifyFactory.begin();
			ofy.put(userGroup);
		} else {
			throw new Exception("You can't create a null userGroup");
		}
	}

	@Override
	public boolean update(UserGroup userGroup) {

		if (userGroup == null)
			return false;

		Objectify ofy = objectifyFactory.begin();

		boolean thisAccountAlreadyExist = ofy.query(User.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(userGroup);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(UserGroup userGroup) {
		Objectify ofy = objectifyFactory.begin();
		ofy.delete(userGroup);
		return true;
	}

	@Override
    public List<UserGroup> findBy(HashMap<String,Object> propList) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<UserGroup> q = ofy.query(UserGroup.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public UserGroup getByProperty(String propName, Object propValue) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<UserGroup> q = ofy.query(UserGroup.class);
    	q.filter(propName, propValue);

    	UserGroup obj = q.get();
    	return obj;
    }
}