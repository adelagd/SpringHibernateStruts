package com.adelagd.crud.service;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.adelagd.crud.domain.User;


public class UserRepositoryImpl extends HibernateDaoSupport implements UserRepository {

	public List<User> list() {

		final String query ="Select u from User";
		
		return (List<User>) getHibernateTemplate().executeFind(new HibernateCallback() {
            public Object doInHibernate(Session session) throws HibernateException, SQLException {
                return session.createQuery(query).list();
            }
		});
		
		
	}

	public User load(Long idUser) {
		 
		return getHibernateTemplate().get(User.class, "idUser");
	}

	public void add(User user) {

		getHibernateTemplate().save(user);
		
	}

	public void update(User user) {

		getHibernateTemplate().update(user);
		
	}

	public void delete(Long idUser) {

		getHibernateTemplate().delete(idUser);
		
	}
	

}
