package com.itcast.ssh.b_spring_hibernate.way2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;
	static{
		Configuration context = new Configuration();
		Configuration configure = context.configure("com/itcast/ssh/b_spring_hibernate/test/hibernate.cfg.xml");
		//Configuration configure = context.configure();
		factory = configure.buildSessionFactory();
	}
	
	public static Session openSession(){
		return factory.openSession();
	}
	
	public static Session getCurrentSession(){
		return factory.getCurrentSession();
	}
	
}
