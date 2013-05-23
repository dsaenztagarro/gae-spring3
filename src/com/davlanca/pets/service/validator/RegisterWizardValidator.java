package com.davlanca.pets.service.validator;

import java.util.ArrayList;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.davlanca.pets.model.Pet;
import com.davlanca.pets.model.User;
import com.davlanca.pets.service.dto.RegisterWizardForm;

public class RegisterWizardValidator implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return RegisterWizardForm.class.isAssignableFrom(clazz);
	}

	//validate page 1, userName
	public void validatePage1Form(Object target, Errors errors) {
		RegisterWizardForm registerWizardForm = (RegisterWizardForm)target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pet.name",
		        "pet.name", "Field name required");
		Pet pet = registerWizardForm.getPet();
	}
 
	//validate page 2, password
	public void validatePage2Form(Object target, Errors errors) {
		RegisterWizardForm registerWizardForm = (RegisterWizardForm)target;
		User user = registerWizardForm.getUser();
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "user.password",
			"required.password", "Field password is required.");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "retypePassword",
				"required.password", "Field retype password name is required.");
		
		if (user.getLogin().length() < 5) {
			errors.rejectValue("pet.name", "pet-name-too-short");
		}
		
	}
 
	//validate page 3, remark
	public void validatePage3Form(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "remark",
			"required.remark", "Field name is required.");
	}

	//validate page 3, remark
	public void validatePage4Form(Object target, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "remark",
			"required.remark", "Field name is required.");
	}
	
	@Override
	public void validate(Object target, Errors errors) {
		RegisterWizardForm registerForm = (RegisterWizardForm) target;
		//passwordValidation(errors, user);
	}

}
