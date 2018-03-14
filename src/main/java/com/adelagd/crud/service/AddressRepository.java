package com.adelagd.crud.service;

import java.util.List;

import com.adelagd.crud.domain.Address;

public interface AddressRepository {
	
	public List<Address> list();
	
	public List<Address> listByPerson(Long idPerson);
	
	public void add(Address address);
	
	public Address load(Long idAddress);
	
	public void update(Address address);
	
	public void delete(Long idAddress);

}
