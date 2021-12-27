<%-- 
    Document   : student_update
    Created on : 10-Sep-2021, 12:19:41 PM
    Author     : Sufiyan Salim Akbani
--%>


 
<%@page import="com.qaswatech.webapp.model.EmployeeModel"%>
<%@page import="com.qaswatech.webapp.controller.EmployeeController"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
    
    <head>
        
        <title>Student Update</title>
        <%@include file="heading.jsp" %>   
        
    </head>
    
    <body>
        
        <%@include file="navbar.jsp" %>
        
        <center>
            
            <br>

            <h1>Update Form</h1>

            <br>
            
            <%
                EmployeeController controller = new EmployeeController();
                EmployeeModel employee = controller.findById((request.getParameter("employee_id")));
                if(employee == null)
                {
            %>

            No User Found with Student ID : <%= request.getParameter("employee_id") %>

            <%
                } 
                else 
                {
            %>

            <%--<%= student.getName() %>--%>

                <form method="get" action="EmployeeController">

                <input type="hidden" name="action" value="update"/>
                <input type="hidden" name="students_id" value="<%= employee.getEmployeeId()%>"/>

                Name : <input type="text" name="name" value="<%= employee.getName() %>"/>

                <br>
                <br>

                Date of Birth : <input type="text" name="dob" value="<%= employee.getDob() %>"/>

                <br>
                <br>

                Address :  <input type="text" name="address" value="<%= employee.getAddress() %>"/>

                <br>
                <br>

                City : <input type="text" name="city" value="<%= employee.getCity()%>"/>

                <br>
                <br>

                State : <input type="text" name="state" value="<%= employee.getState()%>"/>

                <br>
                <br>

                Login ID : <input type="text" name="login_id" value="<%= employee.getLogin_id()%>" />

                <br>
                <br>

                <input type="submit" value="update" class="btn btn-success"/>

            </form>

            <%

                }

            %>
        </center>
    
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
        
    </body>

</html>
