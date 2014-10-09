package com.web.util;

import java.util.List;

/**
 * @author admin
 *  之前所说的视图 view 其实就是  穿插在页面的 中间类   由于要把学生和成绩两个类的数据挂钩
 *  需要一个中间的list来存取 学生姓名 成绩
 */
public class StudentHomework {
	String studentname;
	List mark ;
	public List getMark() {
		return mark;
	}
	public void setMark(List mark) {
		this.mark = mark;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
}
