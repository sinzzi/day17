<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="500px" align="center">
	<caption>정보출력</caption>
	<tr><th>아이디</th><th>이름</th><th>전화</th>
	<th>총점</th><th>직위</th><th>수령액</th></tr>
	     <c:forEach items="${list}" var="li">
      <tr>
         <td>${li.id}</td>
         <td>${li.name}</td>
         <td>${li.tel}</td>
         <td>${li.scoreDTO.tot}</td>
         <td>${li.insaDTO.jik}</td>
         <td>${li.insaDTO.hap}</td>
      </tr>
      </c:forEach>

</table>
<a href="main">메인으로 이동</a>

</body>
</html>