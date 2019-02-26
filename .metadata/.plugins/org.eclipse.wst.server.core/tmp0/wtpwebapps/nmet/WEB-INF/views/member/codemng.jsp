<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		$("#codeform").hide();
		$("#codelict").find("tr").click(function(){
			$("#codeform").show();
			var codeno=$(this).find("td:eq(0)").html();
			var codelvl=$(this).find("td:eq(1)").html();
			var upcode=$(this).find("td:eq(2)").html();
			var codename=$(this).find("td:eq(3)").html();
			var useyn=$(this).find("td:eq(4)").html();
			$("#codeno").val(codeno);
			$("#codelvl").val(codelvl);
			$("#upcode").val(upcode);
			$("#codename").val(codename);
		});
		$("#show").click(function(){
			$("#inorup").val("up");
			$("#codelvl").attr("readonly", false);
			$("#upcode").attr("readonly", false);
			$("#codename").attr("readonly", false);
			return false;
		});
		$("#insert").click(function(){
			$("#inorup").val("in");
			$("#codeno").parent().hide();
			$("#codelvl").val("");
			$("#upcode").val("");
			$("#codename").val("");
			$("#codelvl").attr("readonly", false);
			$("#upcode").attr("readonly", false);
			$("#codename").attr("readonly", false);
		});

	});
</script>
</head>
<body>
<table id="codelict">
	<tr>
		<th>코드번호</th>
		<th>코드레벨</th>
		<th>상위코드</th>
		<th>코드이름</th>
		<th>사용여부</th>
	</tr>
	<c:forEach var="vo" items="${list }">
	<tr>
		<td>${vo.CDNO}</td>
		<td>${vo.CDLVL}</td>
		<td>${vo.UPCD}</td>
		<td>${vo.CDNAME}</td>
		<td>${vo.USEYN}</td>
	</tr>
	</c:forEach>
</table>
	<form action="codemng.do" method="post" id="codeform">
		<table>
			<tr>
				<td><label for="codeno">코드번호:</label>
					<input type="text" name="codeno" id="codeno" readonly="readonly">
			<tr>
				<td><label for="codelvl">코드레벨:</label>
					<input type="text" name="codelvl" id="codelvl" readonly="readonly">
			<tr>
				<td><label for="upcode">상위코드:</label>
					<input type="text" name="upcode" id="upcode" readonly="readonly">
			<tr>
				<td><label for="codename">코드이름:</label>
					<input type="text" name="codename" id="codename" readonly="readonly">
			<tr>
				<td><label for="useyn">사용여부:</label>
					<input type="checkbox" name="useyn" id="useyn" checked="checked" readonly="readonly">
			<tr>
				<td><input type="hidden" name="inorup" id="inorup"readonly="readonly">
			<tr>
				<td>
					<input type="button" id="insert" value="추가">
					<input type="button" id="show" value="수정">
					<input type="submit" id="update" value="저장">
		</table>
	</form>
</body>
</html>