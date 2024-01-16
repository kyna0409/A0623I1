<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/16/2024
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="/users?action=create"><h4>Create</h4></a>
<div class="search">
    <form method="post" action="/users?action=search">
        <input type="text" id="search" name="search">
        <input type="submit" value="Search">
    </form>
</div>
<div class="sort">
    <form method="get">
        <select name="action">
            <option>Choose</option>
            <option value="sortByName">Name</option>
            <option value="sortByEmail">Email</option>
            <option value="sortByCountry">Country</option>
        </select>
        <button type="submit">Sort</button>
    </form>
</div>
<table border="1">
    <thead>
    <tr>
        <th>NAME</th>
        <th>EMAIL</th>
        <th>COUNTRY</th>
        <th colspan="2" align="center">CHOOSE</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="user" items="${users}">
        <tr>
            <td><a href="/users?action=view&id=${user.getId()}">${user.getName()}</a></td>
            <td>${user.getEmail()}</td>
            <td>${user.getCountry()}</td>
            <td>
                <a href="/users?action=update&id=${user.getId()}">UPDATE</a>
                <a href="/users?action=delete&id=${user.getId()}" onclick="confirm_delete()">DELETE</a>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<script>
    function confirm_delete()
    {
        confirm("Are you sure ?");
    }
</script>
</body>
</html>
