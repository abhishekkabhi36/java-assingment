/*
10.b Build an Application to get Rollno, Studentname, Sub1, Sub2, Sub3, Sub4 and Sub5 
through JSP called index.jsp with client sided validation and submit to the servlet 
called ResultServlet and process all the fields with server sided validation and 
display all the data along with result (Pass if all subjects greater than 40%) 
and Average marks through result.jsp with a link to move to the client side
*/

package com.result;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet("/processResult")
public class ResultServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");

        int s1 = Integer.parseInt(request.getParameter("sub1"));
        int s2 = Integer.parseInt(request.getParameter("sub2"));
        int s3 = Integer.parseInt(request.getParameter("sub3"));
        int s4 = Integer.parseInt(request.getParameter("sub4"));
        int s5 = Integer.parseInt(request.getParameter("sub5"));

        String message;

        // Server-side validation
        if (rollno == null || rollno.trim().isEmpty() || name == null || name.trim().isEmpty()) {
            message = "Roll No and Name are required!";
        } else {

            int total = s1 + s2 + s3 + s4 + s5;
            double avg = total / 5.0;

            String result = (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) 
                            ? "Pass" : "Fail";

            message = "Result processed successfully";

            request.setAttribute("rollno", rollno);
            request.setAttribute("name", name);
            request.setAttribute("sub1", s1);
            request.setAttribute("sub2", s2);
            request.setAttribute("sub3", s3);
            request.setAttribute("sub4", s4);
            request.setAttribute("sub5", s5);
            request.setAttribute("average", avg);
            request.setAttribute("result", result);
        }

        request.setAttribute("message", message);

        RequestDispatcher rd = request.getRequestDispatcher("/result.jsp");
        rd.forward(request, response);
    }
}