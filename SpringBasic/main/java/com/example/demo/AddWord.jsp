<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>add-user.jsp</h2>
	<form:form action="addword" method="POST" modelAttribute="word">
		Word: <form:input path="word"/> <form:errors path="name" cssClass="error"/> <br/><br/>
		Email: <form:input path="mean"/> <form:errors path="email" cssClass="error"/> <br/><br/>	
     <button type="submit">Submit</button>
	</form:form>
</body>
</html>