<%-- 
    Document   : agecalculator
    Created on : Oct 3, 2021, 7:27:26 PM
    Author     : 849961
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        <form method="post" action="age">
            <label>Enter your age:</label>
            <input type="text" name="age" value="">
            <input type="submit" value="Age next birthday">
            <p>${ageOfNextYear}</p>
            <a name="otherpage" href="${arithpage}">Arithmetic Calculator</a>
        </form>
    </body>
</html>