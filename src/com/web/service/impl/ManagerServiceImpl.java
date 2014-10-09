package com.web.service.impl;

import java.util.List;

import com.web.DAO.ManagerDAO;
import com.web.DAO.StudentDAO;
import com.web.DAO.TeacherDAO;
import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.bean.Teacher;
import com.web.service.ManagerService;
import com.web.util.Page;

public class ManagerServiceImpl implements ManagerService {
	private StudentDAO studentDAO; 
	private TeacherDAO teacherDAO; 
	private ManagerDAO managerDAO;
	public ManagerDAO getManagerDAO() {
		return managerDAO;
	}
	public void setManagerDAO(ManagerDAO managerDAO) {
		this.managerDAO = managerDAO;
	}
	public StudentDAO getStudentDAO() {
		return studentDAO;
	}
	public void setStudentDAO(StudentDAO studentDAO) {
		this.studentDAO = studentDAO;
	}
	public TeacherDAO getTeacherDAO() {
		return teacherDAO;
	}
	public void setTeacherDAO(TeacherDAO teacherDAO) {
		this.teacherDAO = teacherDAO;
	}
	/* (non-Javadoc)
	 * @see com.web.service.impl.ManagerService#student_list()
	 */
	public List<Teacher> teacher_list(Page page){
		return teacherDAO.teacherlist(page);
	}
	public List<Student> student_list(Page page){
		return studentDAO.studentlist(page);
	}
	public List<Student> student_listAll(){
		return studentDAO.studentListAll();
	}
	public void studentdelete(int id){
		 studentDAO.studentdelete(id);
	}
	public void teacherdelete(int id){
		teacherDAO.teacherdelete(id);
	}
	public int teachercount(){
		return teacherDAO.teachercount();
	}
	public int studentcount(){
		return studentDAO.studentcount();
	}
	
	public Student studentById(int id){
		return studentDAO.studentById(id);
	}
	
	public Teacher teacherById(int id){
		return teacherDAO.teacherById(id);
	}
	public void studentUpdate(Student student){
		studentDAO.studentUpdate(student);
	}
	public void teacherUpdate(Teacher teacher){
		teacherDAO.teacherupdate(teacher);
	}
	public Manager managerById(int id) {
		// TODO Auto-generated method stub
		return managerDAO.managerById(id);
	}
	public void managerUpdate(Manager manager) {
		// TODO Auto-generated method stub
		managerDAO.managerUpdate(manager);
	}
	
}
