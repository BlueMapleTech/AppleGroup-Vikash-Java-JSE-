<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<script>
function update() {
    var username = document.forms["up"]["username"].value;
    var emailaddress= document.forms["up"]["emailaddress"].value;
    var contact = document.forms["up"]["contact"].value;
    var c=contact.length;
    var firstname= document.forms["up"]["firstname"].value;
    var lastname = document.forms["up"]["lastname"].value;
    var address= document.forms["up"]["address"].value;
    var password = document.forms["up"]["password"].value;
    var p=password.length;
    if (username == null || username == "") {
        text="username field is empty";
        document.getElementById("demo").innerHTML = text;
         return false;
     }
     if(emailaddress== null||emailaddress=="")
     {
     text="emailaddress field is empty";
     document.getElementById("demo").innerHTML = text;
     }
     if ((contact == null || contact == "")||(c<=10)) {
         text="insert more number in the empty";
         document.getElementById("demo").innerHTML = text;
          return false;
      }
      if(firstname== null||firstname=="")
      {
      	text="firstname field is empty";
      	document.getElementById("demo").innerHTML = text;
      	return false;
      }
      if (lastname == null || lastname == "") {
          text="lastname field is empty";
          document.getElementById("demo").innerHTML = text;
           return false;
       }
       if(address== null||address=="")
       {
       text="address field is empty";
       document.getElementById("demo").innerHTML = text;
       }
       if((password== null||password=="")||(p<=6))
       {
       	text="password field is week";
       	document.getElementById("demo").innerHTML = text;
       }
}  
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
<center>
<h3> Update user</h3></center>
<form name="up" action="Update" onsubmit="return update()" method="post">
username:<input type="text" name=username><br></br>
password:<input type="password" name="password"><br></br>
emailaddress:<input type="text" name="emailaddress"><br></br>
contact:<input type="text" name="contact"><br></br>
firstname:<input type="text" name="firstname"><br></br>
lastname:<input type="text" name="lastname"><br></br>
address:<input type="text" name="address"><br></br>
<center><p id="demo"></p></center>  
<center><input type="submit" value="update"/>
</center>
</form>
</body>
</html>