package com.web.bean;

/**
 * AbstractTeacher entity provides the base persistence definition of the
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public  class Teacher implements java.io.Serializable {

	// Fields

	private Integer id;
	private Integer loginid;
	private String password;
	
	//学院名
	private String collegename;
	private String name;
	private String email;

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(Integer loginid, String password, String name,
			String email) {
		this.loginid = loginid;
		this.password = password;
		this.name = name;
		this.email = email;
	}

	/** full constructor */
	public Teacher(Integer loginid, String password,
			String collegename, String name, String email) {
		this.loginid = loginid;
		this.password = password;
		this.collegename = collegename;
		this.name = name;
		this.email = email;
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

	public String getCollegename() {
		return this.collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
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

}