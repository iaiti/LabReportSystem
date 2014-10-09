package com.web.action;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.HomeworkService;
import com.web.service.LoginService;
import com.web.service.ManagerService;
import com.web.util.MD5;

public class UserAction extends ActionSupport {
	private String password;
	private int id;
	private HomeworkService homeWorkService;
	private ManagerService managerService;

	//session的remove 退出登录时 清楚session
	public String teacher_sessionremove() {
		Map session = ActionContext.getContext().getSession();
		session.remove("teacher");
		return "teacher_sessionremove";
	}

	public String student_sessionremove() {
		ActionContext actioncontext = ActionContext.getContext();
		Map session = actioncontext.getSession();
		session.remove("student");
		return "student_sessionremove";
	}

	public String manager_sessionremove() {
		ActionContext actioncontext = ActionContext.getContext();
		Map session = actioncontext.getSession();
		session.remove("manager");
		return "manager_sessionremove";
	}

	//密码的页面提交之后的密码更新
	public String student_updatepassword() {
		Student student = managerService.studentById(id);
		student.setPassword(this.getPassword());
		managerService.studentUpdate(student);
		return "student_updatepassword";
	}

	public String teacher_updatepassword() {
		Teacher teacher = managerService.teacherById(id);
		teacher.setPassword(this.getPassword());
		managerService.teacherUpdate(teacher);
		return "teacher_updatepassword";
	}

	//密码修改
	public String teacher_changepassword() {
		return "teacher_changepassword";
	}

	public String student_changepassword() {
		return "student_changepassword";
	}

	public String manager_updatepassword() {
		Manager manager = managerService.managerById(id);
		manager.setPassword(this.getPassword());
		managerService.managerUpdate(manager);
		return "manager_updatepassword";
	}

	public String manager_changepassword() {
		return "manager_changepassword";
	}

	//学生成绩查询
	public String student_queryMark() {
		return "student_queryMark";
	}

	//老师显示学生成绩列表
	public String teacher_markList() {
		return "teacher_markList";
	}

	//学生提交作业
	public String student_finishhomework() {
		return "student_finishhomework";
	}

	public String teacher_sendEmail() {
		return "teacher_sendEmail";
	}

	public String student_list() {
		return "student_list";
	}

	public HomeworkService getHomeWorkService() {
		return homeWorkService;
	}

	public void setHomeWorkService(HomeworkService homeWorkService) {
		this.homeWorkService = homeWorkService;
	}

	public ManagerService getManagerservice() {
		return managerService;
	}

	public void setManagerservice(ManagerService managerservice) {
		this.managerService = managerservice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public ManagerService getManagerService() {
		return managerService;
	}

	public void setManagerService(ManagerService managerService) {
		this.managerService = managerService;
	}
	//md5加密 传输密码的时候
	public String getPassword() {
		try {
			System.out.println(password);
			password = new MD5().changeMD5(password);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
