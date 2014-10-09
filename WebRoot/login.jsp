<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Web实验报告在线生成与批阅系统</title>
<style type="text/css">
body {
	padding: 0px;
	background-color: #040436;
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

#bg {
	width: 1070px;
	margin-right: auto;
	margin-left: auto;
	background-image: url(images/1.jpg);
	padding-top: 100px;
	height: 480px;
}

#login {
	margin-right: auto;
	margin-left: auto;
}
#login table  {
	margin-right: auto;
	margin-left: auto;
	height: 100px;
	width: 400px;
	background-color: #E3E8EA;
}
#login table .text  {
	height: 20px;
	width: 220px;
}
#login #form3 ul  {
	list-style-type: none;
	height: 30px;
	width: 400px;
	line-height: 30px;
	display: inline;
}
#login #form3  {
	height: 30px;
	margin: 0px;
	padding-top: 20px;
}
#login #form3 ul li  {
	display: inline;
	margin-right: 20px;
	margin-left: 20px;
}
#login .button  {
	height: 40px;
	width: 150px;
	font-size: 18px;
	margin: 0px;
	background-color: #FC0;
}
#login #form4  {
	margin: 0px;
}
</style>
</head>

<body>
<div id="bg">
<div id="login">
<form action="login" method="post">
    <table width="350" border="0" align="center">
      <tr>
        <td height="20" colspan="2" align="center">&nbsp;</td>
      </tr>
      <tr>
        <td width="35%" height="40" align="center">用户ID</td>
        <td width="65%" height="40">
        <input name="loginid" type="text" class="textfield" id="textfield3" maxlength="12" />
       </td>
      </tr>
      <tr>
        <td height="40" align="center">密码</td>
        <td height="40">
          <input name="password" type="password" class="textfield" id="key" maxlength="12" />
      </td>
      </tr>
       <tr>
        <td height="50" colspan="3" align="center"> 
        
          <input name="role" type="radio" id="RadioGroup1_0" value="1" checked="checked" />
          学生
        
          <input type="radio" name="role" value="2" id="RadioGroup1_1" />
          教师
        
          <input type="radio" name="role" value="3" id="RadioGroup1_2" />
          管理员
    </td>
      </tr>
      <tr>
       
       <td height="80" colspan="2" align="center">
         <input type="submit"   class="button" id="button1"  value="登录">
</td>
         </tr>
         <tr >
         <td align="center" colspan="2" >
           <a href="register.jsp">注册 </a></td>
      </tr>
          </table>  
          </form>
</div>
</div>
</body>
</html>