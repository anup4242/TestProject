<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@page import="java.util.List,com.shopnow.model.Products" isELIgnored="false" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>ShopNow</h1>
<br>
<h3> Hi <%=session.getAttribute("username") %> your cart is here!</h3>
${itemlist}
<c:if test="${itemlist==null}">
<h1>${Status}</h1>
</c:if>
<c:if test="${itemlist!=null}">

<!-- <form action=""> -->
<table border="1">
<tr>
<th>Name of Product</th>
<th>Price</th>
<th>Quantity</th>
<th>Total Price</th>

</tr>
<c:forEach  var="p1" items="${itemlist}">
<tr>
<td>${p1.getItemname()}</td>
<td>${p1.getItemprice()}</td>
<td>${p1.getQuantity()}</td>
<td>${p1.getItemprice()*p1.getQuantity()}</td>
</tr>
</c:forEach>
<br>
<tr>

</table><br>
<h3>Total Amount :${total}</h3><br><br>
<h2><a href="order">Place Order</a></h2><tr>
<!-- </form> -->
</c:if>
</body>
</html> --%>


<!DOCTYPE html>
<html lang="en">
<head>
  <title>User_Cart</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  
</head>
<body>
<h5 align="=right"></h6><a href="logout">Logout</a><br><br>
<h1 align="center">ShopNow</h1><br>
<div class="container">
  <h2>Products</h2><br>
  <h3> Hi <%=session.getAttribute("username") %> your cart is here!</h3>
  <table class="table table-striped">
    <thead>
      <tr>
<th>Name of Product</th>
<th>Price</th>
<th>Quantity</th>
<th>Total Price</th>
</tr>
      <c:forEach var="p1" items="${itemlist}">
    </thead>
    <tbody>
    <tr>
<td>${p1.getItemname()}</td>
<td>${p1.getItemprice()}</td>
<td>${p1.getQuantity()}</td>
<td>${p1.getItemprice()*p1.getQuantity()}</td>
<td><a href="removeitem?id=${p1.getItemid()}">remove</a></td>
</tr>
</c:forEach>
    <br>
    </tbody>
  </table>
</div>
<center>
<h3>Total Amount :${total}</h3><br>
<h3><a href="product_user">Add More Products</a></h3><br>
<h2><a href="order">Place Order</a></h2>
<br>


</center>
</body>
</html>


