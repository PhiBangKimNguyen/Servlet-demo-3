<%-- 
    Document   : agecalculator
    Created on : 25-Sep-2022, 9:45:35 PM
    Author     : Phi N
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            Enter your age: <input type="text" name="age"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <span>${message}${errorMessage}</span><br>
        <a href="arithmetic">Arithmetic Calculator</a>
    </body>
</html>

