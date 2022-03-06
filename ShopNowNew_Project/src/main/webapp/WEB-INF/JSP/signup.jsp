<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<center>
<h1>ShopNow</h1><br><br><br>
<h2>Create new Account </h2>
<br>
<form action="gotosignup" method="post">
<table>
<tr>
<td>Name:</td>
<td><input type="text" name="username"></td>
</tr>
<tr>
<td>Email:</td>
<td><input type="text" name="email"></td>
</tr>
<tr>
<td>Password:</td>
<td><input type="password" name="password"></td>
</tr>
<tr>
<td>City:</td>
<td><input type="text" name="city"></td>
</tr>
<tr>
<td>State:</td>
<td><input type="text" name="state"></td>
</tr>
<tr>
<td>Contact Number:</td>
<td><input type="number" name="contactnum"></td>
</tr>
</table>
<br><br><br>
<input type="submit" name="Submit">
</form>
</center>
</body>
</html> -->





<!DOCTYPE html>

<html lang="en">
<head>
  <title>SignUp</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>&nbsp;&nbsp;&nbsp;&nbsp;ShopNow</h1><br><br><br>
<h2>&nbsp;&nbsp;&nbsp;&nbsp;Create new Account </h2>
<br>
<form action="gotosignup" method="post">



    <div class="form-group">
   &nbsp;&nbsp;&nbsp;&nbsp;   <label for="username">Enter Your Name:</label>
  &nbsp;&nbsp;&nbsp;&nbsp;    <input type="text" class="form-control" id="name" placeholder="User Name" name="username" required="required" pattern="[A-Za-z]{2,}">
    </div>
    <div class="form-group">
    &nbsp;&nbsp;&nbsp;&nbsp;  <label for="pwd">Email :</label>
    &nbsp;&nbsp;&nbsp;&nbsp;  <input type="email" class="form-control" id="mail" placeholder="Enter Your Email" name="email" required="required" pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2,}$">
    </div>
     <div class="form-group">
   &nbsp;&nbsp;&nbsp;&nbsp;   <label for="pwd">Password :</label>
   &nbsp;&nbsp;&nbsp;&nbsp;   <input type="password" class="form-control" id="pass" placeholder="Enter Password" name="password" required="required" pattern=".{3,}">
    </div>
    <div class="form-group">
    &nbsp;&nbsp;&nbsp;&nbsp;  <label for="pwd">City :</label>
    &nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" class="form-control" id="city" placeholder="Enter Your City" name="city" required="required" pattern="[A-Za-z]{2,}">
    </div>
    <div class="form-group">
   &nbsp;&nbsp;&nbsp;&nbsp;   <label for="pwd">State :</label>
    &nbsp;&nbsp;&nbsp;&nbsp;  <input type="text" class="form-control" id="state" placeholder="Enter Your State" name="state" required="required" pattern="[A-Za-z]{2,}">
    </div>
    <div class="form-group">
    &nbsp;&nbsp;&nbsp;&nbsp;  <label for="pwd">Contact Number :</label>
     &nbsp;&nbsp;&nbsp;&nbsp; <input type="number" class="form-control" id="num" placeholder="Enter Mobile number" name="contactnum" required="required" pattern="[789]{1}[0-9]{9}">
    </div>
    
    <button type="submit" class="btn btn-default">Submit</button>
  </form>
</div>
<br><br>
<center>
<a href="welcomepagge">Back</a>
</center>

</body>
</html>