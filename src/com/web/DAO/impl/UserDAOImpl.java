package com.web.DAO.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;


public class UserDAOImpl extends HibernateDaoSupport implements UserDAO{
	
	public void save(Object obj){
		this.getHibernateTemplate().save(obj);		
	}

	public Object getById(Class clazz, Serializable id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().load(clazz, id);
	}

	
	public List getResult(Object o,Object[] params) {
		String hql = "";
		if(o instanceof Student){
			hql = "from Student student where student.loginid=? and student.password=?";
		} else if(o instanceof Teacher){
			hql = "from Teacher teacher where teacher.loginid=? and teacher.password=?";
		} else if(o instanceof Manager){
			 hql = "from Manager manager where manager.loginid=? and manager.password=?";
		}
		return this.getHibernateTemplate().find(hql, params);	
	}

	public void delete(Object obj) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(obj);
	}

	public void update(Object obj) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(obj);
	}

	public List findAll(String hql) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(hql);
	}
}
