package com.web.junittest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import sun.net.RegisteredDomain;

import com.web.DAO.UserDAO;
import com.web.DAO.impl.UserDAOImpl;
import com.web.action.RegisterAction;
import com.web.service.RegisterService;
import com.web.service.impl.RegisterServiceImpl;

public class addtest  {

	@Test
	public void test() {
		//框架的测试  后面发现 ssh整合之后 只有启动tomcat去调试  或者用spring和hibernate的测试框架
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		RegisterAction ua = (RegisterAction)ctx.getBean("user");
	}

}
