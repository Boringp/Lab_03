<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 29, 2022, 11:18:29 AM
    Author     : bo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>arithmetic calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator!</h1>
        <form method="POST" action="arithmetic">
            <div>
                <label>First:</label>
                <input type="text" name="first" value="${First}">
            </div>
             <div>
                <label>Second:</label>
                <input type="text" name="second" value="${Second}">
            </div>
            <div>
                <input type="submit"  name="btnsubmit" value="+">
                <input type="submit"  name="btnsubmit" value="-">
                <input type="submit"  name="btnsubmit" value="*">
                <input type="submit"  name="btnsubmit" value="%">
            </div>
            <p>Result:<span>${message}</span></p>
        </form>
         <a href="age" >Age Calculator</a>
    </body>
</html>
