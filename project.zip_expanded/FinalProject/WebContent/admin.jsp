<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="csv.spring" method="post"><br><br>
<h1><u>FUNCTIONS</u></h1>
<input type="radio" name="type" value="upload">UPLOAD DATA<br><br>
<input type="radio" name="type" value="display">DISPLAY DATA</br><br>
<input type="submit" value="submit">
</form>
<br>
<%
String value=(String)request.getAttribute("msg");
if(value!=null)
{
	out.println(value);
}

%>
</body>
</html>