package com.web.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.web.DAO.UserDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.RegisterService;

/**
 * @author admin
 *  使用modeldriven 之后 就不用 写这些变量用getset方法 但是之前构造方法出现问题
 *  而且 变量不是太多  所以没采用
 */
public class RegisterActionusemodeldriven extends ActionSupport implements ModelDriven{

	private String role;
	/*private int id;
	private String password;
	private String repassword;
	private String name;
	private String email;*/
	private Student student;
	private Teacher teacher;
	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}



	public Teacher getTeacher() {
		return teacher;
	}



	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}



	public Object getModel() {
		// TODO Auto-generated method stub
		if (role.equals("1") && student == null){
			student = new Student();
		}else if(role.equals("1") && student != null){
			return student;
		}else if(role.equals("2") && teacher == null){
			teacher = new Teacher();
		} else if(role.equals("2") && teacher != null){
			return teacher;
		}
		return student;
	}
	


	@Override
	public String execute() throws Exception {
		/*HttpServletRequest request = ServletActionContext.getRequest();
		String role = request.getParameter("role");*/
		/*System.out.println(id);
		System.out.println(name);
		System.out.println(role);
		System.out.println(password);
		System.out.println(repassword);*/
		
		if (role.equals("1")) {
			/*Student student = new Student();
			student.setId(this.getId());
			student.setName(this.getName());
			student.setPassword(this.getPassword());
			student.setEmail(email);*/
			registerservice.student_save(student);
			return "student_register";
			//return "student_login";
			
		} else if (role.equals("2")) {
			/*Teacher teacher = new Teacher();
			teacher.setId(this.getId());
			teacher.setPassword(this.getPassword());
			teacher.setName(this.getName());
			teacher.setEmail(email);*/
			registerservice.teacher_save(teacher);
			return "teacher_register";
			//return "teacher_login";
		} 
		//return ERROR;
		return ERROR;
	}

	

	private RegisterService registerservice;

	public RegisterService getRegisterservice() {
		return registerservice;
	}

	public void setRegisterservice(RegisterService registerservice) {
		this.registerservice = registerservice;
	}

	/*public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
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
	}*/
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}


	

}
