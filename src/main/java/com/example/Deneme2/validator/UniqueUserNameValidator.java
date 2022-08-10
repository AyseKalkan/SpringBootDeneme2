package com.example.Deneme2.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.example.Deneme2.repository.UserRepository;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public final class UniqueUserNameValidator implements ConstraintValidator<UniqueUserName, String> {

	
	private final UserRepository userRepository;
	
	@Override
	public boolean isValid(String username, ConstraintValidatorContext context) {
		
		return !userRepository.existsUserByUsername(username);
	}

}
