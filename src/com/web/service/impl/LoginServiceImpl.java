package com.web.service.impl;

import java.io.Serializable;
import java.util.List;

import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.LoginService;


public class LoginServiceImpl implements LoginService {

	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public Manager manager_check(Manager manager) {
		Object params[] = {manager.getLoginid(),manager.getPassword()};
		List<Manager> list = userDAO.getResult(manager,params);
		if(list.size() == 1){
			return list.get(0);
		}else{
		   return null;
		}
	}

	public Student student_check(Student student) {
		Object params[] = {student.getLoginid(),student.getPassword()};
		//System.out.println(student.getId());
		List<Student> list = userDAO.getResult(student,params);
		if(list.size() == 1){
			return list.get(0);
		}else{
		   return null;
		}
	}

	public Teacher teacher_check(Teacher teacher) {
		Object params[] = {teacher.getLoginid(),teacher.getPassword()};
		List<Teacher> list = userDAO.getResult(teacher,params);
		if(list.size() == 1){
			return list.get(0);
		}else{
		   return null;
		}
	}

}
