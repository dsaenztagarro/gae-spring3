/**
 * 
 */
package com.davlanca.pets.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.model.User;
import com.davlanca.pets.model.UserPet;
import com.davlanca.pets.service.PetService;
import com.davlanca.pets.service.UserPetService;
import com.davlanca.pets.service.UserService;
import com.davlanca.pets.service.dto.RegisterWizardForm;
import com.davlanca.pets.service.validator.RegisterWizardValidator;

/**
 * @author davlanca
 * 
 */
@SuppressWarnings("deprecation")
public class RegisterWizardController extends AbstractWizardFormController {

	private String registerWizardSuccessView;
	
	@Autowired
	private UserService userService;
	@Autowired
	private PetService petService;
	@Autowired
	private UserPetService userPetService;

	private final String PET_ID = "id";

	private final String PARAM_MSG = "message";

	public RegisterWizardController() {
		setCommandClass(RegisterWizardForm.class);
		setCommandName("registerWizardForm");
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public void setPetService(PetService petService) {
		this.petService = petService;
	}
	
	public void setUserPetService(UserPetService userPetService) {
		this.userPetService = userPetService;
	}

	@Override
	protected Object formBackingObject(HttpServletRequest request)
			throws Exception {
		int petId = ServletRequestUtils.getIntParameter(request, PET_ID, -1);
		if (petId > 0) {
			System.out.println("Searching for pet..");
			return null;
		} else {
			return super.formBackingObject(request);
		}
	}

	@Override
	protected void validatePage(Object command, Errors errors, int page) {

	}

	protected void postProcessPage(HttpServletRequest request, Object command,
			Errors errors, int page) throws Exception {
		RegisterWizardForm registerWizardForm = (RegisterWizardForm) command;
		RegisterWizardValidator registerWizardValidator = (RegisterWizardValidator) getValidator();
		switch (page) {
		case 0:
			registerWizardValidator.validatePage1Form(
					registerWizardForm, errors);
			break;
		case 1:
			registerWizardValidator.validatePage2Form(
					registerWizardForm, errors);
			break;
		}
	}

	protected ModelAndView processFinish(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {

		RegisterWizardForm registerWizardForm = (RegisterWizardForm)command;

		User user = registerWizardForm.getUser();
		Pet pet = registerWizardForm.getPet();
		userService.addUser(user);
		petService.add(pet);
		
		UserPet userPet = new UserPet();
		userPet.setUserId(user.getUserId());
		userPet.setPetId(pet.getPetId());		
		userPetService.add(userPet);

		return new ModelAndView(registerWizardSuccessView, "user", null);
	}

	@Override
	protected ModelAndView processCancel(HttpServletRequest request,
			HttpServletResponse response, Object command, BindException errors)
			throws Exception {
		return new ModelAndView("index");
	}

	public void setRegisterWizardSuccessView(String registerWizardSuccessView) {
		this.registerWizardSuccessView = registerWizardSuccessView;
	}
	
}
