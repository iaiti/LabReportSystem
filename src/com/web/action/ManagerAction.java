package com.web.action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.HomeworkService;
import com.web.service.LoginService;
import com.web.service.ManagerService;
import com.web.util.Page;

public class ManagerAction extends ActionSupport {
	private int id;
	private int currentPage;
	private ManagerService managerService;
	

	public String teacher_list(){
		Page page = new Page();
		//设置每页显示记录数为10
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		//拿到teacher记录数
		page.setCount( managerService.teachercount());
		List<Teacher> list = managerService.teacher_list(page);
		//页面传入list和page对象
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list",list);
		hsr.setAttribute("page",page);
		return "teacher_list";
	}
	
	public String student_list(){
		Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		page.setCount( managerService.studentcount());
		List<Student> list = managerService.student_list(page);
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list",list);
		hsr.setAttribute("page",page);
		return "student_list";
	}
	
	public String student_delete(){
		Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		page.setCount( managerService.studentcount());
		managerService.studentdelete(id);
		List<Student> list = managerService.student_list(page);
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list",list);
		hsr.setAttribute("page",page);
		return "student_delete";
	}
	
	public String teacher_delete(){
		Page page = new Page();
		page.setEveryPage(10);
		page.setCurrentPage(currentPage);
		page.setCount( managerService.teachercount());
		managerService.teacherdelete(id);
		List<Teacher> list = managerService.teacher_list(page);
		HttpServletRequest hsr = ServletActionContext.getRequest();
		hsr.setAttribute("list",list);
		hsr.setAttribute("page",page);
		return "teacher_delete";
	}
	
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
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
}
