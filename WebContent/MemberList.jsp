<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<center>
		<h2> 리스트 </h2>
		<form action="list.do" method="post">
			<table width="600" border="1" bordercolor="gray">
				<tr height="40">
					<td width="200px" align="center"> 아이디 </td>
					<td width="200px" align="center"> 패스워드 </td>
					<td width="200px" align="center"> 이름 </td>
					<td width="200px" align="center"> 이메일 </td>
					<td width="200px" align="center"> 가입시간 </td>
					<td width="200px" align="center"> 주소 </td>				
				</tr>
				<c:forEach var="v" items="${v }">
					<tr height="40">
						<td width="200px" align="center">${v.id }</td>
						<td width="200px" align="center">${v.pw }</td>
						<td width="200px" align="center">${v.name }</td>
						<td width="200px" align="center"><a href="MemberUpdate.jsp">${v.eMail }</a></td>
						<td width="200px" align="center">${v.rDate }</td>
						<td width="200px" align="center">${v.address }</td>
					</tr>
				</c:forEach>
			</table>
		</form>
	</center>
</body>
</html>