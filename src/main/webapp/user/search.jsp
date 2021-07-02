<%--
  Created by IntelliJ IDEA.
  User: Nguyen Viet Tien
  Date: 07/01/2021
  Time: 9:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Searching</title>
</head>
<body>
<h1>Search user</h1>
<form method="post" style="width: 300px">
    <fieldset>
        <legend>Search users by country</legend>
        <table>
            <tr>
                <td>Country: </td>
                <td><input type="text" name="country" id="name"></td>
            </tr>
            <tr>
                <td><input type="submit" value="Search"></td>
                <td><a href="/users">Back to users list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>