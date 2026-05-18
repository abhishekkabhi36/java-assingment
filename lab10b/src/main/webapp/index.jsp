<%-- 
10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 
through JSP called index.jsp with client sided validation and submit to the servlet 
called ResultServlet and process all the fields with server sided validation and 
display all the data along with result (Pass if all subjects greater than 40%) 
and Average marks through result.jsp with a link to move to the client side
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>
</head>
<body>

<h2>Enter Student Details</h2>

<form action="processResult" method="post">
    Roll No: <input type="text" name="rollno" required><br/><br/>
    Name: <input type="text" name="name" required><br/><br/>

    Sub1: <input type="number" name="sub1" min="0" max="100" required><br/><br/>
    Sub2: <input type="number" name="sub2" min="0" max="100" required><br/><br/>
    Sub3: <input type="number" name="sub3" min="0" max="100" required><br/><br/>
    Sub4: <input type="number" name="sub4" min="0" max="100" required><br/><br/>
    Sub5: <input type="number" name="sub5" min="0" max="100" required><br/><br/>

    <input type="submit" value="Calculate Result">
</form>

</body>
</html>