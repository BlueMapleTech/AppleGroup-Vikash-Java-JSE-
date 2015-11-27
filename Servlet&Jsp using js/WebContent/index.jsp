<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script>
function checking() {
    var username = document.forms["login"]["username"].value;
    var password= document.forms["login"]["password"].value;
    var p=password.length;
    if (username == null || username == "") {
    	text="username field is empty";
    	document.getElementById("demo").innerHTML = text;
        return false;
    }
    if((password== null||password=="")||(p<=5))
    {
    	text="password field is week";
    	document.getElementById("demo").innerHTML = text;
    	return false;
    }
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<p align=center>login page</p><br>
<form name="login"action="Servlet" onsubmit="return checking()" method="post">
username:<input type="text" name="username" required></p><br/><br/>  
Password:<input type="password" name="password" required><br/><br/>
<center><p id="demo"></p></center>  
<input type="submit" value=login>


<center>
if you enter first time to create  page<a href="signup.jsp">signup</a>
</center>
  </form> 

</body>
</html>