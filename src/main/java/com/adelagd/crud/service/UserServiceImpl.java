package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.User;

public class UserServiceImpl implements UserRepository{
	
	private UserRepository userRepository;

	public List<User> list() {
		
		return userRepository.list();
	}

	public User load(Long idUser) {
		
		return userRepository.load(idUser);
	}

	public void add(User user) {

		userRepository.add(user);
		
	}

	public void update(User user) {
		
		userRepository.update(user);
		
	}

	public void delete(Long idUser) {
		
		userRepository.delete(idUser);
		
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	
	

}
