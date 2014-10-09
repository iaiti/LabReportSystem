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
<link type="text/css" rel="stylesheet" href="../css/main.css" media="all" />
<script type="text/javascript" src="../js/mootools.js"></script>
<script type="text/javascript" src="../js/site.js"></script>

</head>
<body>
	<div id="wrapper">
		<div id="container">
			<div id="scene">
				<img src="../images/scene.jpg" alt="" />
				<h1>实验管理系统</h1>
				<div id="menu">
					<div class="holder">
						<a href="teacher_list">教师列表</a>
					</div>
					<div class="holder">
						<a href="student_list">学生列表</a>
					</div>
					<div class="holder">
					<a href="../useradd.jsp">添加用户</a>
					</div>
					<div class="holder">
						 <a href="<%= basePath %>manager_changepassword">修改密码</a>
					</div>
						<div class="holder">
						<a href="<%= basePath %>manager_sessionremove">退出系统</a>
					</div>
				</div>
			</div>
			<div id="content">
				<div id="col_left">
					<div class="post">
						<div class="meta"></div>
						<div class="comments">
							<h2>
								学生列表<br />
							</h2>
							<s:iterator value="#request.list" id="student" status="sta">
							<div class="comments">
								<div class="comment">
									<div class="meta">
										<span><s:property
													value="#student.name" />
										<a href="student_delete?id=<s:property value='#student.id'/>">删除</a> 
										
										</span>
									</div>
								</div>
							</div>
						</s:iterator>
						<div class="comment" align="center">
							
							<s:if test="#request.page.prePage">
								<a href="student_list.action?currentPage=1">首页</a>
								<a
									href="student_list.action?currentPage=${page.currentPage -1 }">上一页</a>
							</s:if>
							<s:else>
				首页
				上一页
			</s:else>

							<s:if test="#request.page.nextPage">
								<a
									href="student_list.action?currentPage=${page.currentPage + 1 }">下一页</a>
								<a href="student_list.action?currentPage=${page.totalPage }">尾页</a>
							</s:if>
							<s:else>
				下一页
				尾页
			</s:else><br/>
			第${page.currentPage}页，共${page.totalPage}页，每页${page.everyPage}条记录
						</div>
						</div>
					</div>
				</div>
				<div class="clear"></div>
			</div>
			<div id="footer">
				<div class="clear"></div>
				<hr />
				<p class="credit">实验管理系统</p>
			</div>
		</div>
	</div>
</body>
</html>


