<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

		<form action="${pageContext.request.contextPath }/boardinser" method="post" >
				<table>		
						<tr>
								<td>title : </td>
								<td><input type="text" name="title" id="title"></td>
						</tr>	
						<tr>
								<td>content: </td>
								<td><input type="text" name="content" id="content" class="content" ></td>
						</tr>
						<tr>
								<td>writer:</td>
								<td><input type="text" name="writer" id="writer"></td>
						</tr>
				</table>
					<input type="submit" value="전송">
					<button type="button" onblur="location.href='${pageContext.request.contextPath}/index.jsp'">취소</button>
			</form>
				
</body>
</html>