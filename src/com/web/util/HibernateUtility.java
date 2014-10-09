package com.web.util;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author admin
 *sessionfactory的获取
 */
public class HibernateUtility {
	private static SessionFactory sf;
	
	static{
	//	Configuration configuration = new Configuration();
		//configuration.configure();
	//	ServiceRegistry serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	//	sf = configuration.buildSessionFactory(serviceRegistry);
		// the old get sessionfactory method
		   sf = new Configuration().configure().buildSessionFactory();
	}
	public SessionFactory getSessionFactory(){
		return sf;
	}
}
