package com.web.action;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.LoginService;
import com.web.util.MD5;

public class LoginAction extends ActionSupport {
	
	private int loginid;
	private String password;
	private String role;
	private LoginService loginService;

	@Override
	public String execute() throws Exception {
		if(role.equals("1")){
			Student student = new Student();
			student.setLoginid(this.getLoginid());
			student.setPassword(this.getPassword());
			if(loginService.student_check(student) != null){
				
				//验证成功后 ，往session中存入student
				Map session = ActionContext.getContext().getSession();
				session.put("student", loginService.student_check(student));
				//System.out.println("true");
				return "student_login";
			}
		}
		else if(role.equals("2")){
			Teacher teacher = new Teacher();
			teacher.setLoginid(this.getLoginid());
			teacher.setPassword(this.getPassword());
			if(loginService.teacher_check(teacher) != null){
				
				//request传入对象的话只能存在于一个页面  所以采用session
				//HttpServletRequest hsr = ServletActionContext.getRequest();
				//hsr.setAttribute("teacher",loginService.teacher_check(teacher));
				
				//验证成功后 ，往session中存入teacher
				Map session = ActionContext.getContext().getSession();
				session.put("teacher", loginService.teacher_check(teacher));
				return "teacher_login";
			}
		}else if(role.equals("3")){
			Manager manager = new Manager();
			manager.setLoginid(this.getLoginid());
			manager.setPassword(this.getPassword());
			if(loginService.manager_check(manager) != null){
				
				//验证成功后 ，往session中存入manager
				Map session = ActionContext.getContext().getSession();
				session.put("manager", loginService.manager_check(manager));
				return "manager_login";
			}
		}	
		return ERROR;	
	}
	
	//利用util包中的MD5类将密码进行md5加密
	public String getPassword() {
		try {
			password = new MD5().changeMD5(password);
			//System.out.println(password);
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
	}
	
	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public LoginService getLoginService() {
		return loginService;
	}

	public void setLoginService(LoginService loginService) {
		this.loginService = loginService;
	}
}
