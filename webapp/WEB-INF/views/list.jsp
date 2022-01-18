<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
           <!-- 이걸 써야 jstl 쓸수있음 -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="com.javaex.vo.PersonVo"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>[phonebook3]</h1>
	
	<h2>전화번호 리스트</h2>

	<p>입력한 정보 내역입니다.</p>

		<c:forEach items="${requestScope.personList}" var="personVo"><!-- requestScope 생략가능 -->
		<table border="1">
			<tr>
				<td>이름(name)</td>
				<td>${personVo.name}</d>
			</tr>
			<tr>
				<td>핸드폰(hp)</td>
				<td>${personVo.hp}</td>
			</tr>
			<tr>
				<td>회사(company)</td>
				<td>${personVo.company}</td>
			</tr>
			<tr>
				<td><a href="/phonebook3/phone/updateForm">수정</a></td>
				<td><a href="/phonebook3/phone/delete">삭제</a></td>
			</tr>
			
		</table>
		<br>
		</c:forEach>
		
		<a href="/phonebook3/phone/writeForm">번호등록</a>
</body>
</html>