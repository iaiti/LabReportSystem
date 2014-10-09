<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
<head>
<title>Web实验报告系统后台管理</title>
<meta http-equiv="Content-Type" content="<%=basePath%>text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="<%=basePath%>css/main.css" media="all" />
<script type="text/javascript" src="js/mootools.js"></script>
<script type="text/javascript" src="js/site.js"></script>
</head>
<body onload="document.getElementById('title').focus()">

	<div id="wrapper">
		<div id="container">
			<div id="scene">
				<img src="<%=basePath%>images/scene.jpg" alt="" />
				<h1>在线实验报告系统</h1>
				<div id="menu">
					<div class="holder">
							<a href="<%=basePath%>homework/teacher_publish">作业发布</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>homework/teacherhomework_list?teacherid=${sessionScope.teacher.id}">作业列表</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>homework/teacherhomework_studentmarklist">学生成绩</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>homework/teacherhomework_marklist?teacherid=${sessionScope.teacher.id}">作业批改</a>
					</div>
					<div class="holder">
						<a href="<%=basePath%>teacher/teacher_sendemail.jsp">邮件通知</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>teacher_changepassword">密码修改</a>
					</div>
					<div class="holder">
					<a href="<%=basePath%>teacher_sessionremove">退出系统</a>
					</div>
				</div>
			</div>
			<div id="content">
				<div id="col_left">
					<div class="post">
						<div class="meta"></div>
					<h2>
								已发布实验列表<br />
							</h2>
							<s:iterator value="#request.list" id="homework" status="sta">
							<div class="comments">
								<div class="comment">
									<div class="meta">
										<span><s:property
													value="#homework.title" />
													<s:property
													value="#homework.studentid" />
											<s:if test="#homework.mark != 0&&#homework.mark != NULL">分数 ： ${homework.mark}</s:if>
										<s:else>
										未评
										<a href="teacherhomework_donecontent?id=${homework.id}"/>
										点击查看学生完成情况并评分</a> 
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
</html>
