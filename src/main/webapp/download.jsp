<%@page import="servlet_basics.dto.PatientDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="">
	<tr>
	<th>ID</th>
	<th>NAME</th>
	<th>EMAIL</th>
	<th>PASSWORD</th>
	<th>NUMBER</th>
	<th>GENDER</th>
	<th>CHECKBOX</th>
	<th>COUNTRY</th>
	<th>DELETE</th>
	<th>UPDATE</th>
	</tr>
	<%List<PatientDto> list=(List<PatientDto>) request.getAttribute("objects");%>	
	<%for(PatientDto pd:list){%>
	<tr>
	<td><%=pd.getId()%></td>
	<td><%=pd.getName()%></td>	
	<td><%=pd.getEmail()%></td>
	<td><%=pd.getPassword()%></td>
	<td><%=pd.getNumber()%></td>
	<td><%=pd.getGender()%></td>
	<td><%=pd.getCheckbox()%></td>
	<td><%=pd.getCountry()%></td>
	<td><a href="delete?pk=<%=pd.getId()%>">Remove</a></td>
	<td><a href="update.jsp?id=<%=pd.getId()%>
	&&name=<%=pd.getName()%>
	&&email=<%=pd.getEmail()%>
	&&password=<%= pd.getPassword()%>
	&&number=<%=pd.getNumber()%>
	&&gender=<%=pd.getGender()%>
	&&checkbox=<%=pd.getCheckbox()%>
	&&country=<%=pd.getCountry()%>">update</a></td>
	</tr>
	<%} %>
</table>
</body>
</html>