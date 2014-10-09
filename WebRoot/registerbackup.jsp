<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
<style type="text/css">
.textfield {
	height: 20px;
	width: 200px;
}
body div {
	height: 400px;
	width: 600px;
	margin-right: auto;
	margin-left: auto;
	margin-top: 40px;
}
body div h1 {
	font-size: 25px;
}
body table {
	background-color: #FFF;
	margin: 70px;
}
.button {
	height: 40px;
	width: 80px;
}
body {
	background-color: #ECE6F0;
	background-image: url(images/1.jpg);
}
.STYLE1 {color: #FFFFFF}
</style>
</head>

<body>
<div>
<h1 class="STYLE1">Web实验报告系统--用户注册 </h1>
<center>
<s:actionerror id="actionError"/>
</center>
<s:form action="register">
<table width="446" border="1" align="center" cellspacing="0">
<tr>
     <s:textfield name="name" label="姓名"  type="text"  class="textfield" id="textfield" maxlength="13" ></s:textfield>
</tr>
<tr>
     <s:textfield name="id" label="学号/教工号"  type="text"  class="textfield" id="textfield" maxlength="13" ></s:textfield>
</tr>
  <tr>
     <s:radio list="#{1:'学生',2:'教师'}" label="选择类型" name="role" listKey="key" 
     listValue="value" headerKey="1" headerValue="请选择用户类型"></s:radio>
  </tr>
  <tr>
    <s:password name="password" label="密码"></s:password>
  </tr>
    <tr>
    <s:password name="repassword" label="确认密码"></s:password>
  </tr>
    <s:submit value="提交"></s:submit>
</table>
</s:form>
</div>
</body>
</html>