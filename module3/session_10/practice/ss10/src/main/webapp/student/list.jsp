<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 5/30/2022
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="container">
    <button onclick="window.location.href='/student?action=create'">Thêm mới</button>
    <table border="1" class="table table-hover">
        <thead>
        <tr>
            <th>Code Student</th>
            <th>Name Student</th>
            <th>Point</th>
            <th>IdCard</th>
            <th>Rank</th>
            <th>Code class</th>
            <th>Update</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="temp" items="${listStudent}">
            <tr>
                <td>${temp.code}</td>
                <td>${temp.nameStudent}</td>
                <td><c:out value="${temp.point}"></c:out></td>
                <td>${temp.idCard}</td>
                <td>
                    <c:choose>
                        <c:when test="${temp.point >8}">Very good</c:when>
                        <c:when test="${temp.point >6.5}">Good</c:when>
                        <c:when test="${temp.point >5}">Not good</c:when>
                        <c:when test="${temp.point >3.5}">Bad</c:when>
                        <c:when test="${temp.point <=3.5}">Very Bad</c:when>
                    </c:choose>
                </td>
                <td>${temp.codeClass}</td>
                <td><button onclick="window.location.href='/student?action=update&code=${temp.code}'" class="btn btn-warning">Cập nhật</button></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
</body>
</html>
