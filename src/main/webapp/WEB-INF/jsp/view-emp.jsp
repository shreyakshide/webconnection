<%@ page import="com.spring.project.UEMSpringMVC.Entity.Employee" %>

<html>
<head>
<title>View Employee</title>
</head>
<body>

<h2 align="center">Employee Details</h2>

<%
Employee emp = (Employee) request.getAttribute("emp");
%>

<table border="1" align="center">
<tr><td>ID</td><td><%= emp.getId() %></td></tr>
<tr><td>Emp ID</td><td><%= emp.getEmp_id() %></td></tr>
<tr><td>Name</td><td><%= emp.getEmp_name() %></td></tr>
<tr><td>Email</td><td><%= emp.getEmp_email() %></td></tr>
<tr><td>Contact</td><td><%= emp.getEmp_contact_no() %></td></tr>
<tr><td>City</td><td><%= emp.getEmp_city() %></td></tr>
</table>

<br>
<center><a href="home">Back</a></center>

</body>
</html>