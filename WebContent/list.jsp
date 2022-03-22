<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<h1 style="margin-left:770px;">자유게시판</h1>
<table width="100%" cellpadding="0" cellspacing="0" border="1" class="table table-sm">

<tr class="table-dark">
	<td>번호</td>
	<td>이름</td>
	<td>제목</td>
	<td>날짜</td>
	<td>조회수</td>
</tr>

<c:forEach var="dto" items="${list }">
<tr class="table-success">
	<td>${dto.bId}</td>
	<td>${dto.bName}</td>
	<td>
		<c:forEach begin="1" end="${dto.bIndent}">-</c:forEach>
		<a href="content_view.do?bId=${dto.bId}" style="text-decoration:none; color:black;">${dto.bTitle}</a>
	</td>
	<td>${dto.bDate}</td>
	<td>${dto.bHit}</td>
</tr>
</c:forEach>

<tr class="table-danger">
	<td colspan="5"><a href="write_view.do" style="text-decoration:none; color:black;">글작성</a></td>
</tr>


</table>
</body>
</html>