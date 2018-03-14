package com.adelagd.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.adelagd.crud.domain.Email;


public class EmailRepositoryImpl extends HibernateDaoSupport implements EmailRepository {

	public List<Email> list() {

		final String query ="Select e from Email";
		return (List<Email>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	
	}

	public void add(Email email) {

		getHibernateTemplate().save(email);
		
	}

	public Email load(Long idEmail) {
		
		return getHibernateTemplate().load(Email.class, idEmail);
	}

	public void update(Email email) {

		getHibernateTemplate().update(email);
		
	}

	public void delete(Long idEmail) {

		getHibernateTemplate().delete(idEmail);
		
	}
	
	

}
