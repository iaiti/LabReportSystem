<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

</head>
<body>
<div id="wrapper">
  <div id="container">
    <div id="scene"> <img src="images/scene.jpg" alt="" />
      <h1>实验管理系统</h1>
      <div id="menu">
        <div class="holder"> <a href="manager/teacher_list">教师列表</a> </div>
        <div class="holder"> <a href="manager/student_list">学生列表</a> </div>
        <div class="holder"> <a href="useradd.jsp">添加用户</a> </div>
        <div class="holder"> <a href="<%= basePath %>manager_changepassword">修改密码</a> </div>
        	<div class="holder"><a href="<%= basePath %>manager_sessionremove">退出系统</a></div>
      </div>
    </div>
    <div id="content">
      <div id="col_left">
        <div class="post">
          <div class="meta"></div>
          <div class="comments">
            <h2>欢迎管理员，你正在使用Web实验报告系统<br/>
            </h2>
<form action="<%= basePath %>manager_updatepassword"  method="post">
		<input  type="hidden" name="id" value="${sessionScope.manager.loginid}"/>

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
      <div class="clear"> </div>
    </div>
    <div id="footer">
      <div class="clear"> </div>
      <hr />
      <p class="credit">实验管理系统</p>
    </div>
  </div>
</div>
</body>
</html>
