package com.web.action;

import java.security.NoSuchAlgorithmException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.RegisterService;
import com.web.util.MD5;

public class RegisterAction extends ActionSupport {
		
	private int id;
	private String password;
	private int loginid;
	private String repassword;
	private String name;
	private String role;
	private String email;
	
	@Override
	public String execute() throws Exception {
		//将数据放入相应的student和teacher，然后通过service层 保存
		
		if (role.equals("1")) {
			//System.out.println(new MD5().changeMD5("123"));
			 //System.out.println("a"+new MD5().changeMD5("123")); 
			Student student = new Student();
			student.setLoginid(this.getLoginid());
			student.setName(this.getName());
			student.setPassword(this.getPassword());
			student.setEmail(email);
			
			
			registerService.student_save(student);
			Map session = ActionContext.getContext().getSession();
			session.put("student", student);
			return "student_register";
			//return "student_login";
			
		} else if (role.equals("2")) {
			Teacher teacher = new Teacher();
			teacher.setLoginid(this.getLoginid());
			teacher.setPassword(this.getPassword());
			teacher.setName(this.getName());
			teacher.setEmail(email);
			registerService.teacher_save(teacher);
			Map session = ActionContext.getContext().getSession();
			session.put("teacher", teacher);
			return "teacher_register";
			//return "teacher_login";
		} 
		//return ERROR;
		return ERROR;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public int getLoginid() {
		return loginid;
	}

	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRepassword() {
		return repassword;
	}

	public void setRepassword(String repassword) {
		this.repassword = repassword;
	}

	private RegisterService registerService;


	public RegisterService getRegisterService() {
		return registerService;
	}

	public void setRegisterService(RegisterService registerService) {
		this.registerService = registerService;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	//利用util包中的MD5类将密码进行md5加密
	public String getPassword() {
		try {
			//System.out.println(password);
			password = new MD5().changeMD5(password);
			//System.out.println(new MD5().changeMD5("123"));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return password;
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

}
