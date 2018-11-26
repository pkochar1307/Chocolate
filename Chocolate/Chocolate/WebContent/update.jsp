<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="sf" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Update Chocolate details </h1>
<table>
<sf:form action="updateChocAction" modelAttribute="choc">
<tr><td>Chocolate Id:<sf:input path="chocId" readonly="readonly"/>
<tr><td>Chocolate name:<sf:input path="chocName"/>
<tr><td>Chocolate Price:<sf:input path="chocPrice"/>
<tr><td>Chocolate quantity:<sf:input path="chocQty"/>
<tr><td><input type="submit" value="Update">
</sf:form>
</table>




</body>
</html>