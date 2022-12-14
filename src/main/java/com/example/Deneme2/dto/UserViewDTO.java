package com.example.Deneme2.dto;
import java.io.Serializable;

import com.example.Deneme2.model.User;

import lombok.Getter;
@Getter
public final class UserViewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private final String firstName;
	private final String lastName;
	
	private UserViewDTO(String firstName, String lastName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public static UserViewDTO of(User user) {
		return new UserViewDTO(user.getFirstName(),user.getLastName());
	}

}
