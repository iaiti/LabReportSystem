package com.web.DAO;

import java.util.List;

import com.web.bean.Student;
import com.web.util.Page;

public interface StudentDAO {
	//学生数
	int studentcount();
	void studentdelete(int id);
	
	//根据页数的学生列表
	List<Student> studentlist(Page page);
	//所有学生列表
	List<Student> studentListAll();
	//具体的学生
	Student studentById(int id);
	void studentUpdate(Student student);
}