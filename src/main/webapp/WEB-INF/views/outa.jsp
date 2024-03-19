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
	<tr><th>번호</th><th>이름</th><th>나이</th><th>주소</th>
	<th>국어점수</th><th>영어점수</th><th>수학점수</th></tr>
	     <c:forEach items="${list}" var="li">
      <tr>
          <td>${li.bun}</td>
         <td>${li.name}</td>
         <td>${li.age}</td>
         <td>${li.address}</td>
         <td>${li.myScore_DTO.kor}</td>
         <td>${li.myScore_DTO.eng}</td>
         <td>${li.myScore_DTO.mat}</td>
      </tr>
      </c:forEach>

</table>
<a href="main">메인으로 이동</a>

</body>
</html>