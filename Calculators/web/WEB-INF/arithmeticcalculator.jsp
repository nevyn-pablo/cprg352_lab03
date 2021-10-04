<%-- 
    Document   : arithmeticcalculator
    Created on : Oct 3, 2021, 7:55:33 PM
    Author     : 849961
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        <form method="post" action="arithmetic">
            <label>First Number:</label>
            <input type="text" name="first" value="">
            <br>
            <label>Second Number:</label>
            <input type="text" name="second" value
                   <br>
            <input type="submit" name="calculate" value="+">
            <input type="submit" name="calculate" value="-">
            <input type="submit" name="calculate" value="*">
            <input type="submit" name="calculate" value="%">
            <p>${result}</p>
            <a name="otherpage" href="${otherpage}">Age Calculator</a>
        </form>
    </body>
</html>