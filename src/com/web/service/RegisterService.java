package com.web.service;

import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;

public interface RegisterService {

	void student_save(Student student);

	void teacher_save(Teacher teacher);
	
}