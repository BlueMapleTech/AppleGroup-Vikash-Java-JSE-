<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script>
function adminupdate() {
    var username = document.forms["update"]["username"].value;
    var emailaddress= document.forms["update"]["emailaddress"].value;
    var contact = document.forms["update"]["contact"].value;
    var c=contact.length;
    var firstname= document.forms["update"]["firstname"].value;
    var lastname = document.forms["update"]["lastname"].value;
    var address= document.forms["update"]["address"].value;
    var password = document.forms["update"]["password"].value;
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
<h2> ADMIN UPDATE</h2>
<form name="update" action="Adminupdate" onsubmit="return adminupdate()" method="post">

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