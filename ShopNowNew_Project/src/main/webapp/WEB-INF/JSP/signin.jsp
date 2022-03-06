<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>

<html lang="en">
<head>
  <title>Signin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
<h1>&nbsp;&nbsp;&nbsp;&nbsp;ShopNow</h1><br><br>

<h2>&nbsp;&nbsp;&nbsp;&nbsp;Login</h2>
<br>
<h2>${status}</h2>

<form action="check_user">

    <div class="form-group">
     &nbsp;&nbsp;&nbsp;&nbsp;<label for="username">Username:</label>
      <input type="text" class="form-control" id="name" placeholder="User" name="username" required="required" pattern="[A-Za-z]{2,}">
    </div>
    <div class="form-group">
   &nbsp;&nbsp;&nbsp;&nbsp;<label for="pwd">Password:</label>
      <input type="password" class="form-control" id="pass" placeholder="Enter password" name="password" required="required" pattern=".{3,}" >
    </div>
    
    <button type="submit" class="btn btn-default">Log In</button>
  </form>
</div>
<br><br>
<center>
<a href="welcomepagge">Back</a>
</center>

</body>
</html>