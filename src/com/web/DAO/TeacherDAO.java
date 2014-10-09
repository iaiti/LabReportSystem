package com.web.DAO;

import java.util.List;

import com.web.bean.Teacher;
import com.web.util.Page;

/**
 * @author admin
 *	可参见StudentDAO
 */
public interface TeacherDAO {
	
	
	List<Teacher> teacherlist(Page page);
	void teacherdelete(int id);
	int teachercount();
	Teacher teacherById(int id);
	void teacherupdate(Teacher teacher);
	
}