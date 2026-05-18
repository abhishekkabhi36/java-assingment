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
    <title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<%
    String msg = (String) request.getAttribute("message");
%>

<p><b><%= msg %></b></p>

<% if(request.getAttribute("rollno") != null) { %>

<p>Roll No: <%= request.getAttribute("rollno") %></p>
<p>Name: <%= request.getAttribute("name") %></p>

<p>Sub1: <%= request.getAttribute("sub1") %></p>
<p>Sub2: <%= request.getAttribute("sub2") %></p>
<p>Sub3: <%= request.getAttribute("sub3") %></p>
<p>Sub4: <%= request.getAttribute("sub4") %></p>
<p>Sub5: <%= request.getAttribute("sub5") %></p>

<p><b>Average: <%= request.getAttribute("average") %></b></p>
<p><b>Result: <%= request.getAttribute("result") %></b></p>

<% } %>

<br/>
<a href="index.jsp">Back to Form</a>

</body>
</html>