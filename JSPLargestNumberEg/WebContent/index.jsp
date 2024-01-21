<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> JSP Largest Number Example </title>
</head>
<body>

<%
int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
int num3 = Integer.parseInt(request.getParameter("num3"));
if(num1 > num2 && num1 > num3)
out.print("The largest number is" + num1);
else if(num2 > num1 && num2 > num3)
out.print("The largest number is" + num2);
else
out.print("The largest number is" + num3); 
 

%>


</body>
</html>