package com.adelagd.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adelagd.crud.domain.Person;

@Transactional(readOnly = true)
public interface PersonService {
	
	public List<Person> list();
	
	@Transactional(readOnly = false)
	public void add(Person person);
	
	public Person load(Long idPerson);
	
	@Transactional(readOnly = false)
	public void update(Person person);
	
	@Transactional(readOnly = false)
	public void delete(Long idPerson);

}
