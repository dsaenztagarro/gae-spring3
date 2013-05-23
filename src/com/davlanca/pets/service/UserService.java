package com.davlanca.pets.service;

import java.util.HashMap;
import java.util.List;

import com.davlanca.pets.model.GroupAuthority;
import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserGroup;


public interface UserService {

	public void addUser(User user);
	public void addUserGroup(UserGroup userGroup);
	public List<GroupAuthority>getGroupAuthorityBy(HashMap<String,Object> propList);
	public List<User> getUserBy(HashMap<String,Object> propList);
	public User getUserByUsername(String username);
	public List<UserGroup> getUserGroupBy(Long userId);
	public void removeUser(User user);
	public void removeUserGroup(UserGroup userGroup);
	
}
