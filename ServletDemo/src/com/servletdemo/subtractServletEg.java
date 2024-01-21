package com.servletdemo;

import java.io.*;
import java.io.PrintWriter;

import javax.servlet.http.*;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class subtractServletEg extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {

		int num1 = Integer.parseInt(req.getParameter("num1"));
		int num2 = Integer.parseInt(req.getParameter("num2"));
		
		int result = num1 - num2;
		System.out.println("Result = " + result);

		PrintWriter out = res.getWriter();
		out.println("<h1> Result = " + result + "</h1>");
		}

		}
