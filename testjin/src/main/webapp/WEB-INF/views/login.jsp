<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

			<form action="">
					<table>
						<tr>
							<td>id :</td>
							<td><input type="text" name="userid" id="userid" class="userid" ></td>
						</tr>
						<tr>
							<td>pw :</td>
							<td><input type="password" name="userpw" id="userpw" class="userpw"></td>
						</tr>
					</table>
					<button id="" >로그인</button>
					<button ><a href="${pageContext.request.contextPath }/index.jsp">돌아가기</button>
			</form>




</body>
</html>