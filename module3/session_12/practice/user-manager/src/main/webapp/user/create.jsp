<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/16/2024
  Time: 5:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <table border="1">
        <tr>
            <td>Name :</td>
            <td><input type="text" id="name" name="name"></td>
        </tr>
        <tr>
            <td>Email :</td>
            <td><input type="email" id="email" name="email"></td>
        </tr>
        <tr>
            <td>Country :</td>
            <td><input type="text" id="country" name="country"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" value="SUBMIT"></td>
        </tr>
    </table>
</form>
<a href="/users"><h4>Back to list</h4></a>
</body>
</html>
