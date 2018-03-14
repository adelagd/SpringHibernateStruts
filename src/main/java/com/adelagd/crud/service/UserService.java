package com.adelagd.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adelagd.crud.domain.User;

@Transactional(readOnly = true)
public interface UserService {

	public List<User> list();
	
	@Transactional(readOnly = false)
	public void add(User user);
	
	public User load(Long idUser);
	
	@Transactional(readOnly = false)
	public void update(User user);
	
	@Transactional(readOnly = false)
	public void delete(Long idUser);
	
	
}
