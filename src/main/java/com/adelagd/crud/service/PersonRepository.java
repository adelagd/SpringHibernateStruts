package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Person;

public interface PersonRepository {
	
	public List<Person> list();
	
	public Person load(Long idPerson);
	
	public void add(Person person);
	
	public void update(Person person);
	
	public void delete(Long idPerson);

}
