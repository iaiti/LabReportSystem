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
<form action="<%= basePath %>student_updatepassword"  method="post">
		<input  type="hidden" name="id" value="${sessionScope.student.id}"/>

<table width="446" border="1" align="center" cellspacing="0">
  <tr>
    <td height="40" align="center">新密码</td>
    <td align="center">
      <input name="password" type="password" class="textfield" id="textfield2" maxlength="13" />
    </td>
  </tr>
  <tr>
    <td height="40" align="center">确认密码</td>
    <td align="center">
      <input  type="password" class="textfield" id="textfield3" maxlength="13" />
    </td>
  </tr>
  <tr>
    <td height="60" align="center">
       <input type="submit"  value="提交">
    </td>
  </tr>
</table>
  </form>
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