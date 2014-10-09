package com.web.DAO;

import java.util.List;

import com.web.bean.Manager;
import com.web.bean.Student;
import com.web.util.Page;

public interface ManagerDAO {
	Manager managerById(int id);
	void managerUpdate(Manager manager);
}