<%-- 
    Document   : agecalculator
    Created on : Sep 28, 2022, 10:49:49 PM
    Author     : bo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>age calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
         <form method="POST" action="age">
            <div>
                <label>Enter your age:</label>
                <input type="text" name="ages" value="">
            </div>
            
            <div>
                <input type="submit" value="Age next birthday">
            </div>
             <span>${message}</span>
        </form>
            <a href="arithmetic" >Arithmetic Calculator</a>
    </body>
</html>
