package com.LargestNumber;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LargestNumberEg extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		int num3 = Integer.parseInt(req.getParameter("num3"));
		
		PrintWriter out = res.getWriter();
		
		if(num1 > num2 && num1 > num3)
		out.println("The largest number is " + num1);
		else if(num2 > num1 && num2 > num3)
			out.println("The largest number is " + num2);
		else
			out.println("The largest number is " + num3);
		
	}
}
