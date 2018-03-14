package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Email;

public interface EmailRepository {
	
	public List<Email> list();
	
	public void add(Email email);
	
	public Email load(Long idEmail);
	
	public void update(Email email);
	
	public void delete(Long idEmail);

}
