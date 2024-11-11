<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome Page</title>
</head>
	<body>
		<center>
			 <h1>EMPLOYEE REGISTRATION</h1>
        <form method="post">
            <table border="2">
                <tr>
                    <th>Employee ID :: </th>
                    <td><input type="text" name="id" required></td>
                </tr>
                <tr>
                    <th>Employee Name :: </th>
                    <td><input type="text" name="name" required></td>
                </tr>
                <tr>
                    <th>Employee City :: </th>
                    <td><input type="text" name="city" ></td>
                </tr>
                <tr>
                    <th>Employee Department :: </th>
                    <td><input type="text" name="dept" ></td>
                </tr>
                <tr>
                    <th>Employee Salary :: </th>
                    <td><input type="number" name="salary" step="0.01"></td>
                </tr>
                <tr>
                    <td colspan="2" style="text-align: center;">
                        <button type="submit">Register Employee</button>
                    </td>
                </tr>
            </table>
        </form>
		</center>
	</body>
</html>