<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Details Page</title>
</head>
<body>
    <h1 style="text-align: center;">Details of the Person</h1>

    <!-- Personal Info Section -->
    <p style="text-align: center;"><strong>Name:</strong> ${name}</p>
    <p style="text-align: center;"><strong>Age:</strong> ${age}</p>
    <p style="text-align: center;"><strong>Company:</strong> ${company}</p>

    <hr style="border-top: 1px solid #ccc;">

    <!-- Country List Section -->
    <p style="text-align: center;"><strong>Country Names:</strong></p>
    <ul style="list-style-type: none; padding-left: 0; text-align: center;">
        <c:forEach var="names" items="${country}">
            <li>${names}</li>
        </c:forEach>
    </ul>
    <!-- Subject List Section -->
    <p style="text-align: center;"><strong>Subject Names:</strong></p>
    <ul style="list-style-type: none; padding-left: 0; text-align: center;">
        <c:forEach var="sub" items="${subjects}">
            <li>${sub}</li>
        </c:forEach>
    </ul>
    <!-- Account List Section -->
    <p style="text-align: center;"><strong>Account Names:</strong></p>
    <ul style="list-style-type: none; padding-left: 0; text-align: center;">
        <c:forEach var="acc" items="${accounts}">
            <li>${acc}</li>
        </c:forEach>
    </ul>
    <!-- User List Section -->
    <p style="text-align: center;"><strong>Key Value:</strong></p>
    <ul style="list-style-type: none; padding-left: 0; text-align: center;">
        <c:forEach var="user" items="${user}">
            ${user.key} ==== ${user.value}
        </c:forEach>
    </ul>

    <hr style="border-top: 1px solid #ccc;">

    <!-- Footer -->
    <p style="text-align: center;">&copy; Made With Love by Ishan</p>
</body>
</html>
