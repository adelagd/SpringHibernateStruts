package com.adelagd.crud.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.adelagd.crud.domain.Address;


@Transactional(readOnly = true)
public interface PersonAddressService {
	
	
	public List<Address> list();
	
	public List<Address> listByPerson(Long idPerson);
	
	@Transactional(readOnly = false)
	public void add(Address address);
	
	public Address load(Long idAddress);
	
	@Transactional(readOnly = false)
	public void update(Address address);
	
	@Transactional(readOnly = false)
	public void delete(Long idAddress);
	
}
