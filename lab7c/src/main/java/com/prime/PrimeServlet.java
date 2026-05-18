// 7c. Build a servlet program to check whether a given number is prime or not,
// using HTML with error handling for invalid input, with step by step procedure.
//
// Step 1: Create Dynamic Web Project (PrimeCheckDemo)
// Step 2: Create Servlet (PrimeServlet)
// Step 3: Create HTML form (index.html)
// Step 4: Run on Tomcat Server and test


package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));

            if (number < 1) {
                throw new IllegalArgumentException("Enter a positive number greater than 0");
            }

            boolean isPrime = true;

            if (number == 1) {
                isPrime = false;
            } else {
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }

            out.println("<html><body>");
            out.println("<h2>Prime Number Result</h2>");
            out.println("<p>Number: " + number + "</p>");

            if (isPrime) {
                out.println("<p style='color:green;'>It is a Prime Number</p>");
            } else {
                out.println("<p style='color:red;'>It is NOT a Prime Number</p>");
            }

            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</body></html>");

        } catch (NumberFormatException e) {
            displayError(out, "Invalid input! Please enter a valid number.");
        } catch (IllegalArgumentException e) {
            displayError(out, e.getMessage());
        }
    }

    private void displayError(PrintWriter out, String message) {
        out.println("<html><body>");
        out.println("<h2 style='color:red;'>Error</h2>");
        out.println("<p>" + message + "</p>");
        out.println("<a href='index.html'>Try Again</a>");
        out.println("</body></html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}