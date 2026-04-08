package com.example;

import java.io.IOException;
import javax.servlet.http.*;
import javax.servlet.*;

public class HelloServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest req,
			     HttpServletResponse res) throws ServletException, IOException {

	res.setContentType("text/html")
	res.getWriter().println("<h2>Hello from serlvet</h2")
	res.getWriter().println("<p>Github ->Jenkins->Docker</p>")
		}
}
