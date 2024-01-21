package com.factorial;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorialServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        // Retrieve the number entered in the first text box
        String numberString = req.getParameter("number");

        if (numberString != null && !numberString.isEmpty()) {
            try {
                // Convert the input to an integer
                int number = Integer.parseInt(numberString);

                // Calculate the factorial
                long factorial = calculateFactorial(number);

                // Set the response content type
                res.setContentType("text/html");

                // Get the PrintWriter object to write the HTML response
                PrintWriter out = res.getWriter();

         
                out.println("Factorial: <input type='text' value='" + factorial + "' readonly/><br/><br/>");
 
                out.println("The factorial of " + number + " is " + factorial);
                
                // Close the PrintWriter
                out.close();
            } catch (NumberFormatException e) {
                e.printStackTrace();
                res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input. Please enter a valid number.");
            }
        } else {
            res.sendError(HttpServletResponse.SC_BAD_REQUEST, "Number parameter is missing.");
        }
    }

    private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
