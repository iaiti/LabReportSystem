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

	<script type="text/javascript">
		function CloseWin() {
			if (confirm("您确定要放弃编辑本页面的内容？")) {
				window.open("../xsdt.jsp", "_self");
				return false;
			}
			return false;
		}
	</script>
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
							<div style="word-spacing:30px">
							作业标题  <s:iterator value="#request.homeworklist" id="homework" status="sta">
							<s:property value="#homework.title"/>
							</s:iterator>
							</div>
							<div style="word-spacing:30px">
							<s:iterator value="#request.list" id="student" status="sta">
							<div class="comments">
								<div class="comment">
										<span><s:property
													value="#student.studentname" />
											<s:iterator value="#student.mark" id="mark" status="sta">
										<s:property value="#mark" />
											</s:iterator>		
										<%--<a href="teacherhomework_detail?id=<s:property value='#homework.'/>">点击查看</a> 
										
										--%></span>
								</div>
							</div>
						</s:iterator>
						</div>
						<div class="comment" align="center"><%--
							
							<s:if test="#request.page.prePage">
								<a href="homework/teacherhomework_studentmarklist.action?currentPage=1">首页</a>
								<a
									href="homework/teacherhomework_studentmarklist.action?currentPage=${page.currentPage -1 }">上一页</a>
							</s:if>
							<s:else>
				首页
				上一页
			</s:else>

							<s:if test="#request.page.nextPage">
								<a
									href="homework/teacherhomework_studentmarklist.action?currentPage=${page.currentPage + 1 }">下一页</a>
								<a href="homework/teacherhomework_studentmarklist.action?currentPage=${page.totalPage }">尾页</a>
							</s:if>
							<s:else>
				下一页
				尾页
			</s:else><br/>
			第${page.currentPage}页，共${page.totalPage}页，每页${page.everyPage}条记录
						--%></div>
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
