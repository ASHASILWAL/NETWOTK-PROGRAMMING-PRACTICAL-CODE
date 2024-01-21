<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> Current Time </title>
</head>
<body>

Current Time : <%= java.util.Calendar.getInstance().getTime() %><br><br>

<%! int data = 50; %>
<%= "Value of the variable is : "+data %><br><br>

<%!
int cube(int n){
	return n* n* n;
}
%>

<%= "Cube of 3 is : " +cube(3) %>

</body>
</html>