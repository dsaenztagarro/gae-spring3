package com.davlanca.pets.service.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

import com.davlanca.pets.service.dto.UserAdministrationForm;

public class UserAdministrationCommonsValidations {

	public UserAdministrationCommonsValidations() {
		super();
	}

	protected void commonValidations(Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstName", "error.firstName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastName", "error.lastName.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "email", "error.email.required");
	}

	protected void passwordValidation(Errors errors, UserAdministrationForm user) {
		ValidationUtils.rejectIfEmpty(errors, "password", "error.password.required");
		ValidationUtils.rejectIfEmpty(errors, "retypePassword", "error.password.required");

		if (!user.getPassword().equals(user.getRetypePassword())) {
			errors.rejectValue("password", "error.password.matches");
			errors.rejectValue("retypePassword", "error.password.matches");
		}
	}

}
