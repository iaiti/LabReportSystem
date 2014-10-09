package com.web.service.impl;

import java.util.List;

import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.RegisterService;

public class RegisterServiceImpl implements RegisterService {
	
	private UserDAO userDAO;

	public UserDAO getUserDAO() {
		return userDAO;
	}

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	/* (non-Javadoc)
	 * @see com.web.service.impl.RegisterService#student_save(com.web.bean.Student)
	 */
	public void student_save(Student student){
		userDAO.save(student);
	}
	/* (non-Javadoc)
	 * @see com.web.service.impl.RegisterService#teacher_save(com.web.bean.Teacher)
	 */
	public void teacher_save(Teacher teacher){
		userDAO.save(teacher);
	}
	
	

		
}
