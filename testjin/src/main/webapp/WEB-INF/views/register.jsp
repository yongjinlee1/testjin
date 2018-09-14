<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

			<form action="${pageContext.request.contextPath }/register" method="post" name="aaa">
				<table>		
						<tr>
								<td>id : </td>
								<td><input type="text" name="userid" id="id" placeholder="id 입력해주세요"></td>
						</tr>	
						<tr>
								<td>pw: </td>
								<td><input type="password" name="userpw" id="pw" class="pw" placeholder = "pw 6에서 16자 입력해주세요"></td>
						</tr>
						<tr>
								<td>이름:</td>
								<td><input type="text" name="username" id="name" placeholde="이름을 입력해주세요"></td>
						</tr>
						<tr>
								<td>이메일:</td>
								<td><input type="text" name="email" id="email"></td>
						</tr>
						
				</table>
					<input type="submit" value="전송">
					<button type="button" onblur="location.href='${pageContext.request.contextPath}/index.jsp'">취소</button>
			</form>



</body>
<!-- 	
<script type="text/javascript">
		
	var form  =  document.aaa;
	
	function testcheck() {
		
		
		if (idcheck() == false) {
			return ;
		}
		
		if (pwcheck() == false) {
			
			return ;
		}
		
		
		
		
	}
	
	
	function idcheck() {
		
		//var idck = form.id.value();
		
		var idck = document.getElementById('id');
		
		
		if (idck == '') {
			
			alert('id를 입력하세요');
			idck.focus();
			return false;	
		}
		return true;
		
	}
	
	function pwcheck() {
		
		var pwck = document.getElementById('pw');
		
		if (pwck == '') {
			
			alert('pw를 입력하세요');
			pwck.focus();
			return false;
		}
		return true;
		
	}





</script> -->

</html>