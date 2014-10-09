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
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link type="text/css" rel="stylesheet" href="css/main.css" media="all" />
<script type="text/javascript" src="js/mootools.js"></script>
<script type="text/javascript" src="js/site.js"></script>
<script type="text/javascript">
function CloseWin(){
if(confirm("您确定要放弃编辑本页面的内容？")){
       return false;
}
return false;
}
</script>
</head>
<body>
	<div id="wrapper">
		<div id="container">
			<div id="scene">
				<img src="images/scene.jpg" alt="" />
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
						<div class="comments">
							<h2>
							密码修改完成
							</h2>
						</div>
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

  <%--<body>
       <h1>教师登录成功</h1> <br>
       <s:textfield name="user.id" value="%{user.id}"></s:textfield><br/>
       <a href="teacher_markList.action">成绩列表</a>
       <a href="teacher_publish.action">发布作业</a>
       <a href="teacher_read.action">批阅作业</a>
       <a href="teacher_sendEmail.action">发送邮件</a>
  </body>
--%>