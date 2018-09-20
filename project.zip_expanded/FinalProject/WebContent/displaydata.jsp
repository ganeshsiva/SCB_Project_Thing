<%@page import="com.Trade.Bean.Trade"%>
<%@page import="java.util.Iterator" %>
<%@page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TRADE TABLE</title>
</head>
<body>
<h1><u>TRADE DETAILS:</u></h1>
<table border="ll">
<tr>
<th>SNO</th>
<th>FIRSTNAME</th>
<th>LASTNAME</th>
<th>GENDER</th>
<th>DOB</th>
<th>ACCOUNT_TYPE</th>
<th>ID_FORM</th>
<th>BANK_BRANCH</th>
<th>TRADE_PRICE</th>
<th>AADHAR_NUMBER</th>
<th>MOBILE_NUMBER</th>
</tr>
<%
List<Trade> listOfRec=(List<Trade>)request.getAttribute("data");
Iterator<Trade> itr=listOfRec.iterator();
while(itr.hasNext())
{
	Trade tt=itr.next();
	
%>
<tr>
<td><%=tt.getSNO() %></td>
<td><%=tt.getFirstName() %></td>
<td><%=tt.getLastName()%></td>
<td><%=tt.getGender() %></td>
<td><%=tt.getDOB()%></td>
<td><%=tt.getAccount_Type()%></td>
<td><%=tt.getId_Form()%></td>
<td><%=tt.getBank_Branch()%></td>
<td><%=tt.getTrade_price()%></td>
<td><%=tt.getAadhar_number()%></td>
<td><%=tt.getMobile_number()%></td>


</tr>
<%
}
%>
</table>
<br>
<form action="admin.jsp" method="post">
<input type="submit" value="back">
</form>
</body>
</html>













