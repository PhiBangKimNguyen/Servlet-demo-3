<%-- 
    Document   : arithmeticcalculator
    Created on : 25-Sep-2022, 9:45:54 PM
    Author     : Phi N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            First: <input type="text" name="firstNumber"><br>
            Second: <input type="text" name="secondNumber"><br>
            <input type="submit" value="+" name="button">
            <input type="submit" value="-" name="button">
            <input type="submit" value="*" name="button">
            <input type="submit" value="%"name="button">
        </form>
        <span>Result : ${result}${wrongResult}</span><br>
        <a href="age">Age Calculator</a>
    </body>
</html>

