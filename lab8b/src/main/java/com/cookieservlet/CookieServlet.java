// 8b. Build a servlet program to create a cookie to get your name through text box
// and display:
// "Welcome back <name>! You have visited this page n times"
// along with list of cookies and their values, and demonstrate cookie expiry.
//
// Steps:
// 1. Create Dynamic Web Project
// 2. Create Servlet (CookieServlet)
// 3. Create HTML form
// 4. Display cookies + visit count
// 5. Demonstrate expiry


package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    int count = 0;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);

            // expiry (30 seconds)
            userCookie.setMaxAge(30);

            response.addCookie(userCookie);
        }

        Cookie[] cookies = request.getCookies();
        String existingUser = null;

        out.println("<html><body>");

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    existingUser = c.getValue();
                }
            }
        }

        if (existingUser != null) {
            count++;
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h3>You have visited this page " + count + " times</h3>");
        } else {
            out.println("<h2 style='color:red;'>First Visit! Enter your name</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        // Display all cookies
        out.println("<h3>List of Cookies:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("<p>Name: " + c.getName() + " | Value: " + c.getValue() + "</p>");
            }
        } else {
            out.println("<p>No cookies found</p>");
        }

        // Logout button (delete cookie)
        out.println("<form action='CookieServlet' method='post'>");
        out.println("<input type='submit' value='Delete Cookie (Logout)'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // delete cookie
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        response.sendRedirect("CookieServlet");
    }
}