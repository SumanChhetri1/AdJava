<%-- 
    Document   : main
    Created on : Apr 30, 2023, 8:15:05 AM
    Author     : Cool Boy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%String name= request.getParameter("un");%>
        <%="Hello "+name%>
    </body>
</html>
