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
<script language="javascript">
    function realSysTime(clock){
        var now=new Date();            //创建Date对象
        var year=now.getFullYear();    //获取年份
        var month=now.getMonth();    //获取月份
        var date=now.getDate();        //获取日期
        var day=now.getDay();        //获取星期
        var hour=now.getHours();    //获取小时
        var minu=now.getMinutes();    //获取分钟
        var sec=now.getSeconds();    //获取秒钟
        month=month+1;
        var arr_week=new Array("星期日","星期一","星期二","星期三","星期四","星期五","星期六");
        var week=arr_week[day];        //获取中文的星期
        var time="今天是"+year+"年"+month+"月"+date+"日 "+week+" "+hour+":"+minu+":"+sec;    //组合系统时间
        clock.innerHTML=time;    //显示系统时间
    }
    window.onload=function(){
        window.setInterval("realSysTime(clock)",1000);    //实时获取并显示系统时间
    }
    </script>

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
        <div class="holder">  <a href="<%= basePath %>manager_changepassword">修改密码</a> </div>
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
              <h2 id="clock"></h2>
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
