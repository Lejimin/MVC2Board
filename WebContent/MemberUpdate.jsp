<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<center>
		<h2> 회원정보수정 </h2>
		<p>아이디와 이메일은 유지!</p>
		<form action="update.do" method="post">
			<table width="500" border="1" bordercolor="gray">
				<tr height="40">
					<td width="150" align="center"> 아이디 </td>
					<td width="250"><input type="text" name="id"></td>
				</tr>
				<tr height="40">
					<td width="150" align="center"> 패스워드 </td>
					<td width="250"><input type="password" name="password"></td>
				</tr>
				<tr height="40">
					<td width="150" align="center"> 이름 </td>
					<td width="250"><input type="text" name="name"></td>
				</tr>
				<tr height="40">
					<td width="150" align="center"> 이메일 </td>
					<td width="250"><input type="email" name="eMail"></td>
				</tr>
				<tr height="40">
					<td width="150" align="center"> 주소 </td>
					<td width="250"><input type="text" name="address"></td>
				</tr>
				<tr height="40">
					<td colspan="2" align="center"><input type="submit" value="수정"></td>
				</tr>
			</table>
		</form>
		
		<form action="delete.do" method="post">
			<table width="500" border="1" bordercolor="gray">
				<tr height="40">
					<td width="150" align="center"> 아이디 </td>
					<td width="250"><input type="text" name="id"></td>
				</tr>
				<tr height="40">
					<td colspan="2" align="center"><input type="submit" value="삭제"></td>
				</tr>
			</table>
		</form>
	</center>
</body>
</html>