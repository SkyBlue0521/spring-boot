<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"
    isELIgnored="false"
    %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath"  value="${pageContext.request.contextPath}"  />
<%
  request.setCharacterEncoding("utf-8");
%>
<html>
<head>
<script src="${contextPath}/js/scriptTest.JSP" type="text/javascript"></script>
<meta charset="utf-8">
<title>hello.JSP 페이지</title>
</head>
<body>
안녕하세요 <br>
<h2>${message}</h2>
<img width=200 height=200 src="${contextPath}/image/butterfly.png" /> <br>
<input type="button" name="테스트" value="테스트" onClick="test();">
</body>
</html>