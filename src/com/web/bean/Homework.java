package com.web.bean;

import java.sql.Timestamp;

/**
 * AbstractHomework entity provides the base persistence definition of the
 * Homework entity. @author MyEclipse Persistence Tools
 */

public class Homework implements java.io.Serializable {

	// Fields

	private Integer id;
	private String title;
	
	//科目
	private String subject;
	private String studentcontent;
	private String teachercontent;
	private Integer teacherid;
	private Integer studentid;
	private Integer homeworkid;
	
	//完成时间
	private Timestamp finishdate;
	//发布时间
	private Timestamp publishdate;
	//完成时间
	private Timestamp lastdate;
	//分数
	private Integer mark;

	// Constructors

	/** default constructor */
	public Homework() {
	}

	/** minimal constructor */
	public Homework(String title) {
		this.title = title;
	}

	/** full constructor */
	public Homework(String title, String subject,
			String studentcontent, String teachercontent, Integer teacherid,
			Integer studentid, Integer homeworkid, Timestamp finishdate,
			Timestamp publishdate, Integer mark, Timestamp lastdate) {
		this.title = title;
		this.subject = subject;
		this.studentcontent = studentcontent;
		this.teachercontent = teachercontent;
		this.teacherid = teacherid;
		this.studentid = studentid;
		this.homeworkid = homeworkid;
		this.finishdate = finishdate;
		this.publishdate = publishdate;
		this.mark = mark;
		this.lastdate = lastdate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getStudentcontent() {
		return this.studentcontent;
	}

	public void setStudentcontent(String studentcontent) {
		this.studentcontent = studentcontent;
	}

	public String getTeachercontent() {
		return this.teachercontent;
	}

	public void setTeachercontent(String teachercontent) {
		this.teachercontent = teachercontent;
	}

	public Integer getTeacherid() {
		return this.teacherid;
	}

	public void setTeacherid(Integer teacherid) {
		this.teacherid = teacherid;
	}

	public Integer getStudentid() {
		return this.studentid;
	}

	public void setStudentid(Integer studentid) {
		this.studentid = studentid;
	}

	public Integer getHomeworkid() {
		return this.homeworkid;
	}

	public void setHomeworkid(Integer homeworkid) {
		this.homeworkid = homeworkid;
	}

	public Timestamp getFinishdate() {
		return this.finishdate;
	}

	public void setFinishdate(Timestamp finishdate) {
		this.finishdate = finishdate;
	}

	public Timestamp getPublishdate() {
		return this.publishdate;
	}

	public void setPublishdate(Timestamp publishdate) {
		this.publishdate = publishdate;
	}

	public Integer getMark() {
		return this.mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Timestamp getLastdate() {
		return this.lastdate;
	}

	public void setLastdate(Timestamp lastdate) {
		this.lastdate = lastdate;
	}

}