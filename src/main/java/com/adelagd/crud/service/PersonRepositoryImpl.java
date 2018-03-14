package com.adelagd.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.adelagd.crud.domain.Person;


public class PersonRepositoryImpl extends HibernateDaoSupport implements PersonRepository{

	public List<Person> list() {

		final String query="from Person";
		return (List<Person>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public Person load(Long idPerson) {
		
		return getHibernateTemplate().load(Person.class, idPerson);
	}

	public void add(Person person) {

		getHibernateTemplate().save(person);
		
	}

	public void update(Person person) {

		getHibernateTemplate().update(person);
		
	}

	public void delete(Long idPerson) {

		getHibernateTemplate().delete(idPerson);
		
	}
	
	

}
