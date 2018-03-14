package com.adelagd.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.adelagd.crud.domain.Address;
import com.adelagd.crud.domain.Person;

public class AddressRepositoryImpl extends HibernateDaoSupport implements AddressRepository{

	public List<Address> list() {
		
		final String query="Select a from address";
		return (List<Address>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}
	
	public List<Address> listByPerson(Long idPerson){
		
		final String query="Select a from address where a="+idPerson;
		return (List<Address>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
		
	}

	public void add(Address address) {

		getHibernateTemplate().save(address);
		
	}

	public Address load(Long idAddress) {
		
		return getHibernateTemplate().load(Address.class, idAddress);
	}

	public void update(Address address) {

		getHibernateTemplate().update(address);
		
	}

	public void delete(Long idAddress) {

		getHibernateTemplate().delete(idAddress);
		
	}
	
	

}
