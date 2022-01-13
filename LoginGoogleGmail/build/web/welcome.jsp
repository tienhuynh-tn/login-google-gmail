<%-- 
    Document   : welcome
    Created on : Jan 11, 2022, 12:04:04 PM
    Author     : Tien Huynh - Tien Huynh TN - Huynh Le Thuy Tien
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
    </head>
    <body>
        <h1>Welcome User!</h1>

        <h2>User Information</h2>
        <div>
            <img src="${sessionScope.picture}" alt="Avatar"> <br/>
            Name: ${sessionScope.name} <br/>
            ID:  ${sessionScope.id} <br/>
            Email: ${sessionScope.email}
        </div>
    </body>
</html>
