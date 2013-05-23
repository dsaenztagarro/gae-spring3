package com.davlanca.pets.service;

import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.mvc.AbstractController;

import com.davlanca.pets.model.GroupAuthority;
import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserGroup;
import com.davlanca.pets.repository.GroupAuthorityDAO;
import com.davlanca.pets.repository.UserDAO;
import com.davlanca.pets.repository.UserGroupDAO;

public class UserServiceImpl implements UserService {

	private static final Logger log = Logger.getLogger(AbstractController.class.getName());
	
	@Autowired 
	private UserDAO userDAO;
	@Autowired
	private UserGroupDAO userGroupDAO;
	@Autowired
	private GroupAuthorityDAO groupAuthorityDAO;	
	
	public void addUser(User user) {
		log.info("User added successfully");
		try {
			userDAO.create(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void addUserGroup(UserGroup userGroup) {
		log.info("UserGroup added successfully");
		try {
			userGroupDAO.create(userGroup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public List<GroupAuthority>getGroupAuthorityBy(HashMap<String,Object> propList) {
		List<GroupAuthority> list = null;
		try {
			list = groupAuthorityDAO.findBy(propList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<User> getUserBy(HashMap<String,Object> propList) {
		List<User> list = null;
		try {
			list = userDAO.findBy(propList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public User getUserByUsername(String username) {
		User user = null;
		try {
			user = userDAO.getByProperty("login", username);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return user;		
	}
	
	public List<UserGroup> getUserGroupBy(Long userId) {
		log.info("UserGroup removed successfully");
		List<UserGroup> list = null;
		try {
			HashMap<String,Object> propList = new HashMap<String,Object>();
			propList.put("userId", userId);
			list = userGroupDAO.findBy(propList);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public void removeUser(User user) {
		log.info("User removed successfully");
		try {
			userDAO.remove(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void removeUserGroup(UserGroup userGroup) {
		log.info("UserGroup removed successfully");
		try {
			userGroupDAO.remove(userGroup);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
