package com.web.DAO.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.web.DAO.StudentDAO;
import com.web.DAO.UserDAO;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.util.Page;

public class StudentDAOImpl extends HibernateDaoSupport implements StudentDAO {
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.StudentDAO#Studentlist()
	 */
	public List<Student> studentlist(final Page page) {
		List<Student> list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					public Object doInHibernate(Session session) throws HibernateException,
							SQLException {
						// TODO Auto-generated method stub
						String hql = "from Student student order by student.loginid";
						Query query = session.createQuery(hql);
						query.setMaxResults(page.getEveryPage());
						query.setFirstResult(page.getBeginPage());
						//System.out.println(page.getBeginPage());
						return query.list();
					}
				}
				);
		return list;
	}
	
	public List<Student> studentListAll(){
		String hql= "from Student student ";
		return this.getHibernateTemplate().find(hql);
	}
	public void studentdelete(int id){
		Student s = (Student) this.getHibernateTemplate().get(Student.class,id);
		this.getHibernateTemplate().delete(s);
	}
	
	public int studentcount(){
		String hql = "select count(*) from Student student";
		List list = (List)this.getHibernateTemplate().find(hql);
		return ((Long)list.get(0)).intValue();
	}
	
	public Student studentById(int id){
		return (Student) this.getHibernateTemplate().get(Student.class, id);
	}

	public void studentUpdate(Student student) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(student);
	}
}
