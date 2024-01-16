<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/13/2024
  Time: 3:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <title>Title</title>
</head>
<body>
<div class="container">
    <h3 style="text-align: center">Danh Sách Khách Hàng</h3>
    <table border="1" class="table table-striped table-hover">
        <thead>
        <tr>
        <th>Tên</th>
        <th>Ngày Sinh</th>
        <th>Địa Chỉ</th>
        <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="temp" items="${listCustomers}">
            <tr>
                <td>${temp.name}</td>
                <td>${temp.dob}</td>
                <td>${temp.address}</td>
                <td><img src="../img/${temp.image}" width="100"></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>
