package com.web.DAO.impl;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Iterator;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.web.DAO.HomeworkDAO;
import com.web.bean.Homework;
import com.web.bean.Student;
import com.web.util.Page;

public class HomeworkDAOImpl extends HibernateDaoSupport implements HomeworkDAO  {
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.HomeworkDAO#save(com.web.bean.Homework)
	 */
	public void save(Homework homework){
		 this.getHibernateTemplate().save(homework);
	 }
	
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.HomeworkDAO#listall()
	 */
	public List<Homework> listall(){
		String hql = "from Homework homework order by homework.publishtime";
		return this.getHibernateTemplate().find(hql);
	}
	
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.HomeworkDAO#findById(int)
	 */
	public Homework findById(int id){
		Homework homework = (Homework) this.getHibernateTemplate().get(Homework.class, id);
		return homework;
	}
	
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.HomeworkDAO#delete(int)
	 */
	public void delete(int id){
		Homework homework = (Homework) this.getHibernateTemplate().get(Homework.class, id);
		this.getHibernateTemplate().delete(homework);
	}
	
	/* (non-Javadoc)
	 * @see com.web.DAO.impl.HomeworkDAO#update(com.web.bean.Homework)
	 */
	public void update(Homework homework){
		this.getHibernateTemplate().update(homework);
	}
	
	public List<Homework> homeworkListById(int id){
		String hql = "from Homework homework where homework.teacherid = "+id+" and homework.teachercontent is not null order by homework.publishdate desc";
		return this.getHibernateTemplate().find(hql);
	}
	
	public List<Homework> homeworkDoneList(int id,Timestamp date){
		//System.out.println(date);
		//System.out.println(id);
		String hql = "from Homework homework where homework.publishdate='"+date
				+"' and homework.teacherid = "+id+" and homework.studentcontent "
				+"is not null order by publishdate desc";
		return this.getHibernateTemplate().find(hql);
	}
	
    public List<Homework> homeworkListAll(){
    	String hql = "from Homework homework where homework.studentcontent is null order by homework.publishdate desc";
		return this.getHibernateTemplate().find(hql);
	 }
/*    public List<Homework> homeworkListStudent(int id){
    	String hql = "from Homework homework where homework.studentcontent "
    			+"is null and homework.title not in(select"
    			+" title from Homework.homework where homework.studentid="+id+")";
    	return this.getHibernateTemplate().find(hql);
    }*/
    
    
    /*换一种思路   直接显示全部作业  没做的可以点击完成 做过的就可以点击查看内容*/
 /*   public List<Homework> homeworkListStudent(final int id) {
    	List<Homework> list = this.getHibernateTemplate().executeFind(
				new HibernateCallback() {
					
					public Object doInHibernate(Session session) throws HibernateException,
							SQLException {
						// TODO Auto-generated method stub
						String sql = "select * from homework where studentcontent "
				    			+"is null and title not in(select"
				    			+" title from homework where studentid="+id+")";
						Query query = session.createSQLQuery(sql);
						return query.list();
					}
				}
				);
    Iterator i = list.iterator();
    	while(i.hasNext()){
    		System.out.println("sdf");
    		
    		i.next();
    	}
		return list;
	}*/
    public Homework studenthomeworkDone(int studentid,int homeworkid){
    	//System.out.println(studentid+"DD"+homeworkid);
    	String hql = "from Homework homework where homework.studentid ="+studentid
    			+" and homeworkid = "+homeworkid+"order by publishdate desc";
    	if(this.getHibernateTemplate().find(hql).size() != 0){
    	//	System.out.println("not null");
    		return (Homework) this.getHibernateTemplate().find(hql).get(0);
    	}else{
    		//System.out.println("null");
    		return null;
    	}
    }
    
    //
    public List<Homework>studenthomeworkDonelist(int studentid){
    	String hql = "from Homework homework where homework.studentid ="+studentid
    			+" and homeworkid is not null order by finishdate desc";
    	return this.getHibernateTemplate().find(hql);
    }
    
    public Homework homeworkgetById(int id){
    	return (Homework) this.getHibernateTemplate().get(Homework.class, id);
    }
    
    
    public void delete(Homework homework){
    	this.getHibernateTemplate().delete(homework);
    }
	
}
