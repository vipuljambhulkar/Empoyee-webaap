<%-- 
    Document   : database_page
    Created on : 25-Dec-2021, 11:12:22 PM
    Author     : Sufiyan Salim Akbani
--%>

<%@page import="com.qaswatech.webapp.model.EmployeeModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.qaswatech.webapp.controller.EmployeeController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="heading.jsp" %>
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="navbar.jsp" %>
    <center><h3>Student Data</h3></center>

    <table class="table table-bordered table-dark table-hover" >


        <%                
            EmployeeController employeeController = new EmployeeController();
            ArrayList<EmployeeModel> employeeList = employeeController.findAll();

        %>


        <tr>

            <th>Id</th>
            <th>Name</th>
            <th>Date Of Birth</th>
            <th>Gender</th>
            <th>Address</th>
            <th>City</th>
            <th>State</th>
            <th>Login ID</th>
            <th>Passwaord</th>
            <th><center>Action</center></th>

</tr>

<%                
    if (employeeList.isEmpty()) {
%>

<tr>
    <td colspan="15">
<center>
    No Data Found
</center>
</td>
</tr>

<%
} else {
    for (EmployeeModel employee : employeeList) {
%>  

<tr>

    <td><%= employee.getId()%></td>
    <td><%= employee.getName()%></td>
    <td><%= employee.getDob()%></td>
    <td><%= employee.getGender()%></td>
    <td><%= employee.getAddress()%></td>
    <td><%= employee.getCity()%></td>
    <td><%= employee.getState()%></td>
    <td><%= employee.getLogin_id()%></td>
    <td><%= employee.getPassword()%></td>
    <td><a href="EmployeeController?action=delete&employee_id=<%=employee.getEmployeeId()%>" class="btn btn-danger btn-sm">Delete</a></td>
    

</tr>

<%
        }
    }
%>



</table>
</body>
</html>
