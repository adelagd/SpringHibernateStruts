package com.adelagd.crud.web;

import java.util.List;

import com.adelagd.crud.domain.Person;
import com.adelagd.crud.service.PersonService;
import com.opensymphony.xwork2.ActionSupport;

public class PersonAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private List<Person> persons;
	private Person person;
	private PersonService personService;
	
	public String listPersons() throws Exception{
		
		persons= personService.list();
		return SUCCESS;
	}
	
	public String newPerson() throws Exception{
		
		if((person != null)&&(person.getIdPerson()!=null)) {
			person = personService.load(person.getIdPerson());
		}
		return SUCCESS;
	}
	
	public String savePerson() throws Exception{
		if(person.getIdPerson() == null) {
			personService.add(person);
		}else {
			personService.update(person);
		}
		return SUCCESS;
	}
	
	public String deletePerson() throws Exception{
		
		personService.delete(person.getIdPerson());
		return SUCCESS;
	}

	public List<Person> getPersons() {
		return persons;
	}

	public void setPersons(List<Person> persons) {
		this.persons = persons;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
	
	
	
	
	
	

}
