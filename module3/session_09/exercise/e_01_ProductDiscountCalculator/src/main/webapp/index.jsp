<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JSP - Hello World</title>
</head>
<body>
<form action="/discount" method="post">
  <table>
    <tr>
      <td>Product Description:</td>
      <td><input type="text" name="product"></td>
    </tr>
    <tr>
      <td>List Price:</td>
      <td><input type="text" name="price"></td>
    </tr>
    <tr>
      <td>Discount Percent: </td>
      <td><input type="text" name="percent"></td>
    </tr>
    <tr>
     <td> <input type="submit" value="Submit"></td>
      <td><input type="reset" value="Reset"></td>
    </tr>
  </table>
</form>
</body>
</html>