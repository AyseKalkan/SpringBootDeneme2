package com.example.Deneme2.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.example.Deneme2.dto.UserCreateDTO;
import com.example.Deneme2.dto.UserUpdateDTO;
import com.example.Deneme2.dto.UserViewDTO;
import com.example.Deneme2.exception.NotFoundException;
import com.example.Deneme2.model.User;
import com.example.Deneme2.repository.UserRepository;

import lombok.RequiredArgsConstructor;
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
	
	
	private final UserRepository userRepository;
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public UserViewDTO getUserById(Long id) {
		final User user = userRepository.findById(id).orElseThrow(() ->  new NotFoundException("Not Found Exception"));
		return UserViewDTO.of(user);
	}
	
	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public UserViewDTO createUser(UserCreateDTO userCreateDTO) {
		final User user = userRepository.save(new User(userCreateDTO.getUserName(), userCreateDTO.getFirstName(), userCreateDTO.getLastName()));
		
		return UserViewDTO.of(user);
	}
	@Override
	@Transactional
	public List<UserViewDTO> getUsers() {
		
		return userRepository.findAll().stream().map(UserViewDTO::of).collect(Collectors.toList());
		
	}

	@Override
	@Transactional
	public UserViewDTO updateUser(Long id, UserUpdateDTO userUpdateDTO) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		user.setFirstName(userUpdateDTO.getFirstName());
		user.setLastName(userUpdateDTO.getLastName());
		final User updatedUser =  userRepository.save(user);
		return UserViewDTO.of(updatedUser);
	}

	@Override
	@Transactional
	public void deleteUser(Long id) {
		final User user = userRepository.findById(id).orElseThrow(() -> new NotFoundException("Not Found Exception"));
		userRepository.deleteById(user.getIdLong());
		
	}

	@Override
	@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
	public List<UserViewDTO> slice(Pageable pageable) {
		
		return userRepository.findAll(pageable).stream().map(UserViewDTO::of).collect(Collectors.toList());
	}
	 

}
