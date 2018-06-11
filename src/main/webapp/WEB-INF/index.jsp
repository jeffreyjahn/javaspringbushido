<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*, java.lang.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Secret Code</title>
    <link rel="stylesheet" type="text/css" href="/css/styles.css" />
    <script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<c:if test="${ error != null }">
		<p><c:out value="${ error }"/></p>
	</c:if>
	<form action="code" method="POST">
		<input type="text" name="word">
		<input type="submit" value="Try Code">
	</form>
</body>
</html>