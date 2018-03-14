package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Person;

public class PersonServiceImpl implements PersonService{

	private PersonRepository personRepository;

	public List<Person> list() {
		
		return personRepository.list();
	}

	//Add a new Person
	public void add(Person person) {

		personRepository.add(person);
		
	}

	public Person load(Long idPerson) {
		
		return personRepository.load(idPerson);
	}

	public void update(Person person) {

		personRepository.update(person);
		
	}

	public void delete(Long idPerson) {

		personRepository.delete(idPerson);
		
	}
	
	

}
