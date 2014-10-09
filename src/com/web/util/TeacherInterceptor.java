package com.web.util;

import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class TeacherInterceptor extends AbstractInterceptor{
	public String intercept(ActionInvocation invocation) throws Exception {
		ActionContext context =invocation.getInvocationContext();
		//System.out.println("teacher intercepted");  
		//测试是否对aciton进行了拦截
		Map session = context.getContext().getSession();
		if(session.get("teacher") == null) {
			//返回主页页面
			//System.out.println("null");
			return "welcome";
		} else {
			//进行下一步操作，stack中如果还有拦截器，就继续执行，没有就正常的action跳转
		//	System.out.println("not null");
			return invocation.invoke();
		}
	}
}
