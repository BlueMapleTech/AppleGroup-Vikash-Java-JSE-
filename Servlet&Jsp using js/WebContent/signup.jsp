<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<script>
function signup() {
    var username = document.forms["sign"]["username"].value;
    var emailaddress= document.forms["sign"]["emailaddress"].value;
    var contact = document.forms["sign"]["contact"].value;
    var c=contact.length;
    var firstname= document.forms["sign"]["firstname"].value;
    var lastname = document.forms["sign"]["lastname"].value;
    var address= document.forms["sign"]["address"].value;
    var password = document.forms["sign"]["password"].value;
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
<p align="center">Registration Form</p><br>
<form name="sign" action="Usercontroller" onsubmit="return signup()" method="post">
UserName   :<input type="text" name="username"/><br><br>
EmailId    :<input type="text" name="emailaddress"/><br><br>
contact    : <input type="text" name="contact" /><br>
First Name :<input type="text" name="firstname"/><br><br>
Last Name  :<input type="text" name="lastname"/><br><br><p/>
Address    :<input type="text" name="address"/><br><br>
Password   :<input type="password" name="password"/><br><br>
<center><p id="demo"></p></center>  
 <p align="center"><input type="submit" value="insert"><br></br></p>
 <p align="center"><input type="submit" value="cancel">
 
</form>

</body>
</html>