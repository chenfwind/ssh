<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>学生列表</title>
</head>
<body>
	<font color="red"><s:actionerror /></font><br/>
	<s:if test="(students==null) or (students.size()==0)">
		没有学生记录
	</s:if>
	<s:iterator value="students">
		<s:property value="name"/>&nbsp;&nbsp;
		<s:property value="age"/>&nbsp;&nbsp;
		<s:property value="sex"/><br/>
	</s:iterator>
	<br />
	<a href='<s:url value="/addStudent.jsp"/>'>新增学生</a>
</body>
</html>