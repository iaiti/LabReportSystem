package com.web.service.impl;

import java.sql.Timestamp;
import java.util.List;

import com.web.DAO.HomeworkDAO;
import com.web.DAO.UserDAO;
import com.web.bean.Homework;
import com.web.service.HomeworkService;

public class HomeworkServiceImpl implements HomeworkService {
	
	private HomeworkDAO homeworkDAO;

	public HomeworkDAO getHomeworkDAO() {
		return homeworkDAO;
	}
	public void setHomeworkDAO(HomeworkDAO homeworkDAO) {
		this.homeworkDAO = homeworkDAO;
	}
	public void homeworkSave(Homework homework){
		homeworkDAO.save(homework);
	}
	public List<Homework> homeworkListAll() {
		return homeworkDAO.homeworkListAll();
	}
	
	public void homeworkDelete(Homework homework){
		homeworkDAO.delete(homework);
	}
	
	public List<Homework> homeworkDoneList(int id,Timestamp date){
		return homeworkDAO.homeworkDoneList(id, date);
	}

	public List<Homework> homeworkListById(int id){
		return homeworkDAO. homeworkListById(id);
	}
	
	public Homework homeworkgetById(int id){
		return homeworkDAO.homeworkgetById(id);
	}
	/* public List<Homework> homeworkListStudent(int id){
		 return homeworkDAO.homeworkListStudent(id);
	 }*/
	 
	 public void homeworkUpdate(Homework homework){
		 homeworkDAO.update(homework);
	 }
	 
	 public Homework studenthomeworkDone(int studentid,int homeworkid){
		return  homeworkDAO.studenthomeworkDone(studentid,homeworkid);
	 }
	 
	 public List<Homework> studenthomeworkDonelist(int studentid){
		 return homeworkDAO.studenthomeworkDonelist(studentid);
	 }
}
