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
			
		<h2>전화번호 수정폼</h2>
			
		<p>전화번호를 수정하려면<br>
		아래 항목을 기입하고 "수정"버튼을 클릭하세요.
		</p>
		<!-- name은 필드값과 동일한 이름으로 설정해야 set을 통해 찾을수있다 -->
		<form action="/phonebook3/phone/update" method="get">
		이름(name): <input type="text" name="name" value="${personVo.name}"><br>
		핸드폰(hp): <input type="text" name="hp" value="${personVo.hp}"><br>
		회사(company): <input type="text" name="company" value="${personVo.company}"><br>
		코드(id): <input type="text" name="personId" value="${personVo.personId}"><br>
		<button type="submit">수정</button>
		</form>
		

	</body>
</html>