<%-- 
    Document   : navbar
    Created on : 13-Sep-2021, 12:25:17 PM
    Author     : Sufiyan Salim Akbani
--%>

<%@page import="com.qaswatech.webapp.utility.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">Acet Portal</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarSupportedContent">
                    <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                        <li class="nav-item">
                            <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="employee.jsp">Employee Registration</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href="database_page.jsp">Database Page</a>
                        </li>
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                                Dropdown
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <li><a class="dropdown-item" href="#">Action</a></li>
                                <li><a class="dropdown-item" href="#">Another action</a></li>
                                <li><hr class="dropdown-divider"></li>
                                <li><a class="dropdown-item" href="#">Something else here</a></li>
                            </ul>
                        </li>
                        <li class="nav-item">
                            <a href="login_page.jsp" class="nav-link ">Login here</a>
                        </li>
                    </ul>
                    <form class="d-flex">
                        <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                        <button class="btn btn-outline-primary" type="submit">Search</button>
                    </form>
                </div>
            </div>
        </nav>

    <%

        if (!Utils.empty(request.getParameter("message"))) 
        {

    %>
    <!--Alerts-->
    <div class="alert alert-warning alert-dismissible fade show" role="alert">
        
        <strong>
            ${param.message}
        </strong> 
        
   <!-- 
        <strong>
        <%-- <%= request.getParameter("message") %> --%>
        </strong> 
     -->
     
        <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
    
    </div>
        
    <%
    
        }
    
    %>