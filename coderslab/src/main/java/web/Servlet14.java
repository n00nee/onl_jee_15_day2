package web;

import java.io.IOException;
import java.time.LocalTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "servlet14", urlPatterns = {"/servlet14"})
public class Servlet14 extends HttpServlet{
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				
				response.getWriter().append(request.getRemoteAddr());
				response.getWriter().append(request.getHeader("Host"));
				response.getWriter().append(request.getHeader("User-Agent"));
			}
}
