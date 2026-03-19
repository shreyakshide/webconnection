<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Employee</title>
</head>
<body bgcolor="powderblue">

<form action="createemp" method="post">
<table align="center" border="1" cellpadding="10">

<tr>
<td colspan="2" align="center"><b>Register Employee</b></td>
</tr>

<tr>
<td>Employee Id</td>
<td><input type="text" name="empid" required></td>
</tr>

<tr>
<td>Name</td>
<td><input type="text" name="empname" required></td>
</tr>

<tr>
<td>Email Id</td>
<td><input type="text" name="empemail" required></td>
</tr>

<tr>
<td>Contact No</td>
<td><input type="text" name="empcontactno" required></td>
</tr>

<tr>
<td>City</td>
<td><input type="text" name="empcity" required></td>
</tr>

<tr>
<td colspan="2" align="center">
<input type="submit" value="Register">
</td>
</tr>

</table>
</form>

</body>
</html>