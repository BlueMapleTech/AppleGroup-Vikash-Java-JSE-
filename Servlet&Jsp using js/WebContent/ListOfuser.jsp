<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="1" width="45%">
		<tr>
			<th>userid</th>
			<th>username</th>
			<th>password</th>
			<th>emailaddress</th>
			<th>contact</th>
			<th>firstname</th>
			<th>lastname</th>
			<th>address</th>
		   <th>createdby</th>
			<th>updatedby</th>
			<th>createdate</th>
			<th>updatedate</th>
			<th>role_roleid</th>
		</tr>
		<c:forEach var="user" items="${data}">
			<tr>
				<td><c:out value="${user.userid}" /></td>
				<td><c:out value="${user.username}" /></td>
				<td><c:out value="${user.password}" /></td>
				<td><c:out value="${user.emailaddress}" /></td>
				<td><c:out value="${user.contact}" /></td>
				<td><c:out value="${user.firstname}" /></td>
				<td><c:out value="${user.lastname}" /></td>
				<td><c:out value="${user.address}" /></td>
				<td><c:out value="${user.createdby}" /></td>
				<td><c:out value="${user.updatedby}" /></td>
				<td><c:out value="${user.createddate}" /></td>
				<td><c:out value="${user.updateddate}" /></td>
				<td><c:out value="${user.role_roleid }" /></td>
			</tr>
		</c:forEach>
	</table>
	<a href="adminupdate.jsp">Update</a>
	<a href="admindelete.jsp">Delete</a>



</body>
</html>