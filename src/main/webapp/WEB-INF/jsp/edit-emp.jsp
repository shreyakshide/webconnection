<%@ page import="com.spring.project.UEMSpringMVC.Entity.Employee" %>

<html>
<head>
<title>Edit Employee</title>
</head>
<body>

<h2 align="center">Edit Employee</h2>

<%
Employee emp = (Employee) request.getAttribute("emp");
%>

<form action="updateemp" method="post">

<input type="hidden" name="id" value="<%= emp.getId() %>">

<table border="1" align="center">

<tr>
<td>Emp ID</td>
<td><input type="text" name="empid" value="<%= emp.getEmp_id() %>"></td>
</tr>

<tr>
<td>Name</td>
<td><input type="text" name="empname" value="<%= emp.getEmp_name() %>"></td>
</tr>

<tr>
<td>Email</td>
<td><input type="text" name="empemail" value="<%= emp.getEmp_email() %>"></td>
</tr>

<tr>
<td>Contact</td>
<td><input type="text" name="empcontactno" value="<%= emp.getEmp_contact_no() %>"></td>
</tr>

<tr>
<td>City</td>
<td><input type="text" name="empcity" value="<%= emp.getEmp_city() %>"></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Update">
</td>
</tr>

</table>

</form>

</body>
</html>