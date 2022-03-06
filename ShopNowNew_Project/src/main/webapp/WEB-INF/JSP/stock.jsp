<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List,com.shopnow.model.Products,com.shopnow.model.Material_Inward" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>Stock</h1>
<table text-align="center" border="2">
<tr>
<th>Product Id:</th>
<th>Name of Product:</th>
<th>Available Stock:</th>
<th>Price:</th>
</tr>
<c:forEach var="s1" items="${stockofproducts}">
<tr>
<td>${s1.getPid()}</td>
<td>${s1.getPname()}</td>
<td>${s1.getAvailquan()}</td>
<td>${s1.getPrice()}</td>
</tr>
</c:forEach><br>
<tr>


</body>
</html> --%>



<!DOCTYPE html>
<html lang="en">
<head>
  <title>Admin_Stock</title>
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
  <h2>Stock</h2><br>
  <table class="table table-striped">
    <thead>
      <tr>
        <th>Product ID</th>
        <th>Product Name</th>
        <th>Price</th>
        <th>Available Stock</th>
      </tr>
      <c:forEach var="p1" items="${stockofproducts}">
    </thead>
    <tbody>
      <tr>
        <td>${p1.getPid()}</td>
        <td>${p1.getPname()}</td>
        <td>${p1.getPrice()}</td>
        <td>${p1.getAvailquan()}</td>
      </tr>
      </c:forEach><br>
    </tbody>
  </table>
</div>
<center>
<a href="home_admin" >Back</a>
</center>
</body>
</html>