package com.example.Deneme2.dto;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.example.Deneme2.validator.UniqueUserName;

import lombok.Data;

@Data
public class UserCreateDTO {

	
	@NotNull(message = "{Deneme2.constraints.firstname.NotNull.message}")
	@Size(min = 2, max = 35, message = "{Deneme2.constraints.firstname.Size.message}")
	private String firstName;
	
	@NotNull(message = "{Deneme2.constraints.lastname.NotNull.message}")
	@Size(min = 2, max = 40, message = "{Deneme2.constraints.lastname.Size.message}")
	private String lastName;
	
	@UniqueUserName
	@NotNull(message = "{ Deneme2.constraints.username.NotNull.message}")
	@Size(min = 4, max = 20, message = "{Deneme2.constraints.username.Size.message}")
	private String userName;

}
