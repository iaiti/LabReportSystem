<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path =  request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
<title>Web实验报告系统后台管理</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="<%=basePath%>css/main.css" media="all" />
<script type="text/javascript" src="js/mootools.js"></script>
<script type="text/javascript" src="js/site.js"></script>

</head>
<body>
	<div id="wrapper">
		<div id="container">
			<div id="scene">
				<img src="<%=basePath%>images/scene.jpg" alt="" />
				<h1>在线实验报告系统</h1>
				<div id="menu">
					<div class="holder">
					
					<a href="<%=basePath%>homework/studenthomework_list?studentid=${sessionScope.student.id}">查看作业</a>
					</div>
					<div class="holder">
						<a href="<%=basePath%>homework/student_marklist?studentid=${sessionScope.student.id}">成绩查询</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>student_changepassword">修改密码</a>
					</div>
					<div class="holder">
						<a href="<%=basePath%>student_sessionremove">退出系统</a>
					</div>
				</div>
			</div>
			<div id="content">
				<div id="col_left">
					<div class="post">
						<div class="meta"></div>
						<div class="comments">
							<h2>
							
								成绩<br />
							</h2>
						</div>
						<s:iterator value="#request.donelist" id="homework" status="sta">
							<div class="comments">
								<div class="comment">
									<div class="meta">
										<span>标题<s:property
													value="#homework.title" />
													所属课程    <s:property  value="#homework.subject"/>
											<s:if test="#homework.mark != 0&&#homework.mark != NULL">分数 ： ${homework.mark}</s:if>
										<s:else>
										未评
										</s:else>
										
										</span>
									</div>
								</div>
							</div>
						</s:iterator>
						
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div id="footer">
				<div class="clear"></div>
				<hr />
				<p class="credit">在线实验报告系统</p>
			</div>
		</div>
	</div>
</body>
</html><%--

  <body>
       <h1>学生登录成功 </h1><br>
       <s:textfield name="student.id" value="%{id}"></s:textfield><br/>
       <a href="student_homeWork.action">做作业</a>
       <a href="student_queryMark.action">查询成绩</a>
  </body>
--%>