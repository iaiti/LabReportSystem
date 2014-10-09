package com.web.bean;

/**
 * AbstractManager entity provides the base persistence definition of the
 * Manager entity. @author MyEclipse Persistence Tools
 */

public class Manager implements java.io.Serializable {

	// Fields

	private Integer loginid;
	public Integer getLoginid() {
		return loginid;
	}

	public void setLoginid(Integer loginid) {
		this.loginid = loginid;
	}

	private String password;
	
	//密保问题
	private String answer;

	// Constructors

	/** default constructor */
	public Manager() {
	}

	/** minimal constructor */
	public Manager(Integer id, String password) {
		this.loginid = id;
		this.password = password;
	}

	/** full constructor */
	public Manager(Integer id, String password, String answer) {
		this.loginid = id;
		this.password = password;
		this.answer = answer;
	}

	// Property accessors


	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

}