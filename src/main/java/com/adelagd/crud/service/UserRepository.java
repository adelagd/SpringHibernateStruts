package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.User;

public interface UserRepository {
	
	public List<User> list();
	
	public User load(Long idUser);
	
	public void add(User user);
	
	public void update(User user);
	
	public void delete(Long idUser);

}
