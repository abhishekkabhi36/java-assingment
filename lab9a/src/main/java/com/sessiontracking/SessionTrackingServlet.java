// 9.a Build a Session Management using Servlet program (without using HTML)
// set with one minute session to show:
// - Session Tracking Information
// - Session ID
// - Session Creation Time
// - Last Access Time
// - Visit Count
//
// Steps:
// 1. Create Dynamic Web Project
// 2. Create Servlet (SessionTrackingServlet)
// 3. Set session timeout to 1 minute
// 4. Display session details
// 5. Run on Tomcat server


package com.sessiontracking;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SessionTracker")
public class SessionTrackingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Create or get session
        HttpSession session = request.getSession(true);

        // Set session timeout (1 minute = 60 seconds)
        session.setMaxInactiveInterval(60);

        // Get session details
        Date createTime = new Date(session.getCreationTime());
        Date lastAccessTime = new Date(session.getLastAccessedTime());
        String sessionId = session.getId();

        // Visit count logic
        Integer visitCount = (Integer) session.getAttribute("visitCount");

        if (visitCount == null) {
            visitCount = 1;
        } else {
            visitCount++;
        }

        session.setAttribute("visitCount", visitCount);

        // Response
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html><body>");
        out.println("<h2>Session Tracking Information</h2>");
        out.println("<p>Session ID: " + sessionId + "</p>");
        out.println("<p>Session Creation Time: " + createTime + "</p>");
        out.println("<p>Last Access Time: " + lastAccessTime + "</p>");
        out.println("<p>Visit Count: " + visitCount + "</p>");
        out.println("<p style='color:red;'>Session expires in 1 minute (60 seconds)</p>");
        out.println("</body></html>");
    }
}