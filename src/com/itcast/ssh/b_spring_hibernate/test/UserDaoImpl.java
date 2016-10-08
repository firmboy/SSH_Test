package com.itcast.ssh.b_spring_hibernate.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDaoImpl implements UserDao {

	public void save(User user) {
		Session session = HibernateUtils.getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}

}
