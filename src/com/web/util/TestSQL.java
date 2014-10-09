package com.web.util;



/**
 * @author admin
 * 
 */
public class TestSQL {
/*
 * 测试作业列表
select * from homework where teacherid = 1 
and studentid = 2 and studentcontent is not null;


 测试老师作业已做
   select  * from  homework where teacherid = 1 
  and publishdate = '2013-11-18 17:00:49.0' and studentcontent 
  is not null order by publishdate desc
  
  hql写不出的东西
  String sql = "select * from homework where studentcontent "
				    			+"is null and title not in(select"
				    			+" title from homework where studentid="+id+")";
						Query query = session.createSQLQuery(sql);
						return query.list();
  
   select  * from homework where publishdate between '2013-11-18 17:00:49' and '2013-11-18 17:00:49';
   select  * from homework where publishdate='2013-11-18 17:00:49.0' and teacherid = 1 and studentcontent is not null
   order by publishdate desc;
 */
}
