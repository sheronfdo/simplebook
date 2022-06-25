<%-- 
    Document   : author
    Created on : Jun 25, 2022, 12:47:06 PM
    Author     : Jamith
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body><h2>Author</h2>
        <form action="authorInsert" method="POST" name="form">
            <input type="text" name="authorName" placeholder="Author Name">
            <input type="submit"  value="Submit" id="subbtn">
        </form>
    </body>
</html>
