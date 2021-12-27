<%-- 
   Document   : students
   Created on : 30-Aug-2021, 12:31:27 PM
   Author     : Sufiyan Salim Akbani
--%>


<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>

        <title>Student Registration</title>
        <%@include file="heading.jsp" %>

    </head>

    <body>

        <%@include file="navbar.jsp" %>

    <center>

        <h1>
            Employee Registration
        </h1>

        <hr>

        <div>

            <h3>Registration Form</h3>

            <form method="get" action="EmployeeController">

                <input type="hidden" name="action" value="insert">

                Name : <input type="text" name="name" placeholder="Enter your Full Name">

                <br>
                <br>

                Date of Birth : <input type="date" name="dob" >

                <br>
                <br>

                Gender : 

                Male <input type="radio" name="gender" value="male">
                Female <input type="radio" name="gender" value="female">

                <br>
                <br>
                Address : <textarea name="address" placeholder="Enter Your Current Address"></textarea>

                <br>
                <br>
                
                City : <input type="text" name="city" placeholder="Enter Your City">

                <br>
                <br>
                
                State : <input type="text" name="state" placeholder="Enter Your State">

                <br>
                <br>

                Login ID : <input type="text" name="login_id" placeholder="Create your Login ID">

                <br>
                <br>

                Password : <input type="password" name="password" placeholder="Enter Strong password">

                <br>
                <br>

                <input type="submit" value="Register" class="btn btn-success">

            </form>

        </div>

    </center>

    <%-- <%= request.getParameter("message") %> --%>

    <hr>

    

<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-U1DAWAznBHeqEIlVSCgzq+c9gqGAJn5c/t99JyeKa9xxaYpSvHU5awsuZVVFIhvj" crossorigin="anonymous"></script>

</body>

</html>
