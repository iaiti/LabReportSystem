package com.web.service;

import java.util.List;

import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.util.Page;

public interface ManagerService {

	//根据分页拿到两者
	List<Teacher> teacher_list(Page page);
	List<Student> student_list(Page page);
	
	void studentdelete(int id);
	void teacherdelete(int id);
	
	//获取数据库两者的数目
	int teachercount();
	int studentcount();
	
	//根据id拿到各自的对象
	Student studentById(int id);
	Teacher teacherById(int id);
	Manager managerById(int id);
	
	void studentUpdate(Student student);
	void teacherUpdate(Teacher teacher);
	void managerUpdate(Manager manager);
	
	List<Student> student_listAll();

}