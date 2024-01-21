<%@ page language="java" %>
<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Odd/Even Checker</title>
</head>
<body>
    <h1>Odd/Even Checker</h1>

    <form method="post" action="">
        Enter a number: <input type="text" name="number" />
        <input type="submit" value="Check" />
    </form>

    <%-- JSP Scriptlet --%>
    <%
    // Retrieve the value from the textbox
    String numberString = request.getParameter("number");

    if (numberString != null && !numberString.isEmpty()) {
        try {
            // Convert the input to an integer
            int number = Integer.parseInt(numberString);

            // Check if the number is odd or even
            String result = (number % 2 == 0) ? "Even" : "Odd";

            // Display the result
            out.println("<p>The number " + number + " is " + result + ".</p>");
        } catch (NumberFormatException e) {
            // Invalid input, display an error message
            out.println("<p>Invalid input. Please enter a valid number.</p>");
        }
    }
    %>

</body>
</html>
