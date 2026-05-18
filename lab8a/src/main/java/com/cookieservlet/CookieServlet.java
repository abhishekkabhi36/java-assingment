// 8a. Build a servlet program to create a cookie to get your name through text box
// and display the message:
// "Welcome back <name>! You have visited this page n times"
// and demonstrate cookie expiry.
//
// Steps:
// 1. Create Dynamic Web Project
// 2. Create Servlet (CookieServlet)
// 3. Use form to accept user name
// 4. Store name in cookie and count visits
// 5. Set expiry time for cookie
// 6. Run on Tomcat server


package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    int count = 0; // visit count

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get username from form
        String userName = request.getParameter("userName");

        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);

            // Cookie expiry (30 seconds)
            userCookie.setMaxAge(30);

            response.addCookie(userCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    existingUser = c.getValue();
                }
            }
        }

        out.println("<html><body>");

        if (existingUser != null) {
            count++;
            out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
            out.println("<h2 style='color:magenta;'>You have visited this page " + count + " times</h2>");
        } else {
            out.println("<h2 style='color:red;'>First time visit! Enter your name</h2>");
            out.println("<form action='CookieServlet' method='get'>");
            out.println("Enter your name: <input type='text' name='userName'>");
            out.println("<input type='submit' value='Submit'>");
            out.println("</form>");
        }

        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Delete cookie (expiry demonstration)
        Cookie cookie = new Cookie("user", "");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        response.sendRedirect("CookieServlet");
    }
}