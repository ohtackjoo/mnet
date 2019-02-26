<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<script type="text/javascript">
	function send(form) {
		if(form.userid.value==""){
			alert("아이디를 입력하세요.");
			focus.usrid();
			return false;
		}else if(form.userPwd.value==""){
			alert("비밀번호를 입력하세요.");
			focus.usrid();
			return false;
		}
		return true;
	}
</script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post" id="login"
		onsubmit="return send(this)">
		<table>
			<tr>
				<td><label for="userid">아이디 :</label> <input type="text"
					id="userid" name="userid" placeholder="아이디를 입력하세요">
			<tr>
				<td><label for="userPwd">비밀번호 :</label> <input type="password"
					id="userPwd" name="userPwd" placeholder="비밀번호를 입력하세요">
			<tr>
				<td><input type="submit" value="로그인"> 
				<input type="button" value="회원가입" onclick="location.href='<%=request.getContextPath()%>/member/join.do'">
		</table>

	</form>
</body>
</html>