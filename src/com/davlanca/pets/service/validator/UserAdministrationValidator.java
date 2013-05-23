package com.davlanca.pets.service.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.davlanca.pets.service.dto.UserAdministrationForm;

public class UserAdministrationValidator extends
		UserAdministrationCommonsValidations implements Validator {

	@Override
	public boolean supports(Class clazz) {
		return UserAdministrationForm.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		commonValidations(errors);

		UserAdministrationForm user = (UserAdministrationForm) target;

		passwordValidation(errors, user);
	}

}
