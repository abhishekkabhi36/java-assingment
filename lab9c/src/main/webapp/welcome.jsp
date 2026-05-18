<%-- 
9.c Build a Session Management using JSP program for getting session expiry time and 
your name through text box and press submit to display the message by greeting Hello your name!.
Press the following link to check it within the set session time or wait there for the minutes set 
to see the session expiry.
--%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

<%
    String name = request.getParameter("uname");
    int time = Integer.parseInt(request.getParameter("time"));

    // Store in session
    session.setAttribute("user", name);

    // Set user-defined session expiry time
    session.setMaxInactiveInterval(time);
%>

<h2>Hello <%= name %>!</h2>

<p>Session has started.</p>
<p>Your name is stored in session.</p>
<p>Session will expire in <b><%= time %> seconds</b>.</p>

<p>
Click below within the given time or wait to see session expiry:
</p>

<a href="second.jsp">Check Session</a>

</body>
</html>