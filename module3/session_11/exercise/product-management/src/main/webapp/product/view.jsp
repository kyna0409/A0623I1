<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/15/2024
  Time: 12:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h5>PRODUCT DETAIL</h5>
<table>
    <tr>
        <td>Name :</td>
        <td>${product.getName()}</td>
    </tr>
    <tr>
        <td>Price :</td>
        <td>${product.getPrice()}</td>
    </tr>
    <tr>
        <td>Description :</td>
        <td>${product.getDescription()}</td>
    </tr>
    <tr>
        <td>Producer :</td>
        <td>${product.getProducer()}</td>
    </tr>
</table>
<h4><a href="/products">Back to list</a></h4>
</body>
</html>
