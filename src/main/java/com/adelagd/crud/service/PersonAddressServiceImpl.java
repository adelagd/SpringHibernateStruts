package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Address;
import com.adelagd.crud.domain.Person;

public class PersonAddressServiceImpl implements PersonAddressService {

	private PersonRepository personRepositoy;
	private AddressRepository addressRepository;
	
	public List<Address> list() {
		
		return addressRepository.list();
	}

	public List<Address> listByPerson(Long idPerson) {
		
						
		return addressRepository.listByPerson(idPerson);
	}
	
	public void add(Address address) {
		
		
		
	}

	public Address load(Long idAddress) {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Address address) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Long idAddress) {
		// TODO Auto-generated method stub
		
	}


	

}
