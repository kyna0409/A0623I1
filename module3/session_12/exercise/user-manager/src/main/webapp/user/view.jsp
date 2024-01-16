<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/16/2024
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h4>USER DETAIL</h4>
<table>
    <tr>
        <td>Name :</td>
        <td>${user.getName()}</td>
    </tr>
    <tr>
        <td>Email :</td>
        <td>${user.getEmail()}</td>
    </tr>
    <tr>
        <td>Country :</td>
        <td>${user.getCountry()}</td>
    </tr>
</table>
<a href="/users"><h4>Back to list</h4></a>
</body>
</html>
