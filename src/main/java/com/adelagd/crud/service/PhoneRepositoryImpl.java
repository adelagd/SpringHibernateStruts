package com.adelagd.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import com.adelagd.crud.domain.Phone;

public class PhoneRepositoryImpl extends HibernateDaoSupport implements PhoneRepository {

	public List<Phone> list() {
		
		final String query="Select p from phone";
		
		return (List<Phone>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
	}

	public void add(Phone phone) {

		getHibernateTemplate().save(phone);
		
	}

	public Phone load(Long idPhone) {
		
		return getHibernateTemplate().load(Phone.class, idPhone);
	}

	public void update(Phone phone) {

		getHibernateTemplate().update(phone);
		
	}

	public void delete(Long idPhone) {

		getHibernateTemplate().delete(idPhone);
		
	}
	
	

}
