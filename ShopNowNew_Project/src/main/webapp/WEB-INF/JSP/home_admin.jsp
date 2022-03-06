<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- <!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h1>Home</h1>
<br><br><br><br><br><br>
<a href="product_admin">Products</a>
<br><br><br>
<a href="stock">Stock</a>
<br><br><br>
<a href="material_inward">Material Inward</a>
</body>
</html> -->

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Home Admin</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body bgcolor="pink">
<h5 align="=right"></h6><a href="logout">Logout</a></h5>
 <center>
<br><br><br><br>
<h1 align="Center">ShopNow</h1>
<br>

<div class="container">
<h3>Hi <%=session.getAttribute("username")%> </h3><br><br>


<div class="well well-sm"><h4><a href="product_admin">Products</a></h4></div>
</div>
<div class="well well-sm"><h4><a href="stock">Stock</a></h4></div>
</div>
<div class="well well-sm"><h4><a href="material_inward">Material Inward</a></h4></div>
</div>


 </center>
</body>
</html>