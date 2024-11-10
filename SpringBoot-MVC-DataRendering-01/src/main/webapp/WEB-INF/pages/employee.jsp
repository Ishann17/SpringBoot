<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Page</title>
</head>
<body>

    <h1 style="text-align: center;">Employee Details</h1>

    <!-- Employee Table -->
    <table border="1" cellpadding="10" cellspacing="0" style="margin: 0 auto; text-align: center;">
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>City</th>
                <th>Department</th>
                <th>Salary</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="emp" items="${employees}">
                <tr>
                    <td>${emp.id}</td>
                    <td>${emp.name}</td>
                    <td>${emp.city}</td>
                    <td>${emp.dept}</td>
                    <td>${emp.salary}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <h1 style='color:red; text-align: center;'>Single Employee Data</h1>
    <center>
    	<b>ID :: ${singleEmp.id} </b><br/>
    	<b>Name :: ${singleEmp.name} </b><br/>
    	<b>City :: ${singleEmp.city} </b><br/>
    	<b>Department :: ${singleEmp.dept} </b><br/>
    	<b>Salary :: ${singleEmp.salary} </b>
    </center>
    
    

    <hr style="border-top: 1px solid #ccc;">

    <!-- Footer -->
    <p style="text-align: center;">&copy; Made With Love by Ishan</p>
</body>
</html>
