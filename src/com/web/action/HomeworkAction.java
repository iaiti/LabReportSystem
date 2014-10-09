package com.web.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.web.bean.Homework;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.HomeworkService;
import com.web.service.ManagerService;
import com.web.util.Page;
import com.web.util.StudentHomework;

public class HomeworkAction extends ActionSupport {
	private int currentPage;
	private int id;
	private String title;
	private String subject;
	private String studentcontent;
	private String teachercontent;
	private int teacherid;
	private int studentid;
	private int homeworkid;
	private Timestamp finishdate;
	private Timestamp publishdate;
	private int mark;
	private Timestamp lastdate;
	private HomeworkService homeworkService;
	private ManagerService managerService;

	//作业发布
	public String homework_publish() {
		Homework homework = new Homework();
		homework.setTeachercontent(this.getTeachercontent());
		homework.setPublishdate(new Timestamp(new Date().getTime()));
		homework.setLastdate(this.getLastdate());
		homework.setTitle(this.getTitle());
		homework.setSubject(subject);
		homework.setTeacherid(this.getTeacherid());
		// homework.setTeacher(getTeacher());
		homeworkService.homeworkSave(homework);
		return "homework_publish";
	}

	//老师发布的作业列表
	public String homework_list() {
		List<Homework> list = homeworkService.homeworkListById(teacherid);
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list", list);
		return "homework_list";
	}

	//学生自己的成绩
	public String student_marklist(){
		List<Homework> donelist = homeworkService.studenthomeworkDonelist(this.getStudentid());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("donelist", donelist);
		return "student_marklist";
	}
	
	
	//学生未做和已完成的作业列表
	public String studenthomework_list() {
		List<Homework> list = homeworkService.homeworkListAll();
		Iterator i = list.iterator();
/*		Iterator it = delete.iterator();
		for(int j= 0;j<delete.size();j++){
			System.out.println(delete.get(j));
			list.remove((Integer)delete.get(j));
			System.out.println(delete.get(j));
		}*/
		
		//从学生的作业列表中remove掉学生已做的  剩下未做的
		//因为当时可以用复杂的sql语句 进行联合查询  hql不行  但是后面还是感觉这样处理会方便一点
		
		//remove对象的话不方便 还是通过当前的index 删除
		for(int j = 0,len = list.size();j<len;j++){
			Homework homework =list.get(j);
			if(homeworkService.studenthomeworkDone(this.getStudentid(),homework.getId()) != null){
				list.remove(j);
				System.out.println(j);
				len --;
				j--;
			}
		}
		
		List<Homework> donelist = homeworkService.studenthomeworkDonelist(this.getStudentid());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		//传入 已做和未做的作业列表
		hsr.setAttribute("list", list);
		hsr.setAttribute("donelist", donelist);
		return "studenthomework_list";
	}

	//学生做过的作业
	public String student_dohomework() {
		Homework homework = homeworkService.homeworkgetById(id);
		// System.out.println(homework.getTeachercontent());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("homework", homework);
		return "student_dohomework";
	}

	//学生完成作业后的提交
	public String student_finishhomework() {
		Homework oldhomework = homeworkService.homeworkgetById(id);
		Homework homework = new Homework();
		homework.setStudentcontent(this.getStudentcontent());
		homework.setPublishdate(oldhomework.getPublishdate());
		homework.setFinishdate(new Timestamp(new Date().getTime()));
		homework.setTeacherid(oldhomework.getTeacherid());
		homework.setHomeworkid(this.getId());
		homework.setSubject(oldhomework.getSubject());
		homework.setTitle(oldhomework.getTitle());
		homework.setStudentid(this.getStudentid());
		// homework.setTeacher(getTeacher());
		homeworkService.homeworkSave(homework);
		return "student_finishhomework";
	}
	
	//教师发表作业
	public String teacher_publish(){
		return "teacher_publish";
	}
	
	//作业更新前 拿到旧作业
	public String teacher_prepareupdatehomework() {
		Homework oldhomework = homeworkService.homeworkgetById(this.getId());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("homework", oldhomework);
		return "teacher_prepareupdatehomework";
	}

	//teacher页面显示的已做的作业列表
	public String teacherhomework_donelist() {
		List<Homework> list = homeworkService.homeworkDoneList(
				this.getTeacherid(), this.getPublishdate());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list", list);
		return "teacherhomework_donelist";
	}

	//作业更新
	public String teacher_updatehomework() {
		Homework oldhomework = homeworkService.homeworkgetById(id);
		oldhomework.setTeachercontent(this.getTeachercontent());
		oldhomework.setTitle(this.getTitle());
		oldhomework.setSubject(this.getSubject());
		oldhomework.setFinishdate(new Timestamp(new Date().getTime()));
		// homework.setTeacher(getTeacher());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("homwork", oldhomework);
		homeworkService.homeworkUpdate(oldhomework);
		return "teacher_updatehomework";
	}

	//老师评分
	public String teacherhomework_marksave() {
		//System.out.println(this.getId());
		System.out.println("null");
		Homework oldhomework = homeworkService.homeworkgetById(this.getId());
		oldhomework.setMark(this.getMark());
		homeworkService.homeworkUpdate(oldhomework);
		return "teacherhomework_marksave";
	}

	public String teacherhomework_detail() {
		Homework oldhomework = homeworkService.homeworkgetById(this.getId());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("homework", oldhomework);
		return "teacherhomework_detail";
	}

	public String teacherhomework_donecontent() {
		Homework homework = homeworkService.homeworkgetById(this.getId());
		// System.out.println(homework.getStudentid());
		Student student = managerService.studentById(homework.getStudentid());
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("homework", homework);
		// hsr.setAttribute("student", student);
		return "teacherhomework_donecontent";
	}

	//老师页面的学生成绩列表 这个是想了最久的  最后被人一点 思路就通了  其实就是视图的东西  可以看成一个中间类
	//存储成绩和学生的信息
	public String teacherhomework_studentmarklist() {
	/*	Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		page.setCount(managerService.studentcount());
		List<Student> list = managerService.student_list(page);
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list", list);
		hsr.setAttribute("page", page);*/
		List<Student> list = managerService.student_listAll();
		List<StudentHomework> newlist = new ArrayList<StudentHomework>();
		List<Homework> hw = homeworkService.homeworkListAll();
		Iterator i= list.iterator();
		Iterator h = hw.iterator();
		
		//先遍历学生
		while(i.hasNext()){
			List mark = new ArrayList();
			Student student = (Student) i.next();
			StudentHomework sh = new StudentHomework();
			sh.setStudentname(student.getName());
			//再遍历该学生的作业
			for(int temp = 0;temp < hw.size();temp++){
				Homework homework = hw.get(temp);
				//没完成的作业给零分  有完成的提取分数之后 添加到mark这个list中0
				if(homeworkService.studenthomeworkDone(student.getId(), homework.getId())== null){
					mark.add(0);
				}
				else if(homeworkService.studenthomeworkDone(student.getId(), homework.getId()).getMark() == null){
					mark.add(0);
				} else{
					mark.add(homeworkService.studenthomeworkDone(student.getId(), homework.getId()).getMark());
				}
			}
			sh.setMark(mark);
			newlist.add(sh);
		}
		//最后传入该list
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list", newlist);
		hsr.setAttribute("homeworklist", hw);
		
		return "teacherhomework_studentmarklist";
	}

	//老师对作业的删除
	public String teacherhomework_delete() {
		homeworkService.homeworkDelete(homeworkService.homeworkgetById(this
				.getId()));
		return "teacherhomework_delete";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStudentcontent() {
		return studentcontent;
	}

	public void setStudentcontent(String studentcontent) {
		this.studentcontent = studentcontent;
	}

	public String getTeachercontent() {
		return teachercontent;
	}

	public void setTeachercontent(String teachercontent) {
		this.teachercontent = teachercontent;
	}

	public int getTeacherid() {
		return teacherid;
	}

	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public int getHomeworkid() {
		return homeworkid;
	}

	public void setHomeworkid(int homeworkid) {
		this.homeworkid = homeworkid;
	}

	public Timestamp getFinishdate() {
		return finishdate;
	}

	public void setFinishdate(Timestamp finishdate) {
		this.finishdate = finishdate;
	}

	public Timestamp getPublishdate() {
		return publishdate;
	}

	public void setPublishdate(Timestamp publishdate) {
		this.publishdate = publishdate;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public Timestamp getLastdate() {
		return lastdate;
	}

	public void setLastdate(Timestamp lastdate) {
		this.lastdate = lastdate;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public HomeworkService getHomeworkService() {
		return homeworkService;
	}

	public void setHomeworkService(HomeworkService homeworkService) {
		this.homeworkService = homeworkService;
	}
	

	public ManagerService getManagerService() {
		return managerService;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
}
