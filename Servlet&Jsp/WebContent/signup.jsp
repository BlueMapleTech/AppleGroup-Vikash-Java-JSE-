<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p align="center">Registration Form</p><br>
<form action="Usercontroller" method="post">
UserName   :<input type="text" name="username"/><br><br>
EmailId    :<input type="text" name="emailaddress"/><br><br>
Contact No :<input type="text" name="contact"/><br><br>
First Name :<input type="text" name="firstname"/><br><br>
Last Name  :<input type="text" name="lastname"/><br><br><p/>
Address    :<input type="text" name="address"/><br><br>
Password   :<input type="password" name="password"/><br><br>


 <p align="center"><input type="submit" value="insert"><br></br></p>
 <p align="center"><input type="submit" value="cancel">
 
</form>

</body>
</html>