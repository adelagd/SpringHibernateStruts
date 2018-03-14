package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Phone;

public interface PhoneRepository {

	public List<Phone> list();
	
	public void add(Phone phone);
	
	public Phone load(Long idPhone);
	
	public void update(Phone phone);
	
	public void delete(Long idPhone);
}
