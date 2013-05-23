/**
 * 
 */
package com.davlanca.pets.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.davlanca.pets.model.User;
import com.davlanca.pets.service.UserService;
import com.davlanca.pets.service.dto.UserAdministrationForm;
import com.davlanca.pets.service.validator.UserAdministrationValidator;

/**
 * @author davlanca
 *
 */
@SuppressWarnings("deprecation")
public class UserController extends SimpleFormController {

	private UserService userService;
	
	private final String PARAM_USER_ID = "id";

	public UserController() {
		setCommandClass(UserAdministrationForm.class);
		setCommandName("userAdministrationForm");
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request) throws Exception {
		int userId = ServletRequestUtils.getIntParameter(request, PARAM_USER_ID, -1);
		if (userId>0) {
			User user = new User();
			user.setFirstName("Mercedes");
			user.setLastName("Escribano");
			return user;
		} else {
			return super.formBackingObject(request);
		}
	}

	/* @Override
	protected ModelAndView onSubmit(Object command) throws Exception {
		User user = (User)command;
		userService.add(user);
		return new ModelAndView(this.getSuccessView(),"user",user);
	}*/
	
	@Override
	protected void doSubmitAction(Object command) throws Exception {
		UserAdministrationForm userAdministrationForm = (UserAdministrationForm)command;
		User user = new User();
		user.setFirstName(userAdministrationForm.getFirstName());
		user.setLastName(userAdministrationForm.getLastName());
		userService.addUser(user);
	}
	
	/*@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageAccessor = new MessageSourceAccessor(messageSource);
	}*/	
}
