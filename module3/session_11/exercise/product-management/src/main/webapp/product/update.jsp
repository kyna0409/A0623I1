<%--
  Created by IntelliJ IDEA.
  User: 0409k
  Date: 1/15/2024
  Time: 12:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    <title>Title</title>
    <style>
    </style>
</head>
<body>
<form method="post">
    <table>
        <tr>
            <td>Name </td>
            <td><input type="text" id="name" name="name" class="form-control" value="${product.getName()}"></td>
        </tr>
        <tr>
            <td>Price</td>
            <td><input type="number" id="price" name="price" class="form-control" value="${product.getPrice()}"></td>
        </tr>
        <tr>
            <td>Description</td>
            <td><textarea cols="30" rows="5" id="description" name="description"  >${product.getDescription()}</textarea></td>
        </tr>
        <tr>
            <td>Producer</td>
            <td><input type="text" id="producer" name="producer" class="form-control " value="${product.getProducer()}"></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" class="form-control" value="UPDATE" onclick="confirm_update()"></td>
        </tr>
    </table>
</form>
<h4><a href="/products">Back to list</a></h4>
<script>
    function confirm_update()
    {
        confirm("Are you sure ?")
    }
</script>
</body>
</html>
