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
<h1>ShopNow</h1><br>

<h3>Add Product</h3>
<form action="save">
<table>
<tr>
<th>
Name :
</th>
<td>
<input type="text" name="pname" required="required" pattern=".{3,}">
</td>
</tr>
<tr>
<th>
Description :
</th>
<td>
<input type="text" name="des" required="required" pattern=".{3,}">
</td>
</tr>
<tr>
<th>
Price
</th>
<td>
<input type="number" name="price" required="required" pattern="[0-9]{1,}">
</td>
</tr>

<tr>
<th>
Add Stock
</th>
<td>
<input type="number" name="availquan" required="required" pattern="[0-9]{1}">
</td>
</tr>


</table><br>
<input type="submit" name="Add" >
</form>
<br><br>
<a href="product_admin">Back</a>
</center>
</body>
</html>