package org.eu5.learn_pisio.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getServlet")
public class GetServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String name = req.getParameter("name");
		
		String htmlResponse =
				"<!DOCTYPE html>\n"
				+ "<html>\n"
				+ "\t<head>\n"
				+ "\t\t<meta charset=\"utf-8\" />\n"
				+ "\t\t<title>Hello, Servlet</title>\n"
				+ "\t</head>\n"
				+ "\t<body><h3>Welcome to Servlets!</h3>\n"
				+ "\t\tYour name is " + name + ".\n"
				+ "\t</body>\n"
				+ "</html>";
		PrintWriter writer = resp.getWriter();
		writer.write(htmlResponse);
		
		//writer.write(name);
	}
	
}
