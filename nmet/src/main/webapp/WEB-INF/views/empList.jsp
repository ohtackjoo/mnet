<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
			<c:forEach var="empVO" items="${alist }">
				<tr>
					<td>${empVO.ename}
					<td>${empVO.comm}
					<td>${empVO.hiredate}
					<td>${empVO.empno}
					<td>${empVO.mgr}
					<td>${empVO.job}
					<td>${empVO.deptno}
					<td>${empVO.sal}
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>