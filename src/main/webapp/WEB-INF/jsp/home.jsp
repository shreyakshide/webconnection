<%@ page import="java.util.List" %>
<%@ page import="com.spring.project.UEMSpringMVC.Entity.Employee" %>

<html>
<head>
<title>Home</title>
</head>
<body>

<h2>Welcome to Home Page --- VIEW ALL EMPLOYEES</h2>

<%
List<Employee> listOfEmp = (List<Employee>) request.getAttribute("emplist");

if(listOfEmp == null || listOfEmp.isEmpty()){
%>

<h3>No Employees Found</h3>

<%
}else{
%>

<table border="1">
<tr>
<th>Id</th>
<th>Emp Id</th>
<th>Name</th>
<th>Email</th>
<th>City</th>
</tr>

<%
for(Employee emp : listOfEmp){
%>

<tr>
<td><%= emp.getId() %></td>
<td><%= emp.getEmp_id() %></td>
<td><%= emp.getEmp_name() %></td>
<td><%= emp.getEmp_email() %></td>
<td><%= emp.getEmp_city() %></td>
<td>
<a href="viewemp?empid=<%= emp.getId() %>">View</a>
</td>

<td>
<a href="editemp?empid=<%= emp.getId() %>">Edit</a>
</td>

<td>
<a href="deleteemp?empid=<%= emp.getId() %>"
   onclick="return confirm('Are you sure you want to delete this employee?');">
   Delete
</a>
</td>
</tr>

<%
}
}
%>
<a href="addemp"> Add new Employee</a>
</table>

</body>
</html>