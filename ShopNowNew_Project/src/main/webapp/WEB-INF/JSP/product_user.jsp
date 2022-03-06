<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List,com.shopnow.model.Products" isELIgnored="false" %>
	<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Products</title>
<script type="text/javascript">
function m1(a,ob)
{
	console.log("hellooo"+ob);
	var v=document.getElementById(""+ob).value;
	console.log("vvvvvvvvvvvv"+v);
	var h="cart?id="+ob+"&quan="+v;
	alert(h);
	//alert(a);
	a.setAttribute("href",h);
	//this.setAttribute("href",)
}

</script>
</</head>
<body bgcolor="pink">
<h1>ShopNow</h1>
<br><br>
<h2>Products</h2><br><br>
<h2 align="right"><a href="viewcart">View Cart</a></h2>

<table border="1" >
<tr>
<th>Name of Product</th>
<th>Description</th>
<th>Price</th>
 <th>Quantity</th> 
</tr>
<c:forEach  var="p1" items="${ListOfProducts}">
<tr>
<td>${p1.getPname()}</td>
<td>${p1.getDes()}</td>
<td>${p1.getPrice()}</td>
<td><input type="number" id="${p1.getPid()}"></td> 
<td><a href="" onclick='m1(this,${p1.getPid()})'>Add to Cart</a>
</td>
</tr>
</c:forEach>


</body>
</html> --%>



<!DOCTYPE html>
<html lang="en">
<head>
  <title>User_Product</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <script type="text/javascript">
function m1(a,ob)
{
	/* console.log("hellooo"+ob); */
	var v=document.getElementById(""+ob).value;
/* 	console.log("vvvvvvvvvvvv"+v); */
	var h="cart?id="+ob+"&quan="+v;
	/* alert(h); */
	//alert(a);
	a.setAttribute("href",h);
	//this.setAttribute("href",)
}

</script>
</head>
<body>
<h5 align="=right"></h6><a href="logout">Logout</a></h5><br><br><br>
<h1 align="center">ShopNow</h1><br>
<div class="container">
  <h2>Products</h2><br>
  <h2 align="left"><a href="viewcart">View Cart</a></h2>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Product Name</th>
        <th>Description</th>
        <th>Price</th>
        <th>Quantity</th>
        
      </tr>
      <c:forEach var="p1" items="${ListOfProducts}">
    </thead>
    <tbody>
    <tr>
    <td>${p1.getPname()}</td>
	<td>${p1.getDes()}</td>
	<td>${p1.getPrice()}</td>
	<td><input type="number" id="${p1.getPid()}"></td> 
	<td><a href="" onclick='m1(this,${p1.getPid()})'>Add to Cart</a>
	</td>
	</tr>
      </c:forEach><br>
    </tbody>
  </table>
</div>
<center>
<a href="home_user">Back</a>
</center>
</body>
</html>