<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>결과 페이지</h3>
	1 : 성공, 0 : 실패<hr>
	사용자(user_info) : ${result[0] } <br>
	시스템(system_info) : ${result[1] } <hr>
	<a href="buy_form">돌아가기</a> &nbsp;
	<a href="db_result">db확인</a>
</body>
</html>