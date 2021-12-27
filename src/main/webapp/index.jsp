<%-- 
    Document   : index
    Created on : 26-Aug-2021, 12:49:22 PM
    Author     : Sufiyan Salim Akbani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>JSP Page</title>
        
        <%@include file="heading.jsp" %>   
    </head>
    <body>
        
        <%@include file="navbar.jsp" %>
        
        <h1>Hello <%= session.getAttribute("Name") %>!</h1>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

    </body>
</html>
