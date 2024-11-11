<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Registration Successful</title>
</head>
<body>
    <center>
        <h1>Registration Successful!</h1>
        <p>You have successfully registered.</p>
        <h2>Employee Details</h2>
        <table border="1" cellpadding="10" cellspacing="0">
            <tr>
                <th>ID</th>
                <td>${employee.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td>${employee.name}</td>
            </tr>
            <tr>
                <th>City</th>
                <td>${employee.city}</td>
            </tr>
            <tr>
                <th>Department</th>
                <td>${employee.dept}</td>
            </tr>
            <tr>
                <th>Salary</th>
                <td>${employee.salary}</td>
            </tr>
        </table>
    </center>
</body>
</html>
