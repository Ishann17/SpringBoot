<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Customer Saved</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            margin: 0;
            padding: 20px;
        }
        .container {
            width: 60%;
            max-width: 600px;
            background-color: #f9f9f9;
            padding: 20px;
            border: 1px solid #ddd;
            border-radius: 8px;
            text-align: center;
        }
        h1 {
            color: #4CAF50;
        }
        .details {
            margin-top: 15px;
            font-size: 16px;
        }
        .button {
            margin-top: 20px;
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            border-radius: 5px;
            font-weight: bold;
        }
        .button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Customer Saved Successfully!</h1>
    <div class="details">
        <p><strong>ID:</strong> ${savedCustomer.id}</p>
        <p><strong>First Name:</strong> ${savedCustomer.firstName}</p>
        <p><strong>Last Name:</strong> ${savedCustomer.lastName}</p>
        <p><strong>Mobile Number:</strong> ${savedCustomer.mobileNumber}</p>
        <p><strong>Status:</strong> ${savedCustomer.isActive ? "Active" : "Inactive"}</p>
    </div>
    <a href="/crm" class="button">Back to Home</a>
</div>

</body>
</html>
