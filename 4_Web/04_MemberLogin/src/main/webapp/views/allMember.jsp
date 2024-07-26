<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="jakarta.security.auth.message.callback.SecretKeyCallback.Request"%>
<%@page import="jakarta.security.auth.message.callback.PrivateKeyCallback.Request"%>
<%@page import="java.lang.reflect.Member"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전체 회원 목록</h1>
	<a harf="/">메인 페이지로 이동</a>
		<% List<Member> list = Request.getAttribute("list"); %>
		
</body>
</html>