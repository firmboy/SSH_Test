package com.itcast.ssh.b_spring_hibernate.way2;

import javax.annotation.Resource;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

public class UserDaoImpl extends HibernateDaoSupport implements UserDao {
	
	/*@Resource(name="hibernateTemplate")
	private HibernateTemplate hibernateTemplate;*/
	
	public void save1(User user) {
		Session session = this.getHibernateTemplate().getSessionFactory().getCurrentSession();
		Transaction tx = session.beginTransaction();
		session.save(user);
		tx.commit();
	}
	
	public void save(User user){
		this.getHibernateTemplate().save(user);
	}

}
