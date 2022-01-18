<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
	<body>
		<h1>[phonebook3]</h1>
			
		<h2>전화번호 등록폼</h2>
			
		<p>전화번호를 등록하려면<br>
		아래 항목을 기입하고 "등록"버튼을 클릭하세요.
		</p>
		<!-- name은 필드값과 동일한 이름으로 설정해야 set을 통해 찾을수있다 -->
		<form action="/phonebook3/phone/write" method="get">
		이름(name): <input type="text" name="name" value=""><br>
		핸드폰(hp): <input type="text" name="hp" value=""><br>
		회사(company): <input type="text" name="company" value=""><br>
		<button type="submit">전송</button><!-- 컨트롤러에 리스트로 리다이렉트 -->
		</form>
		
	</body>
</html>