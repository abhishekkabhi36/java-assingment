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
<title>Session Check</title>
</head>
<body>

<h2>Display the session value</h2>

<%
    String name = (String) session.getAttribute("user");

    if (name == null) {
%>
        <h3>Sorry, the session has ended.</h3>
<%
    } else {
%>
        <h3>Hello <%= name %>!</h3>
<%
    }
%>

</body>
</html>