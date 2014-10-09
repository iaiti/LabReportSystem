<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录界面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>  
    
    <s:form action="/login">
    <s:textfield name="id" label="ID"></s:textfield>
    <s:textfield name="password" label="PASSWORD"></s:textfield>
    <s:select list="#{1:'学生',2:'教师',3:'管理员'}" name="role" listKey="key" listValue="value" headerKey="0" headerValue="请选择用户类型"></s:select>
    <s:submit value="submit"></s:submit>
    </s:form>
    
    
  </body>
</html>
