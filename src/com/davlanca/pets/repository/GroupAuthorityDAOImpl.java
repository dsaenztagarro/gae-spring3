package com.davlanca.pets.repository;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.GroupAuthority;
import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.Query;

@Component
public class GroupAuthorityDAOImpl implements GroupAuthorityDAO {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());

	@Autowired
	private ObjectifyFactory objectifyFactory;

	public GroupAuthorityDAOImpl() {
	}

	public GroupAuthorityDAOImpl(ObjectifyFactory objectifyFactory) {
		this.objectifyFactory = objectifyFactory;
	}
	
	@Override
	public void create(GroupAuthority groupAuthority) throws Exception {
		if (groupAuthority != null) {
			Objectify ofy = objectifyFactory.begin();
			ofy.put(groupAuthority);
		} else {
			throw new Exception("You can't create a null groupAuthority");
		}
	}

	@Override
	public boolean update(GroupAuthority groupAuthority) {

		if (groupAuthority == null)
			return false;

		Objectify ofy = objectifyFactory.begin();

		boolean thisAccountAlreadyExist = ofy.query(GroupAuthority.class).get() != null;

		if (thisAccountAlreadyExist) {
			ofy.put(groupAuthority);
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean remove(GroupAuthority groupAuthority) {
		Objectify ofy = objectifyFactory.begin();
		ofy.delete(groupAuthority);
		return true;
	}

	@Override
    public List<GroupAuthority> findBy(HashMap<String,Object> propList) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<GroupAuthority> q = ofy.query(GroupAuthority.class);
    	Iterator<String> it = propList.keySet().iterator();
    	while (it.hasNext()) {
    		String propName = it.next();
    		Object propValue = propList.get(propName);
    		
    		q.filter(propName, propValue);
    	}

    	return q.list();
    }
	
	@Override
    public GroupAuthority getByProperty(String propName, Object propValue) {
    	Objectify ofy = objectifyFactory.begin();
    	
    	Query<GroupAuthority> q = ofy.query(GroupAuthority.class);
    	q.filter(propName, propValue);

    	GroupAuthority obj = q.get();
    	return obj;
    }
}