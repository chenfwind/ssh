<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>新增学生</title>
</head>
<body>
	<s:form action="addStudent" namespace="/studentmanage" method="post">
		学生姓名：<s:textfield name="student.name"/><br/>
		学生年龄：<s:textfield name="student.age"/><br/>
		学生性别：<s:radio name="student.sex" list="#{'BOY':'男','GIRL':'女'}" listKey="key" listValue="value" value="'BOY'"/><br/>
		<font color="red"><s:actionerror /></font><br/>
		<s:submit value="保存"/>&nbsp;&nbsp;<s:reset value="重置"/>
	</s:form>
	<br />
	<s:a action="listStudent" namespace="/studentmanage">查看所有学生</s:a>
</body>
</html>