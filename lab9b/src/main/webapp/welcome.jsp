<%-- 
9.b Build a Session Management using JSP program set with one minute session expiry time 
to get your name through text box and press submit to display the message by greeting 
Hello your name!. Check the expiry of the session after one minute.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<body>

<%
    String name = request.getParameter("uname");

    // Store value in session
    session.setAttribute("user", name);

    // Set session expiry to 60 seconds
    session.setMaxInactiveInterval(60);
%>

<h2>Hello <%= name %>!</h2>

<p>Session has started...</p>
<p>Your name has been stored in session object.</p>
<p>Session will expire in <b>1 minute</b>.</p>

<p>
Click below within 1 minute or wait to check session expiry:
</p>

<a href="second.jsp">Display the value</a>

</body>
</html>