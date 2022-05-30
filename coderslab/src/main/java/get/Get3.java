package get;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "get3", urlPatterns = {"/get3"})
public class Get3 extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Integer width = Objects.isNull(req.getParameter("width")) ? 5 : Integer.getInteger(req.getParameter("width"));
		Integer height = Objects.isNull(req.getParameter("height")) ? 10 : Integer.getInteger(req.getParameter("height"));
		
		for (int i = 0; i <= height; i++) {
			for (int j = 0; j <= width; j++) {
				resp.getWriter().append(Integer.toString(i*j));
			}
			resp.getWriter().println();
		}
	}
}
