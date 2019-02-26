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
		var ck=""
		$("#CKID").click(function(){    
			var ID=$("#userid").val();
			console.log(ID)
			$.ajax({
				type:"post",
				url:"joinCheck.do",
				data:{'ID':ID},
				contentType: "application/x-www-form-urlencoded; charset=UTF-8",
				dataType : "json",
				success:function(data){
		            console.log("success");
		            alert(decodeURIComponent(data.msg));
		            ck="1";
		        },
		        error: function (XMLHttpRequest, textStatus, errorThrown){
		            alert('서버와의 통신이 원할하지 않습니다.\n다시 시도 해 주십시오.' );
		        }
			});
		});
		$("#sub").click(function send() {
			var $userid=$("#userid").val();
			var $userPwd=$("#userPwd").val();
			var $userPwdCk=$("#userPwdCk").val();
			var $userName=$("#userName").val();
			if($userid==""){
				alert("아이디를 입력하세요.");
				event.preventDefault();
				focus.usrid();
				return false;
			}else if($userPwd==""){
				alert("비밀번호를 입력하세요.");
				event.preventDefault();
				focus.userPwd();
				return false;
			}else if($userPwdCk==""){
				alert("비밀번호확인을 입력하세요.");
				event.preventDefault();
				focus.userPwdCk();
				return false;
			}else if($userName==""){
				alert("성명을 입력하세요.");
				event.preventDefault();
				focus.userName();
				return false;
			}
			if($userPwd.length<5 || $userPwd.length>10){
				alert("비밀번호 형식이 올바르지 않습니다.\n 비밀번호는 5자리이상 10자리이하여야 합니다.");
				event.preventDefault();
				focus.userPwd();
				return false;
			}
			if($userPwd!=$userPwdCk){
				alert("비밀번호 불일치.");
				event.preventDefault();
				focus.userPwd();
				return false;
			}
			if(ck==""){
				alert("아이디 중복확인을 클릭하세요.");
				event.preventDefault();
				focus.userPwd();
				return false;
			}
			return true;
		});
	});
</script>
</head>
<body>
<form action="join.do" method="post" id="join">
	<label for="userid">아이디:</label>
	<input type="text" placeholder="아이디를 입력하세요" name="userid" id="userid">
	<input type="button" id="CKID" value="중복확인"><br/>
	<label for="userPwd">비밀번호:</label>
	<input type="password" placeholder="비밀번호를 입력하세요" name="userPwd" id="userPwd"><br/>
	<p>#비밀번호는 5자리이상 10자리 이하여야 합니다.<br/>
	<label for="userPwdCk">비밀번호확인:</label>
	<input type="password" placeholder="비밀번호를 입력하세요" name="userPwdCk" id="userPwdCk"><br/>
	<label for="userName">성명:</label>
	<input type="text" placeholder="비밀번호를 입력하세요" name="userName" id="userName"><br/>
	<input type="submit" value="저장" id="sub"> 
</form>
</body>
</html>