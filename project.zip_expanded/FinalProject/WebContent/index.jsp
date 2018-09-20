<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="check.spring" method="post">
Enter username:<input type="text" name="name"><br><br>
Enter password:<input type="password" name="password"><br><br>
TypeOfUser:
<input type="radio" name="type" value="admin">Admin
<input type="radio" name="type" value="user">user
<br><br>
<input type="submit" value="submit">
</form>

<%
String value=(String)request.getAttribute("msg");
if(value!=null)
{
	out.println(value);
}

%>
</body>
</html>