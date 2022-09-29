package com.bl.user.registration.lambda;

@FunctionalInterface
public interface IUserEntryValidator {
	public boolean validate (String input) throws UserValidationException;
}

