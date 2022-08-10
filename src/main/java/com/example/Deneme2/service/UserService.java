package com.example.Deneme2.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.example.Deneme2.dto.UserCreateDTO;
import com.example.Deneme2.dto.UserUpdateDTO;
import com.example.Deneme2.dto.UserViewDTO;


public interface UserService {
	UserViewDTO getUserById(Long id);
	
	List<UserViewDTO> getUsers();
	
	UserViewDTO createUser(UserCreateDTO userCreateDTO);

	UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO);

	void deleteUser(Long id);

	List<UserViewDTO> slice(Pageable pageable);

	
}
