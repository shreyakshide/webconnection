<html>
<head>
<title>Login</title>
</head>
<body>

<h2 align="center">Login</h2>

<%
String msg = (String)request.getAttribute("msg");
if(msg != null){
%>
<h3 style="color:red;" align="center"><%=msg%></h3>
<%
}
%>

<form action="login" method="post">

<table align="center" border="1">

<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td>
</tr>

<tr>
<td><input type="submit" value="Login"></td>
<td><input type="reset" value="Reset"></td>
</tr>

<tr>
<td colspan="2" align="center">
<a href="register">New User Register</a> |
<a href="forgetpassword">Forget Password</a>
</td>
</tr>

</table>

</form>

</body>
</html>