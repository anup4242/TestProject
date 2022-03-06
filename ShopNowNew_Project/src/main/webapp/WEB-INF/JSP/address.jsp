<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>ShopNow</h1><br><br>
<h1>Please Fill Shipping Address</h1>
<br>
<form action="final">
<table>
<tr>
<td>Street Name:</td>
<th><input type="text" name="streetname"></th>
</tr>
<tr>
<td>City:</td>
<th><input type="text" name="city"></th>
</tr>
<td>State:</td>
<th><input type="text" name="state"></th>
</tr>
<td>Pincode:</td>
<th><input type="number" name="Pincode:"></th>
</tr>
<tr>
<input type="submit" name="Add Address">
</tr>


</table>

</form>

</body>
</html>