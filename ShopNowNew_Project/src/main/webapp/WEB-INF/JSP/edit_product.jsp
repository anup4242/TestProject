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
<h2>Edit Product</h2><br>
<form action="update" method="post">
<table>
<tr>
<th>
Product Id :
</th>
<td>
<input type="number" name="pid" value="${Product.getPid()}" required="required" readonly>
</td>
</tr>
<tr>
<th>
Name :
</th>
<td>
<input type="text" name="pname" value="${Product.getPname()}" >
</td>
</tr>
<tr>
<th>
Description :
</th>
<td>
<input type="text" name="des" value="${Product.getDes()}">
</td>
</tr>
<tr>
<th>
Price
</th>
<td>
<input type="number" name="price" value="${Product.getPrice()}">
</td>
</tr>
<tr>
<tr></tr>
<td></td><td><input type="submit" name="Update"></td>
</tr>
</table>

</form>


</center>
</body>
</html>