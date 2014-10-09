package com.web.bean;

/**
 * AbstractStudent entity provides the base persistence definition of the
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer loginid;
	private String password;
	private String name;
	private String email;
	
	//学院名称
	private String collegename;
	//专业和班号
	private String classname;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(Integer loginid, String password, String name,
			String email) {
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	/** full constructor */
	public Student(Integer loginid, String password, String name,
			String email, String collegename, String classname) {
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.email = email;
		this.collegename = collegename;
		this.classname = classname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLoginid() {
		return this.loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCollegename() {
		return this.collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	public String getClassname() {
		return this.classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

}