<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h2>Simple Calculator</h2>
<form method="post" action="/index">
    <fieldset>
        <legend>Calculator</legend>
        <table>
            <tr>
                <td>First operand</td>
                <td><input type="text" id="first" name="first"></td>
            </tr>
            <tr>
                <td>Operator</td>
                <td>
                    <select name="operator">
                        <option value='+'>Addition</option>
                        <option value="-">Subtract</option>
                        <option value="*">Multiplication</option>
                        <option value="/">division</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>Second operand</td>
                <td><input type="text" id="second" name="second"></td>
            </tr>
            <tr>
                <td colspan="2" align="center"><button type="submit">Calculate</button></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>