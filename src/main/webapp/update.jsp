<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ud" method="post">
id:<input type="text" name="uid" value="<%=request.getParameter("id")%>" readonly="readonly"><br>
name:<input type="text" name="uname" value="<%=request.getParameter("name")%>"><br>
email:<input type="email" name="uemail" value="<%=request.getParameter("email")%>"><br>
password:<input type="password" name="upassword" value="<%=request.getParameter("password")%>"><br>
number:<input type="tel" name="unumber" value="<%=request.getParameter("number")%>"><br>
gender:<input type="text" name="ugender" value="<%=request.getParameter("gender")%>"><br>
check box:<input type="text" name="ucheckbox" value="<%=request.getParameter("checkbox")%>"><br>
country:<input type="text" name="ucountry" value="<%=request.getParameter("country")%>"><br>
<button>update</button>

</form>
</body>
</html>