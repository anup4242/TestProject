<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5 align="=right"></h6><a href="logout">Logout</a><br><br>
<center>
<h1>ShopNow</h1><br><br>
<h2>Material Receipt (Inward)</h2>
<form action="addmaterial">
<br>
<table>
<tr><th>
Date :</th><td><input type="date" name="mdate" required="required"><br></td></tr>
<tr><th>
MR no:</th><td><input type="number" name="mrno" required="required"><br></td></tr>
<tr><th>
Supplier Name:</th><td><input type="text" name="sname" required="required"></td></tr><br><br>
</table>
<hr>
<table>
<tr>
<th>
Product ID :</th><th><input type="number" name="pid" required="required"></th>
</tr>
<th>
Quantity :</th><th><input type="number" name="mquan" required="required" ></th>
</tr>
<th>
Rate :</th><th><input type="number" name="mrate" required="required"></th>
</tr>
</table>
<input type="submit" name="ADD">
</form>
<br><br>
<a href="home_admin" >Back</a>

</center>
</body>
</html>