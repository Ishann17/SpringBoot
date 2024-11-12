<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="ISO-8859-1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Customer</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            min-height: 100vh;
            margin: 0;
            background-color: #f4f4f9;
        }
        
        header {
            background-color: #4CAF50;
            color: white;
            width: 100%;
            text-align: center;
            padding: 1em 0;
        }
        
        .form-container {
            margin-top: 2em;
            width: 300px;
            padding: 20px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
        }
        
        .form-group {
            margin-bottom: 15px;
        }
        
        label {
            display: block;
            font-weight: bold;
            margin-bottom: 5px;
        }
        
        input[type="text"], 
        input[type="number"] {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border-radius: 4px;
            border: 1px solid #ccc;
        }
        
        .submit-button {
            width: 100%;
            padding: 10px;
            background-color: #4CAF50;
            color: white;
            font-weight: bold;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        
        .submit-button:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body>
    <header>
        <h1>Update Customer</h1>
    </header>

    <div class="form-container">
        <form action="/crm/updateCustomer" method="POST">
            <!-- Hidden field for ID -->
            <input type="hidden" name="id" value="${customer.id}">
            
            <div class="form-group">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" name="firstName" value="${customer.firstName}" required>
            </div>
            
            <div class="form-group">
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" name="lastName" value="${customer.lastName}" required>
            </div>
            
            <div class="form-group">
                <label for="mobileNumber">Mobile Number:</label>
                <input type="number" id="mobileNumber" name="mobileNumber" value="${customer.mobileNumber}" required>
            </div>
            
            <div class="form-group">
                <label for="isActive">Active:</label>
                <input type="checkbox" id="isActive" name="isActive" ${customer.isActive ? 'checked' : ''}>
            </div>
            
            <button type="submit" class="submit-button">Update Customer</button>
        </form>
    </div>
</body>
</html>