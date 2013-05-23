package com.davlanca.pets.security;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import com.davlanca.pets.controller.MainController;
import com.davlanca.pets.model.GroupAuthority;
import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserGroup;
import com.davlanca.pets.service.UserService;

public class DBAuthenticationProvider implements AuthenticationProvider {
    
	private static final Logger log = Logger.getLogger(MainController.class.getName());
	
	private UserService userService;
 
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String principal = (String)authentication.getPrincipal();
        String credentials = (String)authentication.getCredentials();
        
    	log.info("login: " + principal);
    	log.severe("password: " + credentials);
        
    	HashMap<String, Object> propList = new HashMap<String, Object>();
    	propList.put("login", principal);
    	//propList.put("password", credentials);
    	List<User> userList= userService.getUserBy(propList);
    	System.out.println("userList: " + userList);
    	if (userList!=null && userList.size() >0) {
    		User user = userList.get(0);
    		System.out.println("User: " + user);
    		System.out.println("password!!!: " + user.getPassword());
    		
    		List<UserGroup> userGroupList = userService.getUserGroupBy(user.getUserId());
    		List<GroupAuthority> groupAuthorityList = userService.getGroupAuthorityBy(propList);
    		
    		//Collection<AppRole> authorities = new ArrayList();
    		List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
    		authorities.add(new SimpleGrantedAuthority("user"));
    		//authorities.add(new AppRole(AppRole.SUPERVISOR));
    		return new UsernamePasswordAuthenticationToken(principal, credentials, authorities);	
    	}
    	throw new BadCredentialsException("Username/Password does not match for " + principal);
    }
 
    public boolean supports(Class<? extends Object> authentication) {
        // copied it from AbstractUserDetailsAuthenticationProvider
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }

 
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}