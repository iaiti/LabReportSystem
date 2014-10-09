<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
.STYLE1 {color: #0000FF}
</style>
<script type="text/javascript">
function checkRadio(role){
		 document.getElementById("classname").disabled = true;
		 document.getElementById("classname").style.display = "none";
}
function check(role){
	 document.getElementById("classname").disabled =false;
		 document.getElementById("classname").style.display ="";;
}

</script>
</head>

<body>
<div>
<h1 class="STYLE1">Web实验报告系统--用户注册 </h1>

<form action="register"  method="post">
<table width="446" border="1" align="center" cellspacing="0">
  <tr>
    <td width="180" height="40" align="center">学号/教工号</td>
    <td width="257" align="center">
      <input name="loginid" type="text" class="textfield" id="textfield" maxlength="13" />
    </td>
  </tr>
  <tr>
    <td height="40" align="center">姓名</td>
    <td align="center">
      <input name="name" type="text" class="textfield" id="textfield3" maxlength="13" />
    </td>
  </tr>

  <tr>
    <td height="40" align="center">邮箱</td>
    <td align="center">
       <input name="email" type="text" class="textfield" id="textfield3" maxlength="20" />
    </td>
  </tr>
  <tr>
    <td height="60" align="center">类型</td>
    <td align="center">
      <p>
        <label>
          <input type="radio" name="role" value="1" id="RadioGroup1_0"  checked onclick="check()"/>
          学生</label><br />
        <label>
          <input type="radio" name="role" value="2" id="RadioGroup1_1"  checked onclick="checkRadio()" />
          教师</label>
        <br />
    </td>
  </tr>
    <tr>
    <td height="40" align="center">学院名</td>
    <td align="center">
        <select name="ccollegename" id="collegename" multiple="multiple">   
        <OPTION value='http://pg.zhku.edu.cn/inforwork/index.asp'>
	计算机科学与工程学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/guangli/index.htm'>
	管理学院
</OPTION>

<OPTION value='http://en4a.zhku.edu.cn/english/'>
	外国语学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/jidianxi/index.html'>
	机电工程学院
</OPTION>

<OPTION value='http://www.hxhgx.com/'>
	化学化工学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/information/index.htm'>
	信息学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/yisu/index.html'>
	艺术设计学院
</OPTION>

<OPTION value='http://pg.zhku.edu.cn/economy/index.asp'>
	经贸学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/nxy/index.html'>
	农学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/nonglin/index.html'>
	园艺园林学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/nongxue/index.htm'>
	生命科学学院
</OPTION>

<OPTION value='http://www.qgspxy.com/index.htm'>
	轻工食品学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/zhihuan/index.htm'>
	环境科学与工程学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/csjs/index.htm'>
	城市建设学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/jishuanxi/index.htm'>
	计算科学学院
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/sheke/index.htm'>
	人文社会科学系
</OPTION>

<OPTION value='http://www.zhku.edu.cn/depa/sport/index.html'>
	体育部
</OPTION>
        </select>
    </td>
  </tr>
    <tr>
    <td height="40" align="center">专业班级</td>
    <td align="center">
      <select name="classname" id="classname" multiple="multiple">   
<option value="2010040901">包装101</option>
<option value="2010040902">包装102</option>
<option value="2011040901">包装111班</option>
<option value="2012040901">包装121班</option>
<option value="2013040901">包装131班</option>
<option value="2011090701">材化111班</option>
<option value="2012090701">材化121班</option>
<option value="2012090702">材化122班</option>
<option value="2013090701">材化131班</option>
<option value="2010090701">材料101</option>
<option value="2010090702">材料102</option>
<option value="2010061001">财务101</option>
<option value="2010061002">财务102</option>
<option value="2010061003">财务103</option>
<option value="2010061004">财务104</option>
<option value="2011061001">财务111班</option>
<option value="2011061002">财务112班</option>
<option value="2011061003">财务113班</option>
<option value="2011061004">财务114班</option>
<option value="2012061001">财务121班</option>
<option value="2012061002">财务122班</option>
<option value="2012061003">财务123班</option>
<option value="2012061004">财务124班</option>
<option value="2012061005">财务125班</option>
<option value="2013061001">财务131班</option>
<option value="2013061002">财务132班</option>
<option value="2013061003">财务133班</option>
<option value="2010021001">草业101</option>
<option value="2010021002">草业102</option>
<option value="2011021001">草业111班</option>
<option value="2012330101">草业121班</option>
<option value="2012330102">草业122班</option>
<option value="2013330101">草业131班</option>
<option value="2013330102">草业132班</option>
<option value="2013100701">产品设计131班</option>
<option value="2013100702">产品设计132班</option>
<option value="2013100703">产品设计133班</option>
<option value="2010010601">城规101</option>
<option value="2010010602">城规102</option>
<option value="2011010601">城规111班</option>
<option value="2011010602">城规112班</option>
<option value="2012010601">城规121班</option>
<option value="2012010602">城规122班</option>
<option value="2013010601">城规131班</option>
<option value="2013010602">城规132班</option>
<option value="2013010603">城规133班</option>
<option value="2011210201">电子111班</option>
<option value="2011210202">电子112班</option>
<option value="2011210203">电子113班</option>
<option value="2011210204">电子114班</option>
<option value="2012210201">电子121班</option>
<option value="2012210202">电子122班</option>
<option value="2012210203">电子123班</option>
<option value="2013210201">电子131班</option>
<option value="2013210202">电子132班</option>
<option value="2013210203">电子133班</option>
<option value="2013210204">电子134班</option>
<option value="2010210201">电子信息101</option>
<option value="2010210203">电子信息102</option>
<option value="2010210202">电子信息103</option>
<option value="2010021101">动科101</option>
<option value="2011020601">动科111班</option>
<option value="2012251801">动科121班</option>
<option value="2012251802">动科122班</option>
<option value="2013251801">动科131班</option>
<option value="2012021101">动物科学121班</option>
<option value="2012021102">动物科学122班</option>
<option value="2010090301">高分子101</option>
<option value="2010090302">高分子102</option>
<option value="2010090303">高分子103</option>
<option value="2011090301">高分子111班</option>
<option value="2011090302">高分子112班</option>
<option value="2012090301">高分子121班</option>
<option value="2012090302">高分子122班</option>
<option value="2012090303">高分子123班</option>
<option value="2013090301">高分子131班</option>
<option value="2013090302">高分子132班</option>
<option value="2013090303">高分子133班</option>
<option value="2010240201">给排水101</option>
<option value="2010240202">给排水102</option>
<option value="2011240201">给排水111班</option>
<option value="2011240202">给排水112班</option>
<option value="2012240201">给排水121班</option>
<option value="2012240202">给排水122班</option>
<option value="2013240201">给排水131班</option>
<option value="2013240202">给排水132班</option>
<option value="2013240203">给排水133班</option>
<option value="2010060901">工管101</option>
<option value="2010060902">工管102</option>
<option value="2010060903">工管103</option>
<option value="2011060901">工管111班</option>
<option value="2011060902">工管112班</option>
<option value="2011060903">工管113班</option>
<option value="2012060901">工管121班</option>
<option value="2012060902">工管122班</option>
<option value="2012060903">工管123班</option>
<option value="2012060904">工管124班</option>
<option value="2013060901">工管131班</option>
<option value="2013060902">工管132班</option>
<option value="2013060903">工管133班</option>
<option value="2013050801">工化131班</option>
<option value="2013050802">工化132班</option>
<option value="2010100401">工业设计101</option>
<option value="2010100402">工业设计102</option>
<option value="2010100403">工业设计103</option>
<option value="2011100401">工业设计111班(实验班)</option>
<option value="2011100402">工业设计112班</option>
<option value="2011100403">工业设计113班</option>
<option value="2012100401">工业设计121班</option>
<option value="2012100402">工业设计122班</option>
<option value="2012100403">工业设计123班</option>
<option value="2010050801">工业自动化101</option>
<option value="2010050802">工业自动化102</option>
<option value="2011050801">工业自动化111班</option>
<option value="2011050802">工业自动化112班</option>
<option value="2012050801">工业自动化121班</option>
<option value="2012050802">工业自动化122班</option>
<option value="2011320101">国贸（会展经济）115班</option>
<option value="2011320102">国贸（会展经济）116班</option>
<option value="2011320103">国贸（会展经济）117班</option>
<option value="2012320101">国贸（会展经济）126班</option>
<option value="2012320102">国贸（会展经济）127班</option>
<option value="2013320101">国贸（会展经济）131班</option>
<option value="2013320102">国贸（会展经济）132班</option>
<option value="2013320103">国贸（会展经济）133班</option>
<option value="2013320104">国贸（会展经济）134班</option>
<option value="2013320105">国贸（会展经济）135班</option>
<option value="2010060801">国贸101</option>
<option value="2010060802">国贸102</option>
<option value="2010060803">国贸103</option>
<option value="2010060804">国贸104</option>
<option value="2010060805">国贸105</option>
<option value="2010060806">国贸106</option>
<option value="2011060801">国贸111班</option>
<option value="2011060802">国贸112班</option>
<option value="2011060803">国贸113班</option>
<option value="2011060804">国贸114班</option>
<option value="2011060805">国贸118班</option>
<option value="2012060801">国贸121班</option>
<option value="2012060802">国贸122班</option>
<option value="2012060803">国贸123班</option>
<option value="2012060804">国贸124班</option>
<option value="2012060805">国贸125班</option>
<option value="2013060801">国贸131班</option>
<option value="2013060802">国贸132班</option>
<option value="2013060803">国贸133班</option>
<option value="2013060804">国贸134班</option>
<option value="2013060805">国贸135班</option>
<option value="2010090601">化工101</option>
<option value="2010090602">化工102</option>
<option value="2011090601">化工111班</option>
<option value="2011090602">化工112班</option>
<option value="2012090601">化工121班</option>
<option value="2012090602">化工122班</option>
<option value="2013090601">化工131班</option>
<option value="2013090602">化工132班</option>
<option value="2013090603">化工133班</option>
<option value="2010030501">环工101</option>
<option value="2010030502">环工102</option>
<option value="2010030503">环工103</option>
<option value="2011030501">环工111班</option>
<option value="2011030502">环工112班</option>
<option value="2011030503">环工113班</option>
<option value="2012030501">环工121班</option>
<option value="2012030502">环工122班</option>
<option value="2012030503">环工123班</option>
<option value="2013030501">环工131班</option>
<option value="2013030502">环工132班</option>
<option value="2013030503">环工133班</option>
<option value="2013100601">环境设计131班</option>
<option value="2013100602">环境设计132班</option>
<option value="2013100603">环境设计133班</option>
<option value="2010100201">环境艺术设计101</option>
<option value="2010100202">环境艺术设计102</option>
<option value="2010100203">环境艺术设计103</option>
<option value="2011100201">环境艺术设计111班</option>
<option value="2011100202">环境艺术设计112班</option>
<option value="2011100203">环境艺术设计113班</option>
<option value="2012100201">环境艺术设计121班</option>
<option value="2012100202">环境艺术设计122班</option>
<option value="2012100203">环境艺术设计123班</option>
<option value="2010260701">环科101</option>
<option value="2010260702">环科102</option>
<option value="2011260701">环科111班</option>
<option value="2012260701">环科121班</option>
<option value="2012260702">环科122班</option>
<option value="2013260701">环科131班</option>
<option value="2010061201">会计101</option>
<option value="2010061202">会计102</option>
<option value="2010061203">会计103</option>
<option value="2010061204">会计104</option>
<option value="2010061205">会计105</option>
<option value="2010061206">会计106</option>
<option value="2011061201">会计111班</option>
<option value="2011061202">会计112班</option>
<option value="2011061203">会计113班</option>
<option value="2011061204">会计114班</option>
<option value="2011061205">会计115班</option>
<option value="2012061201">会计121班</option>
<option value="2012061202">会计122班</option>
<option value="2012061203">会计123班</option>
<option value="2012061204">会计124班</option>
<option value="2012061205">会计125班</option>
<option value="2012061206">会计126班</option>
<option value="2013061201">会计131班</option>
<option value="2013061202">会计132班</option>
<option value="2013061203">会计133班</option>
<option value="2010050601">机械101</option>
<option value="2010050602">机械102</option>
<option value="2010050603">机械103</option>
<option value="2010050604">机械104</option>
<option value="2012051001">机械121班</option>
<option value="2012051002">机械122班</option>
<option value="2012051003">机械123班</option>
<option value="2012051004">机械124班</option>
<option value="2012051005">机械125班</option>
<option value="2013051001">机械131班</option>
<option value="2013051002">机械132班</option>
<option value="2013051003">机械133班</option>
<option value="2013051004">机械134班</option>
<option value="2013051005">机械135班</option>
<option value="2013051006">机械136班</option>
<option value="2010050701">机械电子101</option>
<option value="2010050702">机械电子102</option>
<option value="2011050701">机械电子111班</option>
<option value="2011050702">机械电子112班</option>
<option value="2011050601">机械设计111班</option>
<option value="2011050602">机械设计112班</option>
<option value="2011050603">机械设计113班</option>
<option value="2011050604">机械设计114班</option>
<option value="2010070201">计算机101</option>
<option value="2010070202">计算机102</option>
<option value="2010070203">计算机103</option>
<option value="2010070204">计算机104</option>
<option value="2010070205">计算机105</option>
<option value="2011070201">计算机111班</option>
<option value="2011070202">计算机112班</option>
<option value="2011070203">计算机113班</option>
<option value="2011070204">计算机114班</option>
<option value="2011070205">计算机115班</option>
<option value="2012070201">计算机121班</option>
<option value="2012070202">计算机122班</option>
<option value="2012070203">计算机123班</option>
<option value="2013070201">计算机131班</option>
<option value="2013070202">计算机132班</option>
<option value="2013070203">计算机133班</option>
<option value="2013051201">能源131班</option>
<option value="2013051202">能源132班</option>
<option value="2013051101">能源133班</option>
<option value="2013051102">能源134班</option>
<option value="2010061101">农经101</option>
<option value="2010061102">农经102</option>
<option value="2010061103">农经103</option>
<option value="2011061101">农经111班</option>
<option value="2011061102">农经112班</option>
<option value="2011061103">农经113班</option>
<option value="2012061101">农经121班</option>
<option value="2012061102">农经122班</option>
<option value="2012061103">农经123班</option>
<option value="2012061104">农经124班</option>
<option value="2013061101">农经131班</option>
<option value="2013061102">农经132班</option>
<option value="2013061103">农经133班</option>
<option value="2010020101">农学101</option>
<option value="2010020102">农学102</option>
<option value="2011020101">农学111班</option>
<option value="2011020102">农学112班</option>
<option value="2012020101">农学121班</option>
<option value="2012020102">农学122班</option>
<option value="2013020101">农学131班</option>
<option value="2013020102">农学132班</option>
<option value="2010050101">热能101</option>
<option value="2010050102">热能102</option>
<option value="2011050401">热能111班</option>
<option value="2011050402">热能112班</option>
<option value="2012050401">热能121班</option>
<option value="2012050402">热能122班</option>
<option value="2010061301">人力101</option>
<option value="2010061302">人力102</option>
<option value="2011061301">人力111班</option>
<option value="2011061302">人力112班</option>
<option value="2011061303">人力113班</option>
<option value="2012061301">人力121班</option>
<option value="2012061302">人力122班</option>
<option value="2012061303">人力123班</option>
<option value="2013061301">人力131班</option>
<option value="2013061302">人力132班</option>
<option value="2013061303">人力133班</option>
<option value="2010080301">日语101</option>
<option value="2010080302">日语102</option>
<option value="2011080301">日语111班</option>
<option value="2011080302">日语112班</option>
<option value="2012080301">日语121班</option>
<option value="2012080302">日语122班</option>
<option value="2013080601">日语131班</option>
<option value="2013080602">日语132班</option>
<option value="2013080501">商英131班</option>
<option value="2013080502">商英132班</option>
<option value="2013080503">商英133班</option>
<option value="2010040801">生工101</option>
<option value="2010040802">生工102</option>
<option value="2011040801">生工111班</option>
<option value="2011040802">生工112班</option>
<option value="2012040802">生工121班</option>
<option value="2012040801">生工122班</option>
<option value="2013040801">生工131班</option>
<option value="2010020501">生技101</option>
<option value="2010020502">生技102</option>
<option value="2011020501">生技111班</option>
<option value="2012251701">生技121班</option>
<option value="2012251702">生技122班</option>
<option value="2013251701">生技131班</option>
<option value="2010021301">生科101</option>
<option value="2010021302">生科102</option>
<option value="2011021301">生科111班</option>
<option value="2012251501">生科121班</option>
<option value="2012251502">生科122班</option>
<option value="2013251901">生科131班</option>
<option value="2010040101">食品101</option>
<option value="2010040102">食品102</option>
<option value="2011040101">食品111班</option>
<option value="2011040102">食品112班</option>
<option value="2012040101">食品121班</option>
<option value="2012040102">食品122班</option>
<option value="2013040101">食品131班</option>
<option value="2013040102">食品132班</option>
<option value="2013040103">食品133班</option>
<option value="2010060101">市营101</option>
<option value="2010060102">市营102</option>
<option value="2010060103">市营103</option>
<option value="2010060104">市营104</option>
<option value="2011060101">市营111班</option>
<option value="2011060102">市营112班</option>
<option value="2011060103">市营113班</option>
<option value="2012060101">市营121班</option>
<option value="2012060102">市营122班</option>
<option value="2012060103">市营123班</option>
<option value="2012060104">市营124班</option>
<option value="2013060101">市营131班</option>
<option value="2013060102">市营132班</option>
<option value="2013060103">市营133班</option>
<option value="2013100801">视觉传达131班</option>
<option value="2013100802">视觉传达132班</option>
<option value="2013100803">视觉传达133班</option>
<option value="2010100502">视觉传达设计104</option>
<option value="2010100501">视觉传达设计105</option>
<option value="2010100503">视觉传达设计106</option>
<option value="2011100501">视觉传达设计114班</option>
<option value="2011100502">视觉传达设计115班</option>
<option value="2011100503">视觉传达设计116班</option>
<option value="2012100501">视觉传达设计124班</option>
<option value="2012100502">视觉传达设计125班</option>
<option value="2012100503">视觉传达设计126班</option>
<option value="2013252001">水产131班</option>
<option value="2010070601">通信101</option>
<option value="2010070602">通信102</option>
<option value="2010070603">通信103</option>
<option value="2011070601">通信111班</option>
<option value="2011070602">通信112班</option>
<option value="2011070603">通信113班</option>
<option value="2011070604">通信114班</option>
<option value="2012070601">通信121班</option>
<option value="2012070602">通信122班</option>
<option value="2012070603">通信123班</option>
<option value="2012070604">通信124班</option>
<option value="2013070601">通信131班</option>
<option value="2013070602">通信132班</option>
<option value="2013070603">通信133班</option>
<option value="2010110201">统计101</option>
<option value="2010110202">统计102</option>
<option value="2010110203">统计103</option>
<option value="2011110201">统计111班</option>
<option value="2011110202">统计112班</option>
<option value="2012110201">统计121班</option>
<option value="2012110202">统计122班</option>
<option value="2013110201">统计131班</option>
<option value="2013110202">统计132班</option>
<option value="2010061601">投资101</option>
<option value="2010061602">投资102</option>
<option value="2010061603">投资103</option>
<option value="2011061601">投资111班</option>
<option value="2011061602">投资112班</option>
<option value="2011061603">投资113班</option>
<option value="2011061604">投资114班</option>
<option value="2012061601">投资121班</option>
<option value="2012061602">投资122班</option>
<option value="2012061603">投资123班</option>
<option value="2013061601">投资131班</option>
<option value="2013061602">投资132班</option>
<option value="2013061603">投资133班</option>
<option value="2013061604">投资134班</option>
<option value="2010240301">土木101</option>
<option value="2010240302">土木102</option>
<option value="2010240303">土木103</option>
<option value="2011240301">土木111班</option>
<option value="2011240302">土木112班</option>
<option value="2012240301">土木121班</option>
<option value="2012240302">土木122班</option>
<option value="2012240303">土木123班</option>
<option value="2012240304">土木124班</option>
<option value="2013240301">土木131班</option>
<option value="2013240302">土木132班</option>
<option value="2013240303">土木133班</option>
<option value="2013240304">土木134班</option>
<option value="2010070501">网络101</option>
<option value="2010070502">网络102</option>
<option value="2011230201">网络111班</option>
<option value="2011230202">网络112班</option>
<option value="2011230203">网络113班</option>
<option value="2012230201">网络121班</option>
<option value="2012230202">网络122班</option>
<option value="2013070501">网络131班</option>
<option value="2013070502">网络132班</option>
<option value="2013370101">物联网131班</option>
<option value="2013370102">物联网132班</option>
<option value="2010211101">信管101</option>
<option value="2010211102">信管102</option>
<option value="2010211103">信管103</option>
<option value="2011211101">信管111班</option>
<option value="2011211102">信管112班</option>
<option value="2011211103">信管113班</option>
<option value="2012211101">信管121班</option>
<option value="2012211102">信管122班</option>
<option value="2012211103">信管123班</option>
<option value="2013211101">信管131班</option>
<option value="2013211102">信管132班</option>
<option value="2013211103">信管133班</option>
<option value="2010110101">信计101</option>
<option value="2010110102">信计102</option>
<option value="2010110103">信计103</option>
<option value="2011110101">信计111班</option>
<option value="2011110102">信计112班</option>
<option value="2011110103">信计113班</option>
<option value="2011110104">信计114班</option>
<option value="2012110101">信计121班</option>
<option value="2012110102">信计122班</option>
<option value="2012110103">信计123班</option>
<option value="2012110104">信计124班</option>
<option value="2013110101">信计131班</option>
<option value="2013110102">信计132班</option>
<option value="2013110103">信计133班</option>
<option value="2013110104">信计134班</option>
<option value="2011120101">行管111班</option>
<option value="2011120102">行管112班</option>
<option value="2011120103">行管113班</option>
<option value="2012120101">行管121班</option>
<option value="2012120102">行管122班</option>
<option value="2012120103">行管123班</option>
<option value="2013120101">行管131班</option>
<option value="2013120102">行管132班</option>
<option value="2013120103">行管133班</option>
<option value="2010120101">行政管理101</option>
<option value="2010120102">行政管理102</option>
<option value="2010090501">应化101</option>
<option value="2010090502">应化102</option>
<option value="2011090501">应化111班</option>
<option value="2011090502">应化112班</option>
<option value="2012090501">应化121班</option>
<option value="2012090502">应化122班</option>
<option value="2012090503">应化123班</option>
<option value="2013090501">应化131班</option>
<option value="2013090502">应化132班</option>
<option value="2013090503">应化133班</option>
<option value="2013090801">应化技术131班</option>
<option value="2013090802">应化技术132班</option>
<option value="2010080202">英语（国际商务）102</option>
<option value="2010080203">英语（国际商务）103</option>
<option value="2010080204">英语（国际商务）104</option>
<option value="2010080205">英语（国际商务）105</option>
<option value="2011080201">英语（国际商务）113班</option>
<option value="2011080202">英语（国际商务）114班</option>
<option value="2011080203">英语（国际商务）115班</option>
<option value="2012080201">英语（国际商务）122班</option>
<option value="2012080202">英语（国际商务）123班</option>
<option value="2012080203">英语（国际商务）124班</option>
<option value="2012080204">英语（国际商务）125班</option>
<option value="2010080101">英语（旅游管理）101</option>
<option value="2011080101">英语（旅游管理）111班</option>
<option value="2011080102">英语（旅游管理）112班</option>
<option value="2012080101">英语（旅游管理）121班</option>
<option value="2013080401">英语131班</option>
<option value="2013080402">英语132班</option>
<option value="2010010201">园林101</option>
<option value="2010010202">园林102</option>
<option value="2010010203">园林103</option>
<option value="2010010204">园林104</option>
<option value="2011010201">园林111班</option>
<option value="2011010202">园林112班</option>
<option value="2011010203">园林113班</option>
<option value="2012010201">园林121班</option>
<option value="2012010202">园林122班</option>
<option value="2012010203">园林123班</option>
<option value="2012010204">园林124班</option>
<option value="2013010201">园林131班</option>
<option value="2013010202">园林132班</option>
<option value="2013010203">园林133班</option>
<option value="2013010204">园林134班</option>
<option value="2010010101">园艺101</option>
<option value="2010010102">园艺102</option>
<option value="2011010101">园艺111班</option>
<option value="2011010102">园艺112班</option>
<option value="2012010101">园艺121班</option>
<option value="2012010102">园艺122班</option>
<option value="2013010101">园艺131班</option>
<option value="2013010102">园艺132班</option>
<option value="2010030101">植保101</option>
<option value="2010030102">植保102</option>
<option value="2011030101">植保111班</option>
<option value="2011030102">植保112班</option>
<option value="2012030101">植保121班</option>
<option value="2012030102">植保122班</option>
<option value="2013030101">植保131班</option>
<option value="2013030102">植保132班</option>
<option value="2010040501">质安101</option>
<option value="2010040502">质安102</option>
<option value="2011040501">质安111班</option>
<option value="2011040502">质安112班</option>
<option value="2012040501">质安121班</option>
<option value="2012040502">质安122班</option>
<option value="2013040501">质安131班</option>
<option value="2013040502">质安132班</option>
<option value="2013040503">质安133班</option>
<option value="2013220401">种子科学与工程131班</option>
<option value="2010211401">自动化101</option>
<option value="2010211402">自动化102</option>
<option value="2011211401">自动化111班</option>
<option value="2011211402">自动化112班</option>
<option value="2012211401">自动化121班</option>
<option value="2012211402">自动化122班</option>
<option value="2012211403">自动化123班</option>
<option value="2013211401">自动化131班</option>
<option value="2013211402">自动化132班</option>
<option value="2013211403">自动化133班</option>
<option value="2013211404">自动化134班</option>           
      </select>   
    </td>
  </tr>
  <tr>
    <td height="40" align="center">密码</td>
    <td align="center">
      <input name="password" type="password" class="textfield" id="textfield2" maxlength="13" />
    </td>
  </tr>
  <tr>
    <td height="40" align="center">确认密码</td>
    <td align="center">
      <input name="repassword" type="password" class="textfield" id="textfield3" maxlength="13" />
    </td>
  </tr>
  <tr>
    <td height="60" align="center">
       <input type="submit"  value="注册">
    </td>
    <td align="center">
      <input name="button2" type="submit" class="button" id="button2" value="重写" />
    </td>
  </tr>
</table>
  </form>
</div>
</body>
</html>