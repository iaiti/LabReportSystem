package com.web.DAO.impl;

import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.web.DAO.TeacherDAO;
import com.web.DAO.UserDAO;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.util.Page;

public class TeacherDAOImpl extends HibernateDaoSupport implements TeacherDAO {
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.TeacherDAO#teacherlist()
	 */
	
	//teacher的分页显示
	public List<Teacher> teacherlist(final Page page) {
		List<Teacher> list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					
					public Object doInHibernate(Session session) throws HibernateException,
							SQLException {
						// TODO Auto-generated method stub
						String hql = "from Teacher teacher order by teacher.loginid";
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

	public void teacherdelete(int id){
			Teacher t = (Teacher) this.getHibernateTemplate().get(Teacher.class,id);
			this.getHibernateTemplate().delete(t);
	}
	
	public int teachercount(){
		String hql = "select count(*) from Teacher teacher";
		List list = (List)this.getHibernateTemplate().find(hql);
		return ((Long)list.get(0)).intValue();
	}
	public Teacher teacherById(int id){
		return (Teacher) this.getHibernateTemplate().get(Teacher.class, id);
	}

	public void teacherupdate(Teacher teacher) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().update(teacher);
	}
	
	
}
