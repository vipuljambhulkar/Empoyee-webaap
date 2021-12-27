<%-- 
    Document   : login_page
    Created on : 14-Sep-2021, 1:03:13 AM
    Author     : Sufiyan Salim Akbani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>

        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="description" content="">
        <meta name="author" content="Mark Otto, Jacob Thornton, and Bootstrap contributors">
        <meta name="generator" content="Hugo 0.88.1">
        <title>Login Page</title>

        <link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/sign-in/">



        <!-- Bootstrap core CSS -->
        <link href="../assets/dist/css/bootstrap.min.css" rel="stylesheet">

        <style>
            .bd-placeholder-img {
                font-size: 1.125rem;
                text-anchor: middle;
                -webkit-user-select: none;
                -moz-user-select: none;
                user-select: none;
            }

            @media (min-width: 768px) {
                .bd-placeholder-img-lg {
                    font-size: 3.5rem;
                }
            }
        </style>


        <!-- Custom styles for this template -->
        <link href="CSS/signin.css" rel="stylesheet">

        <%@include file="heading.jsp" %>
    </head>
    <body class="text-center">
        
        
        <main class="form-signin">
            <form action="EmployeeController" method="post">
                <!--                <img class="mb-4" src="../assets/brand/bootstrap-logo.svg" alt="" width="72" height="57">-->
                <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

                <input type="hidden" name="action" value="login" />

                <div class="form-floating">
                    <input type="text" name="login_id" class="form-control" id="floatingInput" placeholder="name@example.com">
                    <label for="floatingInput">Login ID</label>
                </div>
                <div class="form-floating">
                    <input type="password" name="password" class="form-control" id="floatingPassword" placeholder="Password">
                    <label for="floatingPassword">Password</label>
                </div>

                <div class="checkbox mb-3">
                    <label>
                        <input type="checkbox" value="remember-me"> Remember me
                    </label>
                </div>
                <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>

                <p class="text-danger mt-2"> ${param.message} </p>

            </form>
        </main>
    </body>
</html>
