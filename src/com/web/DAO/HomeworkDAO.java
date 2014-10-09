package com.web.DAO;

import java.sql.Timestamp;
import java.util.List;

import com.web.bean.Homework;

public interface HomeworkDAO {

	void save(Homework homework);
	void update(Homework homework);
	void delete(Homework homework);
	
	//所有作业
	List<Homework> listall();

	Homework findById(int id);
	
	//根据老师id拿到的作业列表
	List<Homework> homeworkListById(int id);
	
	//学生完成的作业列表
	List<Homework>studenthomeworkDonelist(int studentid);
	
	//所有老师发布的作业列表
    List<Homework> homeworkListAll(); 
    
    //根据homeworkid拿到具体作业
    Homework homeworkgetById(int id);
    
    //老师批改作业时 通过该 作业的发布时间和老师id 拿到学生已经做过的作业列表
    List<Homework> homeworkDoneList(int id,Timestamp date);
    
    //学生单独的作业
    Homework studenthomeworkDone(int studentid,int homeworkid);
    
    /* List<Homework> homeworkListStudent(int id);*/
}