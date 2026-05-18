// Lab 7a: Execute the following Hello World Servlet Worked Out Example
// Running a Servlet without HTML
//
// Step 1: Create a Dynamic Web Project
// - Open Eclipse
// - File → New → Dynamic Web Project
// - Project Name: SimpleServlet
// - Select Tomcat v9.0 as target runtime
//
// Step 2: Create a Servlet
// - Right-click src folder → New → Servlet
// - Package: com.example
// - Servlet Name: HelloWorldSecond
//
// Step 3: Write a Servlet program to:
// - Display "Hello World!!!" in blue color
// - Display current server date and time in magenta color
// - Generate output directly using servlet (without HTML file)
//
// Step 4: Run the Servlet
// - Right-click project → Run As → Run on Server
// - Select Tomcat v9.0
// - URL: http://localhost:8080/SimpleServlet/HelloWorldSecond


package com.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/HelloWorldSecond")
public class HelloWorldSecond extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public HelloWorldSecond() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2 style='color:blue;'>Hello World!!!</h2>");
        out.println("<p style='color:magenta;'>The server time is: " + new Date() + "</p>");
        out.println("</body></html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
}