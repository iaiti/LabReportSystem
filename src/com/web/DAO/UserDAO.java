package com.web.DAO;

import java.io.Serializable;
import java.util.List;



public interface UserDAO {

	//添加
	public void save(Object o);
	//根据ID号查找
	public Object getById(Class clazz,Serializable id);
	//根据查询条件查询和角色o查询 service层一般不写sql语句  逻辑关系好看 根据o的类型指定相关的sql 
	public List getResult(Object o,Object []params);
	//得到所有结果
	public List findAll(String hql);
	//更新
	public void update(Object obj);
	//删除
	public void delete(Object obj);
}
