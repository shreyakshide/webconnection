<html>
<head>
<title>Forget Password</title>
</head>
<body>

<h2 align="center">Forget Password</h2>

<%
String msg = (String)request.getAttribute("msg");
if(msg != null){
%>
<h3 style="color:red;" align="center"><%=msg%></h3>
<%
}
%>

<form action="forgetpassword" method="post">

<table align="center" border="1">

<tr>
<td>Email</td>
<td><input type="text" name="email"></td>
</tr>

<tr>
<td><input type="submit" value="Submit"></td>
<td><input type="reset" value="Reset"></td>
</tr>

</table>

</form>

</body>
</html>
