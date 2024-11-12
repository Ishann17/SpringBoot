<%@ page language="java" contentType="text/html; charset=ISO-8859-1" 
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>List Of Customers</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }
        table {
            width: 80%;
            margin: 50px auto;
            border-collapse: collapse;
            background-color: #fff;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
        th {
            background-color: #4CAF50;
            color: white;
        }
        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        tr:hover {
            background-color: #ddd;
        }
        .status {
            padding: 5px;
            font-weight: bold;
            border-radius: 5px;
        }
        .active {
            background-color: #4CAF50;
            color: white;
        }
        .inactive {
            background-color: #f44336;
            color: white;
        }
        .action-button {
        padding: 5px 10px;
        text-decoration: none;
        border-radius: 3px;
        color: white;
        margin: 0 5px;
        font-size: 14px;
    }
    
    .edit {
        background-color: #2196F3;
    }
    
    .delete {
        background-color: #f44336;
    }
    
    .action-button:hover {
        opacity: 0.8;
    }
    </style>
</head>
<body>

<h2 style="text-align: center; padding: 20px; color: #333;">List of Customers</h2>

<table>
    <thead>
        <tr>
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Mobile Number</th>
            <th>Active</th>
             <th>Actions</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="customer" items="${customers}">
            <tr>
                <td>${customer.id}</td>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.mobileNumber}</td>
                <td>
                    <c:choose>
                        <c:when test="${customer.isActive}">
                            <span class="status active">Active</span>
                        </c:when>
                        <c:otherwise>
                            <span class="status inactive">Inactive</span>
                        </c:otherwise>
                    </c:choose>
                </td>
                <td>
                    <a href="/crm/updateCustomer?id=${customer.id}" class="action-button edit">Edit</a>
                    <a href="/crm/deleteCustomer?id=${customer.id}" class="action-button delete" 
                       onclick="return confirm('Are you sure you want to delete this customer?')">Delete</a>
                </td>
            </tr>
        </c:forEach>
    </tbody>
</table>

</body>
</html>
