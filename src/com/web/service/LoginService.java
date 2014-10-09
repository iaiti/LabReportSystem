package com.web.service;

import java.util.List;

import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;

public interface LoginService {
	//登陆后验证该对象在数据库是否存在
	
	public Student student_check(Student student);
	public Teacher teacher_check(Teacher teacher);
	public Manager manager_check(Manager manager);
	
}
