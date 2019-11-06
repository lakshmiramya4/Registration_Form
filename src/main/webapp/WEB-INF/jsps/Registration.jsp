<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<style>
body {
    background-image: url("reg.jpg")
}
</style>
<body >
<form action="reg" method="POST">
<center>
<table>
<h2>REGISTRATION FORM</h2>


<tr>
<td>ID</td>
<td>:</td>
<td><input type="text" name="_id"></td></tr>

<tr>
<td>First Name</td>
<td>:</td>
<td><input type="text" name="first_name"></td></tr>

<tr>
<td>Last Name</td>
<td>:</td>
<td><input type="text" name="last_name"></td></tr>

<tr>
	<td>Gender</td>
	<td>:</td>
	<td><input type="radio" name="gender" value="male" checked> Male
  <input type="radio" name="gender" value="female"> Female</td></tr>

<tr>
<td>Email_Id</td>
<td>:</td>
<td><input type="text" name="email_id"></td></tr>

<tr>
<td>Phone Number</td>
<td>:</td>
<td>
<select>
 <option> 91+</option></select>
<input type="number" name="contact_number"></td></tr>

<tr>
<td>Address</td>
<td>:</td>
<td><input type="text" name="address"></td></tr>

<tr>
<td>User_Name</td>
<td>:</td>
<td><input type="text" name="user_name"></td></tr>

<tr>
<td>Password</td>
<td>:</td>
<td><input type="password" name="password"></td></tr>


<tr>
 <td></td><td><input type="Submit" value="save"></td></tr>



</form>
</table>
${msg}
</center></body>
</html>