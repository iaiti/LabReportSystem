package com.web.DAO.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.web.DAO.ManagerDAO;
import com.web.DAO.StudentDAO;
import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.util.Page;

public class ManagerDAOImpl extends HibernateDaoSupport implements ManagerDAO {

	public Manager managerById(int id) {
		// TODO Auto-generated method stub
		return (Manager)this.getHibernateTemplate().get(Manager.class, id);
	}

	public void managerUpdate(Manager manager) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(manager);
	}
}
