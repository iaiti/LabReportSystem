package com.web.service;

import java.sql.Timestamp;
import java.util.List;

import com.web.bean.Homework;

public interface HomeworkService {
	//作业保存
	public void homeworkSave(Homework homework);
	
	//作业列表
	public List<Homework> homeworkListAll();
	
	//根据不同的老师拿到对应的作业列表
	public List<Homework> homeworkListById(int id);
	
	//根据具体的作业id拿到对应的作业
	public Homework homeworkgetById(int id);
	
	/*public List<Homework> homeworkListStudent(int id);*/
	
	public void homeworkUpdate(Homework homework);
	
	public void homeworkDelete(Homework homework);
	
	//通过发布时间及老师id拿到的作业列表
	public List<Homework> homeworkDoneList(int id,Timestamp date);
	
	//具体学生的一门作业
	public Homework studenthomeworkDone(int studentid,int homeworkid);
	
	//学生做过的作业
	public List<Homework> studenthomeworkDonelist(int studentid);
}
