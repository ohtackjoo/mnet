<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div class="firstList" style="align-content: center;">
	<h1>LIST</h1>
		<table border="1">
			<tr>
				<td>ENAME
				<td>COMM
				<td>HIREDATE
				<td>EMPNO
				<td>MGR
				<td>JOB
				<td>DEPTNO
				<td>SAL
			</tr>
<%-- 			<c:forEach var="empVO" items="${list }">
				<tr>
					<td>${empDTO.ENAME}
					<td>${empDTO.COMM}
					<td>${empDTO.HIREDATE}
					<td>${empDTO.EMPNO}
					<td>${empDTO.MGR}
					<td>${empDTO.JOB}
					<td>${empDTO.DEPTNO}
					<td>${empDTO.SAL}
				</tr>
			</c:forEach> --%>
		</table>
	</div>
	<div class="button">
		<input type="button" value="back" onclick="location.href='/Manager/main/index'">
	</div>
</body>
</html>