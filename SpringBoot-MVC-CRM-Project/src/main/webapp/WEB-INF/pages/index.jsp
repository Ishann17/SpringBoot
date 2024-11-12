<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRM Project</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            min-height: 100vh;
            margin: 0;
            background-color: #f9f9f9;
        }
        header, footer {
            background-color: #4CAF50;
            color: white;
            text-align: center;
            padding: 1em 0;
        }
        main {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            flex: 1;
            gap: 20px;
        }
        .button-container {
            display: flex;
            gap: 15px;
        }
        .link-button {
            padding: 10px 20px;
            background-color: #4CAF50;
            color: white;
            text-decoration: none;
            font-weight: bold;
            border-radius: 5px;
            transition: background-color 0.3s;
        }
        .link-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>

<header>
    <h1>CRM Project Using Spring Boot</h1>
</header>

<main>
    <div class="button-container">
        <a href="/crm/listCustomer" class="link-button" target="_blank">All Customers</a>
        <a href="/crm/saveCustomer" class="link-button" target="_blank">Save Customer</a>
        <!-- <a href="/crm/updateCustomer" class="link-button" target="_blank">Update Customer</a>
        <a href="/crm/deleteCustomer" class="link-button" target="_blank">Delete Customer</a> -->
    </div>
</main>

<footer>
    <p>&copy; Made with love by Ishan</p>
</footer>

</body>
</html>
